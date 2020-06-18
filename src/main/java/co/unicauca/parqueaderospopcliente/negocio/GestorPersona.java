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
public class GestorPersona {

    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorPersona() {
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    
    //Constructor parametrizado
    public GestorPersona(IParqueadero i) {
        parqueadero = i;
    }
    
    //Consulta a un usuario dependiendo del user y contraseña que ingrese
    public Persona consultarPersona(String Usuario, String Contraseña) throws Exception {
        return parqueadero.consultarPersona(Usuario, Contraseña);
    }
}
