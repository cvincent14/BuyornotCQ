package com.example.slam.buyornot;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class Additif {
    private int id;
    private String fonction;
    private String description;
    private String origine;
    private String risques;
    private ArrayList<Additif> lesAdditifs;
    private ArrayList<Produit> lesProduits;

    public Additif() {
    }

    public Additif(int id, String produit) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getRisques() {
        return risques;
    }

    public void setRisques(String risques) {
        this.risques = risques;
    }

    public ArrayList<Additif> getContient() {
        return lesAdditifs;
    }

    public void setContient(ArrayList<Additif> contient) {
        lesAdditifs = contient;
    }

    public void addUnAdditif (Additif unAdditif) {
        if (lesProduits == null){
            lesAdditifs = new ArrayList<Additif>();
        }
        lesAdditifs.add(unAdditif);
    }

    public ArrayList<Produit> getLesProduits() { return lesProduits; }

    public void setLesProduits(ArrayList<Produit> lesProduits) { this.lesProduits = lesProduits; }

    public void addUnProduit (Produit unProduit) {
        if (lesProduits == null){
            lesProduits = new ArrayList<Produit>();
        }
        lesProduits.add(unProduit);
    }
}
