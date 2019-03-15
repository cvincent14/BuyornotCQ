package com.example.slam.buyornot;

public class Additif {
    private int addiId;
    private String addiLibelle;

    public Additif(int addiId, String addiLibelle) {
        this.addiId = addiId;
        this.addiLibelle = addiLibelle;
    }

    public int getAddiId() {
        return addiId;
    }

    public void setAddiId(int addiId) {
        this.addiId = addiId;
    }

    public String getAddiLibelle() {
        return addiLibelle;
    }

    public void setAddiLibelle(String addiLibelle) {
        this.addiLibelle = addiLibelle;
    }
}
