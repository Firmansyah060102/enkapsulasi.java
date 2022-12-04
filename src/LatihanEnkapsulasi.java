/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCs Laptop New
 */
public class LatihanEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       nilai n =new nilai();
       n.setNilaiPraktek (200);
       n.setNilaiTeori (348);

System.out.println("nilai praktek: "+n.getNilaiPraktek());
System.out.println("nilai teori: "+n.getNilaiTeori());
System.out.println("nilai akhir: "+n.getnilaiAkhir());
        // TODO code application logic here
    }
    
}
