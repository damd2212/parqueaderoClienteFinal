/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopcliente.negocio;

/**
 *
 * @author danny
 */
public class Vehiculo {
    
    private String PlacaVehiculo;
    private String tipoVehiculo;

    //Constructor parametrizado de la clase Vehiculo
    public Vehiculo(String Placa, String tipoVehiculo) {
        this.PlacaVehiculo = Placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    //Constructor sin parametros de la clase Vehiculo
    public Vehiculo() {
    }

    //Getters y Setters para los atributos de la clase Vehiculo
    public String getPlacaVehiculo() {
        return PlacaVehiculo;
    }

    public void setPlaca(String Placa) {
        this.PlacaVehiculo = PlacaVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
}
