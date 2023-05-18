/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej08;

import Entidad.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author A308763
 */
public class JOOZEJ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadenaServicio sc = new CadenaServicio();
        Cadena c1 = sc.altaFrase();
        sc.mostrarVocales(c1);
        sc.invertirFrase(c1);
        sc.vecesRepetido(c1);
        sc.compararLogitud(c1);
        sc.unirFrases(c1);
        sc.reemplazar(c1);
        sc.contiene(c1);

    }
}

