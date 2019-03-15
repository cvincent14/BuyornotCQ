package com.example.slam.buyornot;

public class Magasin {
    private String magCode;
    private String magLibelle;

    public Magasin(String magCode, String magLibelle) {
        this.magCode = magCode;
        this.magLibelle = magLibelle;
    }

    public String getMagCode() {
        return magCode;
    }

    public void setMagCode(String magCode) {
        this.magCode = magCode;
    }

    public String getMagLibelle() {
        return magLibelle;
    }

    public void setMagLibelle(String magLibelle) {
        this.magLibelle = magLibelle;
    }
}
