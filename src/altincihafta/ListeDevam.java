/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altincihafta;

import java.util.ArrayList;

/**
 *
 * @author jan
 */
public class ListeDevam {
    
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList();
        
        liste.add(67);
        Integer ilkEleman = liste.get(0);
        System.out.println(ilkEleman);
        
        liste.add(0, 45);
        Integer yeniIlkEleman = liste.get(0);
        System.out.println(yeniIlkEleman);
    }
    
}
