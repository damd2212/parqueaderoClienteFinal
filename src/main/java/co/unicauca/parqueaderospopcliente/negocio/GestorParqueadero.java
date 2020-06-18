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
public class GestorParqueadero {
    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorParqueadero(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    //Constructor con parametros
    public GestorParqueadero(IParqueadero i){
        parqueadero=i;
    }
    
    //Busca al parqueadero en le servidor
    public Parqueadero consultarParqueadero(String Usuario)throws Exception{
        return parqueadero.consultarParqueadero(Usuario);
    }
    
}
