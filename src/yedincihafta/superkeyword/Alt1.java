/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yedincihafta.superkeyword;


/**
 *
 * @author jan
 */
public class Alt1 extends Ust {
    
    int yas;
    
    public void herhangiMetod() {
        yas = 5;
        super.yas = 9;
        birSeyYap();
        super.birSeyYap();
    }
    
    @Override
    public void birSeyYap() {
        
    }
    
}
