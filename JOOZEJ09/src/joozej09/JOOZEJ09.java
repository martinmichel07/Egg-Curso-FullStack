/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej09;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author A308763
 */
public class JOOZEJ09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //alta del objeto
        Matematica m1 = new Matematica();
        m1.setNumero1((int) (Math.random() * 10));
        m1.setNumero2((int) (Math.random() * 10));

        //llamo a los metodos por medio de la case servicio        
        MatematicaServicio sm = new MatematicaServicio();
        sm.devolverMayor(m1);
        sm.calcularPotencia(m1);
        sm.calcularRaiz(m1);
    }

}
