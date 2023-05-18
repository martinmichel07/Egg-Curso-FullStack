/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author A308763
 */
public class Circunferencia {

    //Atributo del objeto circunferencia
    private Double radio;

    //constructor por defecto
    public Circunferencia() {
    }

        
    //constructor por parametro
    public Circunferencia(Double radio) {
        this.radio = radio;
    }

   
    //Metodo Get
    public Double getRadio() {
        return radio;
    }

    //Metodo Set
    public void setRadio(Double radio) {
        this.radio = radio;
    }

}
