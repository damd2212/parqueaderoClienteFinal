/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopcliente.negocio;
import co.unicauca.parqueaderospopcliente.acceso.IParqueadero;
import co.unicauca.parqueaderospopcliente.acceso.ParqueaderoServicioImplSockets;
/**
 *
 * @author danny
 */
public class GestorVehiculo {
    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorVehiculo(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    //Constructor parametrizado
    public GestorVehiculo(IParqueadero i){
        parqueadero = i;
    }
    
    //Metodo para consultar los datos del vehiculo o verificar la existencia de un vehiculo en el sistema
    public Vehiculo ConsultarVehiculo(String Placa)throws Exception{
        return parqueadero.consultarVehiculo(Placa);
    }
//    
//    public void registrarVehiculo(String Placa, String TipoVehiculo){
//        this.parqueadero.registrarVehiculo(Placa, TipoVehiculo);
//    }
}
