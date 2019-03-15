package com.example.slam.buyornot;

public class Lieu {
    private int lieuId;
    private String lieuLibelle;

    public Lieu(int lieuId, String lieuLibelle){
        this.lieuId = lieuId;
        this.lieuLibelle = lieuLibelle;
    }

    public int getLieuId() {
        return lieuId;
    }

    public void setLieuId(int lieuId) {
        this.lieuId = lieuId;
    }

    public String getLieuLibelle() {
        return lieuLibelle;
    }

    public void setLieuLibelle(String lieuLibelle) {
        this.lieuLibelle = lieuLibelle;
    }
}
