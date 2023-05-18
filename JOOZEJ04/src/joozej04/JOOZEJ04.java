/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej04;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author A308763
 */
public class JOOZEJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instanciamos el servicio
        RectanguloServicio sr = new RectanguloServicio();
        
        //instancio un objeto que retonara los valores por medio del servicio en el alta del objeto rectangulo y lo uso para pasarlo a los metodos de calculo
        Rectangulo r1 = sr.altaRectangulo();
        
        //llamo a los metodos con los calculos
        sr.superficie(r1);
        sr.perimetro(r1);
        sr.dibujoRectangulo(r1);
    }
    
}
