package com.example.slam.buyornot;

public class Pays {
    private String paysCode;
    private String paysLibelle;

    public Pays(String paysCode, String paysLibelle){
        this.paysCode = paysCode;
        this.paysLibelle = paysLibelle;
    }

    public String getPaysCode() {
        return paysCode;
    }

    public void setPaysCode(String paysCode) {
        this.paysCode = paysCode;
    }

    public String getPaysLibelle() {
        return paysLibelle;
    }

    public void setPaysLibelle(String paysLibelle) {
        this.paysLibelle = paysLibelle;
    }
}
