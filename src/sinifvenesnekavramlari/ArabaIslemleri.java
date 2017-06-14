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
public class ArabaIslemleri {
    
    public static void main(String[] args) {
        Araba kia = new Araba();
        Araba bmw = new Araba(45, "bmw", "720");
        
        kia.hiziArttir(50);
        kia.hiziAzalt(25);
        bmw.hiziAzalt(23);
        
        System.out.println(kia.hiz);
        System.out.println(bmw.hiz);
        System.out.println(bmw.marka);
        System.out.println(bmw.model);
        
    }
    
}
