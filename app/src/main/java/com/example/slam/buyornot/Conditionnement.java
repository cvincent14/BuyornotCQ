package com.example.slam.buyornot;

public class Conditionnement {
    private String condiCode;
    private String condiLibelle;

    public Conditionnement(String condiCode, String condiLibelle) {
        this.condiCode = condiCode;
        this.condiLibelle = condiLibelle;
    }

    public String getCondiCode() {
        return condiCode;
    }

    public void setCondiCode(String condiCode) {
        this.condiCode = condiCode;
    }

    public String getCondiLibelle() {
        return condiLibelle;
    }

    public void setCondiLibelle(String condiLibelle) {
        this.condiLibelle = condiLibelle;
    }
}
