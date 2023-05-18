/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jherenciateoria02;

/**
 *
 * @author A308763
 */
public class JHERENCIATEORIA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Saludable s = new Saludable() {
            
            @Override
            public void saludar() {
                System.out.println("Hola!! te saludos desde un objeto de una interface");
            }
        };
        s.saludar();
        
    }
    
}
