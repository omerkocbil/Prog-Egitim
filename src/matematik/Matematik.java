/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematik;

/**
 *
 * @author jan
 */
public class Matematik {
    
    public int toplama(int toplananİlkSayi, int toplananİkinciSayi) {
        return toplananİlkSayi + toplananİkinciSayi;
    }
    
    public int cikarma(int cikaran, int cikarilan) {
        return cikaran - cikarilan;
    }
    
    /**
     * Bu metot aldığı iki parametreyi birbiri ile çarpmaktadır.
     * 
     * @param carpilanİlkSayi çarpılan ilk sayıyı ifade eder.
     * @param carpilanİkinciSayi çarpılan ikinci sayıyı ifade eder.
     * @return çarpılan iki sayıdan çıkan sonucu döndürür.
     */
    public int carpma(int carpilanİlkSayi, int carpilanİkinciSayi) {
        return carpilanİlkSayi * carpilanİkinciSayi;
    }
    
    public double bolme(double bolunen, double bolen) {
        return bolunen / bolen;
    }
    
    public static int mutlakDeger(int sayi) {
        if(sayi < 0) {
            sayi = sayi * (-1);
        }
        
        return sayi;
    }
    
    public int faktoriyel(int sayi) {
        int sonuc = 1;
        
        for (int i = sayi; i > 0; i--) {
            sonuc = i * sonuc;
        }
        
        return sonuc;
    }
    
    public int ustAlma(int taban, int tavan) {
        int sonuc = 1;
        
        for (int i = 0; i < tavan; i++) {
            sonuc = sonuc * taban;
        }
        
        return sonuc;
    }
    
}
