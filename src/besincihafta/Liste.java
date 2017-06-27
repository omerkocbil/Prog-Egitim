/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besincihafta;

import java.util.ArrayList;

/**
 *
 * @author jan
 */
public class Liste {
    
    static ArrayList liste = new ArrayList();
    
    public static void main(String[] args) {
        Liste.liste.add(5);
        Liste.liste.add("sda");
        Liste.liste.add(5.8);
        
        for (int i = 0; i < Liste.liste.size(); i++) {
            System.out.println(Liste.liste.get(i));
        }
    }
    
}
