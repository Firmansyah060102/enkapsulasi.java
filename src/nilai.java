/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCs Laptop New
 */
public class nilai {
    private int praktek;
    private int teori;
    
    public int getNilaiPraktek(){
    return praktek;
    }
    public void setNilaiPraktek (int praktek) {
    this.praktek =praktek;
    }
    public int getNilaiTeori () {
    return teori;
    }
    public void setNilaiTeori (int teori) { 
    this.teori =teori;
    }


public nilai (){
int np=0;
int nt=0;
}

public int nilaiAkhir (int np, int nt) {
return (np+nt)/2;
}

public int getnilaiAkhir () {
return nilaiAkhir (praktek, teori);
}
}
