package com.example.slam.buyornot;

public class CodeEmballeur {
    private int emballId;
    private String emballLibelle;

    public CodeEmballeur(int emballId, String emballLibelle){
        this.emballId = emballId;
        this.emballLibelle = emballLibelle;
    }

    public int getEmballId() {
        return emballId;
    }

    public void setEmballId(int emballId) {
        this.emballId = emballId;
    }

    public String getEmballLibelle() {
        return emballLibelle;
    }

    public void setEmballLibelle(String emballLibelle) {
        this.emballLibelle = emballLibelle;
    }
}
