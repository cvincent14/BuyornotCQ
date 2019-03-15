package com.example.slam.buyornot;

public class Allergene {
    private String allerCode;
    private String allerLibelle;

    public Allergene(String allerCode, String allerLibelle){
        this.allerCode = allerCode;
        this.allerLibelle = allerLibelle;
    }

    public String getAllerCode() {
        return allerCode;
    }

    public void setAllerCode(String allerCode) {
        this.allerCode = allerCode;
    }

    public String getAllerLibelle() {
        return allerLibelle;
    }

    public void setAllerLibelle(String allerLibelle) {
        this.allerLibelle = allerLibelle;
    }
}
