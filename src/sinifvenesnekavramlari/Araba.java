/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinifvenesnekavramlari;

/**
 *
 * @author jan
 */
public class Araba {
    
    Araba() {
        
    }
    
    public Araba(int hiz, String marka, String model) {
        this.hiz = hiz;
        this.marka = marka;
        this.model = model;
    }
    
    public static int hiz = 100;
    public String marka;
    public String model;
    
    public void hiziArttir(int artisMiktari) {
        hiz = hiz + artisMiktari;
    }
    
    public void hiziAzalt(int azalisMiktari) {
        hiz = hiz - azalisMiktari;
    }
    
}
