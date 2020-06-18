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
public class GestorTarifa {
    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorTarifa(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    //Constructor parametrizado
    public GestorTarifa(IParqueadero i){
        parqueadero = i;
    }
    
    //Metodo para consultar la tarifa para carros del parqueadero y devolver el total que debe pagar el cliente
    public Tarifa consultarTarifa(String Horas,String Minutos)throws Exception{
        return parqueadero.consultarTarifa(Horas, Minutos);
    }
    //Metodo para consultar la tarifa para motos del parqueadero y devolver el total que debe pagar el cliente
    public Tarifa consultarTarifaMotos(String Horas,String Minutos)throws Exception{
        return parqueadero.consultarTarifaMotos(Horas, Minutos);
    }
}
