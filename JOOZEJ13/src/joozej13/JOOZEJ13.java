/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej13;

import Entidad.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author A308763
 */
public class JOOZEJ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CursoServicio sc = new CursoServicio();
    
        Curso c1 = sc.crearCurso();
        sc.calcularGananciaSemanal(c1);
    }
    
}
