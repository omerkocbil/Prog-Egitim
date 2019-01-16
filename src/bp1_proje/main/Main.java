/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp1_proje.main;

import bp1_proje.Ders;
import bp1_proje.Istatistik;
import bp1_proje.Matematik;
import bp1_proje.Ogrenci;
import bp1_proje.Ogretmen;
import bp1_proje.Programlama;
import bp1_proje.Sistem;

/**
 *
 * @author jan
 */
public class Main {
    
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Ömer", "Koçbil", 132, 4);
        ogrenci.setSifre("ali");
        
        Ogretmen ogretmen = new Ogretmen("Ebubekir", "Koç");
        ogretmen.setSifre("okul");
        
        Ders matematik = new Matematik(ogretmen);
        Ders programlama = new Programlama(ogretmen);
        Ders istatistik = new Istatistik(ogretmen);
        
        
        Sistem.kayitOl(ogrenci);
        System.out.println(Sistem.ogrenciSifreleri.get(0));
        Sistem.girisYap(ogrenci.getOkulNumarasi(), ogrenci.getSifre());
        
        Sistem.kayitOl(ogretmen);
        Sistem.girisYap(ogretmen.getSifre());
        
        Sistem.dersEkle(ogrenci, matematik);
        Sistem.dersEkle(ogrenci, programlama);
        Sistem.dersEkle(ogrenci, istatistik);
        
        //System.out.println(ogrenci.dersler.get(0));
    }
    
}
