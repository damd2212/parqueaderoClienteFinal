/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopcliente.acceso;

import co.unicauca.parqueaderospopcliente.negocio.Parqueadero;
import co.unicauca.parqueaderospopcliente.negocio.Persona;
import co.unicauca.parqueaderospopcliente.negocio.RegVehiculo;
import co.unicauca.parqueaderospopcliente.negocio.Tarifa;
import co.unicauca.parqueaderospopcliente.negocio.Vehiculo;

/**
 *Interfaz con todos los metodos que seran implementados en la clase
 * parqueaderoServiciospopcliente
 */
public interface IParqueadero {
    public void ingresarRegVehiculo(String numFicha,String Placa, String TipoVehiculo,String HoraFechaEntrada,String EstadoVehiculo,String Llaves,String NumCascos,String NitParqueadero,String NumCasillero,String Usuario,String HoraFechaSalida);
    public Vehiculo consultarVehiculo(String Placa)throws Exception;
    public RegVehiculo consultarRegVehiculoPlaca(String Placa)throws Exception;
    public RegVehiculo consultarRegVehiculoFicha(String Ficha)throws Exception;
    public void actualizarRegVehiculo(String Placa,String HoraFechaSalida);
    public int getCambio();
    public void setCambio(int c);
    public Tarifa consultarTarifa(String Horas,String Minutos)throws Exception;
    public Parqueadero consultarParqueadero(String Usuario)throws Exception;
    public Tarifa consultarTarifaMotos(String Horas,String Minutos)throws Exception;
    public Persona consultarPersona(String Usuario,String Contraseña)throws Exception;    
    
}
