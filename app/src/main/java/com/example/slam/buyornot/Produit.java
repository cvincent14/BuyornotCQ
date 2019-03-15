package com.example.slam.buyornot;

public class Produit {
    private int produitId;
    private String produitLibelle;
    private String produitIngredient;
    private String produitLien;
    private float produitQuantite;
    private float produitEnergie;
    private float matiereGrasse;
    private float produitAcideGras;
    private float produitGlucide;
    private float produitSucre;
    private float produitFibre;
    private float produitProteine;
    private float produitSel;
    private float produitSodium;

    public Produit(int produitId, String produitLibelle, String produitIngredient, String produitLien,
            float produitQuantite, float produitEnergie, float matiereGrasse, float produitAcideGras,
            float produitGlucide, float produitSucre, float produitFibre, float produitProteine,
            float produitSel, float produitSodium){
        this.produitId = produitId;
        this.produitLibelle = produitLibelle;
        this.produitIngredient = produitIngredient;
        this.produitLien = produitLien;
        this.produitQuantite = produitQuantite;
        this.produitEnergie = produitEnergie;
        this.matiereGrasse = matiereGrasse;
        this.produitAcideGras = produitAcideGras;
        this.produitGlucide = produitGlucide;
        this.produitSucre = produitSucre;
        this.produitFibre = produitFibre;
        this.produitProteine = produitProteine;
        this.produitSel = produitSel;
        this.produitSodium = produitSodium;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    public String getProduitLibelle() {
        return produitLibelle;
    }

    public void setProduitLibelle(String produitLibelle) {
        this.produitLibelle = produitLibelle;
    }

    public String getProduitIngredient() {
        return produitIngredient;
    }

    public void setProduitIngredient(String produitIngredient) {
        this.produitIngredient = produitIngredient;
    }

    public String getProduitLien() {
        return produitLien;
    }

    public void setProduitLien(String produitLien) {
        this.produitLien = produitLien;
    }

    public float getProduitQuantite() {
        return produitQuantite;
    }

    public void setProduitQuantite(float produitQuantite) {
        this.produitQuantite = produitQuantite;
    }

    public float getProduitEnergie() {
        return produitEnergie;
    }

    public void setProduitEnergie(float produitEnergie) {
        this.produitEnergie = produitEnergie;
    }

    public float getMatiereGrasse() {
        return matiereGrasse;
    }

    public void setMatiereGrasse(float matiereGrasse) {
        this.matiereGrasse = matiereGrasse;
    }

    public float getProduitAcideGras() {
        return produitAcideGras;
    }

    public void setProduitAcideGras(float produitAcideGras) {
        this.produitAcideGras = produitAcideGras;
    }

    public float getProduitGlucide() {
        return produitGlucide;
    }

    public void setProduitGlucide(float produitGlucide) {
        this.produitGlucide = produitGlucide;
    }

    public float getProduitSucre() {
        return produitSucre;
    }

    public void setProduitSucre(float produitSucre) {
        this.produitSucre = produitSucre;
    }

    public float getProduitFibre() {
        return produitFibre;
    }

    public void setProduitFibre(float produitFibre) {
        this.produitFibre = produitFibre;
    }

    public float getProduitProteine() {
        return produitProteine;
    }

    public void setProduitProteine(float produitProteine) {
        this.produitProteine = produitProteine;
    }

    public float getProduitSel() {
        return produitSel;
    }

    public void setProduitSel(float produitSel) {
        this.produitSel = produitSel;
    }

    public float getProduitSodium() {
        return produitSodium;
    }

    public void setProduitSodium(float produitSodium) {
        this.produitSodium = produitSodium;
    }
}
