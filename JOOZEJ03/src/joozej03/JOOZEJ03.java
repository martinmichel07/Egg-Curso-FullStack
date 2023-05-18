/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej03;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author A308763
 */
public class JOOZEJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instancio un objeto de servidio
        OperacionServicio so = new OperacionServicio();
        
        //instancio un objeto de operacion y llamo al metodo para el alte en el servicio
        Operacion o1 = so.crearOperacion();
        
        //llamo a los metodos sumar, restar, multiplicar y dividir pasando por parametro el valor del objeto que me devolvio el alta
        so.sumar(o1);
        so.restar(o1);
        so.multiplicar(o1);
        so.dividir(o1);
    }
    
}
