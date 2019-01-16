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
public class Ogretmen {
    
    private String isim;
    private String soyisim;
    private String sifre;
    ArrayList<Ders> dersler = new ArrayList();

    public Ogretmen(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
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

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
}
