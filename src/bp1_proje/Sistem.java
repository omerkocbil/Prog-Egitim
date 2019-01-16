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
public class Sistem {
    
    public static ArrayList<Long> okulNumaralari = new ArrayList();
    public static ArrayList<String> ogrenciSifreleri = new ArrayList();
    public static ArrayList<String> ogretmenSifreleri = new ArrayList();
    
    
    public static boolean kayitOl(Ogretmen ogretmen) {
        boolean kayitBasariliMi = true;
        
        for (int i = 0; i < ogretmenSifreleri.size(); i++) {
            if (ogretmen.getSifre().equals(ogretmenSifreleri.get(i))) {
                kayitBasariliMi = false;
            }
        } 
        
        if (kayitBasariliMi) {
            ogretmenSifreleri.add(ogretmen.getSifre());
        }
        
        return kayitBasariliMi;
    }
    
    public static boolean kayitOl(Ogrenci ogrenci) {
        boolean kayitBasariliMi = true;
        
        for (int i = 0; i < okulNumaralari.size(); i++) {
            if (ogrenci.getOkulNumarasi() == okulNumaralari.get(i)) {
                kayitBasariliMi = false;
            }
        } 
        
        if (kayitBasariliMi) {
            okulNumaralari.add(ogrenci.getOkulNumarasi());
            ogrenciSifreleri.add(ogrenci.getSifre());
        }
        
        return kayitBasariliMi;
    }
    
    public static boolean girisYap(long okulNumarasi, String sifre) {
        boolean girisBasariliMi = false;
        
        for (int i = 0; i < okulNumaralari.size(); i++) {
            if (okulNumarasi == okulNumaralari.get(i)) {
                if (sifre.equals(ogrenciSifreleri.get(i))) {
                    girisBasariliMi = true;
                    break;
                }
            }
        }
        
        return girisBasariliMi;
    }
    
    public static boolean girisYap(String sifre) {
        boolean girisBasariliMi = false;
        
        for (int i = 0; i < ogretmenSifreleri.size(); i++) {            
            if (sifre.equals(ogretmenSifreleri.get(i))) {
                girisBasariliMi = true;
                break;
            }
            
        }
        
        return girisBasariliMi;
    }
    
    public static void dersEkle(Ogrenci ogrenci, Ders ders) {       
        if (ders instanceof Matematik) {
            ogrenci.dersler.add(ders);  
            
            Matematik.ogrenciler.add(ogrenci);
        }
        else if (ders instanceof Programlama) {
            ogrenci.dersler.add(ders);    
            
            Programlama.ogrenciler.add(ogrenci);
        }
        else if (ders instanceof Istatistik) {
            ogrenci.dersler.add(ders);  
            
            Istatistik.ogrenciler.add(ogrenci);
        }
    }
    
}
