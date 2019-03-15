package com.example.slam.buyornot;

public class Categorie {
    private String categorieCode;
    private String categorieLibelle;

    public Categorie(String categorieCode,  String categorieLibelle){
        this.categorieCode = categorieCode;
        this.categorieLibelle = categorieLibelle;
    }

    public String getCategorieCode() {
        return categorieCode;
    }

    public void setCategorieCode(String categorieCode) {
        this.categorieCode = categorieCode;
    }

    public String getCategorieLibelle() {
        return categorieLibelle;
    }

    public void setCategorieLibelle(String categorieLibelle) {
        this.categorieLibelle = categorieLibelle;
    }
}
