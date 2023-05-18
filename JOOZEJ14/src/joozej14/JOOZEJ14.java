/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej14;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author A308763
 */
public class JOOZEJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MovilServicio sm = new MovilServicio();
        Movil m1 = sm.cargarCelular();
        sm.ingresarCodigo(m1);
        sm.mostrarCelular(m1);
    }
    
}
