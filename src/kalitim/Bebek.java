/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalitim;

/**
 *
 * @author jan
 */
public class Bebek extends Insan {
    
    public void agla() {
        System.out.println(isim + " ağlıyor");
    }
    
    @Override
    public void nefesAl() {
        System.out.println(isim + " nefes almayı kesmemeli");
    }
    
}
