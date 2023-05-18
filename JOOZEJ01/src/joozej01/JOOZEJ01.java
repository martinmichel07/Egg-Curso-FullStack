/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej01;

import Entidad.Libro;
import Servicio.LibroService;

/**
 *
 * @author A308763
 */
public class JOOZEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instancio un objeto de tipo servicio para poder acceder
        LibroService ls = new LibroService();
        
        //instanciamos el objeto para cargar los datos
        Libro l1 = ls.altaLibro();
        //llamamos al metodo para mostrar el contenido del objeto
        ls.mostrarLibro(l1);
    }
    
}
