package com.example.slam.buyornot;

public class Nova {
    private int novaId;
    private String novaLibelle;

    public Nova(int novaId, String novaLibelle) {
        this.novaId = novaId;
        this.novaLibelle = novaLibelle;
    }

    public int getNovaId() {
        return novaId;
    }

    public void setNovaId(int novaId) {
        this.novaId = novaId;
    }

    public String getNovaLibelle() {
        return novaLibelle;
    }

    public void setNovaLibelle(String novaLibelle) {
        this.novaLibelle = novaLibelle;
    }
}
