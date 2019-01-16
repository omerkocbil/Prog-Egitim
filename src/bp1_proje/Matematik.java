/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_proje;

import java.util.ArrayList;

/**
 *
 * @author jan
 */
public class Matematik extends Ders {
    
    private static final String dersKodu = "MT101";
    private Ogretmen hoca;
    
    public Matematik() {
        
    }
    
    public Matematik(Ogretmen hoca) {
        this.hoca = hoca;
    }
    
    @Override
    public void dersMufredati() {
        System.out.println("");
    }
    
    public String getDersKodu() {
        return dersKodu;
    }
      
}
