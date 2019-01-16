/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_proje;

/**
 *
 * @author jan
 */
public class Istatistik extends Ders {
 
    private static final String dersKodu = "IS217";
    private Ogretmen hoca;
    
    public Istatistik() {
        
    }
    
    public Istatistik(Ogretmen hoca) {
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
