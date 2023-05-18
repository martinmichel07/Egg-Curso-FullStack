/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author A308763
 */
public class RevolverDeAgua {
    private int pocicionActual;
    private int pocicionDeAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int pocicionActual, int pocicionDeAgua) {
        this.pocicionActual = pocicionActual;
        this.pocicionDeAgua = pocicionDeAgua;
    }

    public int getPocicionActual() {
        return pocicionActual;
    }

    public void setPocicionActual(int pocicionActual) {
        this.pocicionActual = pocicionActual;
    }

    public int getPocicionDeAgua() {
        return pocicionDeAgua;
    }

    public void setPocicionDeAgua(int pocicionDeAgua) {
        this.pocicionDeAgua = pocicionDeAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "pocicionActual=" + pocicionActual + ", pocicionDeAgua=" + pocicionDeAgua + '}';
    }
    
    
    
}
