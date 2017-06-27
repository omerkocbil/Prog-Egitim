/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besincihafta;

/**
 *
 * @author jan
 */
public class Ornekler {
    
    public int sayi; // instance değişken
    
    public void ornekMetod() {
        int sayi = 12; // local değişken
        int sonuc = sayi + this.sayi;
        System.out.println(sonuc);
        this.sayi = 67;
    }
    
    public void ornekMetod2() {
        int sonuc = this.sayi + 5;
        System.out.println(sonuc);
    }
    
    public void ornekMetod(int sayi) {
        
    }
    
}
