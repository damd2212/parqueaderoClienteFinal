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
public class GestorRegVehiculo {
    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorRegVehiculo(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    
    //Constructor parametrizado
    public GestorRegVehiculo(IParqueadero i){
        parqueadero = i;
    }
    
    //Crea un nuevo registro y lo para al servidor
    public void ingresarRegVehiculo(String numFicha,String Placa, String TipoVehiculo,String HoraFechaEntrada,String EstadoVehiculo,String Llaves,String NumCascos,String NitParqueadero,String NumCasillero,String Usuario,String HoraFechaSalida){
        this.parqueadero.ingresarRegVehiculo(numFicha, Placa, TipoVehiculo, HoraFechaEntrada, EstadoVehiculo, Llaves, NumCascos, NitParqueadero, NumCasillero,Usuario,HoraFechaSalida);
    }
    
    //Consulta los datos de un registro de vehiculo dependiendo de la placa que se ingrese
    public RegVehiculo consultarRegVehiculoPlaca(String Placa)throws Exception{
        return parqueadero.consultarRegVehiculoPlaca(Placa);
    }
    
    //Consulta los datos de un registro de vehiculo dependiendo del numero de ficha que se ingrese
    public RegVehiculo consultarRegVehiculoFicha(String Ficha)throws Exception{
        return parqueadero.consultarRegVehiculoFicha(Ficha);
    }
    
    //Actualiza el esta del vehiculo que ya fue ingresado
    public void actualizarRegVehiculo(String Placa,String HoraFechaSalida) {
       this.parqueadero.actualizarRegVehiculo(Placa, HoraFechaSalida);
   }
    
}
