package com.example.slam.buyornot;

public class Marque {
    private String marqueCode;
    private String marqueLibelle;

    public Marque(String marqueCode, String marqueLibelle){
        this.marqueCode = marqueCode;
        this.marqueLibelle = marqueLibelle;
    }

    public String getMarqueCode() {
        return marqueCode;
    }

    public void setMarqueCode(String marqueCode) {
        this.marqueCode = marqueCode;
    }

    public String getMarqueLibelle() {
        return marqueLibelle;
    }

    public void setMarqueLibelle(String marqueLibelle) {
        this.marqueLibelle = marqueLibelle;
    }
}
