/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import Entidades.Vendedor;
import Servicio.VenderorServicio;

/**
 *
 * @author A308763
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //invocamos por medio de las entidades y clases de servicios, utilizando tanto las estructuras definidas en los objetos como en las estructuras definidas en los servicios
        
        //instancio un objetio de tipo servicio opara poder acceder
        VenderorServicio vs = new VenderorServicio(); 
        //instanciacion del objeto para alojar el retorno de lo que construimos en la calse de servicios (el metodo altaVendedor retorna un objeto v1 con todos sus atribubos llenos) 
        Vendedor v1 = vs.altaVendedor(); 
        //llamos a los metodos de la clase Service pasandole por parametros el ojbejo v1 para hacer los calculos
        vs.SueldoMensual(v1); 
        vs.vacaciones(v1);
    }
    
}
