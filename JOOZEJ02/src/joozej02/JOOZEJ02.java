/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej02;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author A308763
 */
public class JOOZEJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instancio un objeto del tipo de servicio circunferencia
        CircunferenciaServicio sc = new CircunferenciaServicio();
        
        //instancio un objeto de circunferencia para alojar los datos
        Circunferencia c1 = sc.crearCircunferencia();
        
        //llamo al metodo en el servicio para calcular el area
        sc.area(c1);
        
        //llamo al metodo en el servicio para calcular el perimetro
        sc.perimetro(c1);
    }
    
}
