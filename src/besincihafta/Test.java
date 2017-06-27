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
public class Test {
    
    public static void main(String[] args) {
        DiziIslemleri diziIslemleri = new DiziIslemleri();
        diziIslemleri.diziyeElemanAta();
        System.out.println(diziIslemleri.dizi[2]);
        System.out.println("-----------------");
        diziIslemleri.degiskeneDegerAta();
        System.out.println(diziIslemleri.sayi);
        
        System.out.println("-----------------");
        
        Ornekler ornek = new Ornekler();
        ornek.ornekMetod();
        ornek.ornekMetod2();
    }
    
}
