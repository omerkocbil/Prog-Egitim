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
public class LiteralIfadeler {
    
    public String kelime = "Programlama";
    public String cumle = new String("Ali bugün okula gitti");
    public String s = "";
    
    public LiteralIfadeler ornekMetod() {
        LiteralIfadeler ifadeler = new LiteralIfadeler();
        return ifadeler;
    }
    
    public static void main(String[] args) {
        LiteralIfadeler ifadeler = new LiteralIfadeler();
        System.out.println(ifadeler.cumle.equals("Ahmet"));
        System.out.println(ifadeler.cumle.contains("okula"));
        System.out.println(ifadeler.kelime.length());
        System.out.println(ifadeler.kelime.toUpperCase());
        System.out.println(ifadeler.s.isEmpty());       
    }
    
}
