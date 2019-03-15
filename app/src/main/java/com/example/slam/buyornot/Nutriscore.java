package com.example.slam.buyornot;

public class Nutriscore {
    private String nutriCode;
    private String nutriLibelle;

    public Nutriscore(String nutriCode, String nutriLibelle){
        this.nutriCode = nutriCode;
        this.nutriLibelle = nutriLibelle;
    }

    public String getNutriCode() {
        return nutriCode;
    }

    public void setNutriCode(String nutriCode) {
        this.nutriCode = nutriCode;
    }

    public String getNutriLibelle() {
        return nutriLibelle;
    }

    public void setNutriLibelle(String nutriLibelle) {
        this.nutriLibelle = nutriLibelle;
    }
}
