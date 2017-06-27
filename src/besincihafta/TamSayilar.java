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
public class TamSayilar {
    
    Integer sayi = new Integer(5);
    Integer sayi2;
    Integer sayi3 = 6;
    
    public static void main(String[] args) {
        TamSayilar tamSayilar = new TamSayilar();
        System.out.println(tamSayilar.sayi.doubleValue());
        Integer i = Integer.valueOf("678");
        System.out.println(i);
        System.out.println(Integer.max(56, 45));
    }
    
}
