/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yedincihafta.cast;

/**
 *
 * @author jan
 */
public class Hayvan {
    
    public static void yemekYe(Hayvan hayvan) {
        if (hayvan instanceof Kopek) {
            System.out.println("Köpek maması yesin");
            // ((Kopek)hayvan)  downcast
        }
        else if (hayvan instanceof Kedi){
            System.out.println("Kedi maması yesin");
            // ((Kedi)hayvan)   downcast
        } 
    }
    
}
