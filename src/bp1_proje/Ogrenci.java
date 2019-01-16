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
public class Ogrenci {
    
    private String isim;
    private String soyisim;    
    private long okulNumarasi;
    private int sinifSeviyesi;
    private String sifre;
    
    ArrayList<Ders> dersler = new ArrayList();

    
    public Ogrenci(String isim, String soyisim, long okulNumarasi, int sinifSeviyesi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.okulNumarasi = okulNumarasi;
        this.sinifSeviyesi = sinifSeviyesi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public long getOkulNumarasi() {
        return okulNumarasi;
    }

    public int getSinifSeviyesi() {
        return sinifSeviyesi;
    }

    public void setSinifSeviyesi(int sinifSeviyesi) {
        this.sinifSeviyesi = sinifSeviyesi;
    }
    
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSifre() {
        return sifre;
    }
    
}
