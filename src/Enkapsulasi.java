/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCs Laptop New
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segi P = new Segi();
        P.setpanjang(7);
        P.setlebar(6);
        
        System.out.println("panjang :"+P.getpanjang());
        System.out.println("lebar :"+P.getlebar());
        System.out.println("luas :"+P.getluas());
        
        // TODO code application logic here
    }
    
}
