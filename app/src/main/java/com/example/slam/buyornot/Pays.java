package com.example.slam.buyornot;

import java.util.ArrayList;

public class Pays {
    private int id;
    private String libelle;
    private ArrayList<Produit> lesProduitsOriginaires;
    private ArrayList<Produit> lesProduitsVendus;

    public Pays(){}
    public Pays(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ArrayList<Produit> getLesProduitsOriginaires() { return lesProduitsOriginaires; }

    public void setLesProduitsOriginaires(ArrayList<Produit> lesProduitsOriginaires) { this.lesProduitsOriginaires = lesProduitsOriginaires; }

    public void addUnProduitOriginaire (Produit unProduit) {
        if (lesProduitsOriginaires == null){
            lesProduitsOriginaires = new ArrayList<Produit>();
        }
        lesProduitsOriginaires.add(unProduit);
    }

    public ArrayList<Produit> getLesProduitsVendus() { return lesProduitsVendus; }

    public void setLesProduitsVendus(ArrayList<Produit> lesProduitsVendus) { this.lesProduitsVendus = lesProduitsVendus; }

    public void addUnProduitVendu (Produit unProduit) {
        if (lesProduitsVendus == null){
            lesProduitsVendus = new ArrayList<Produit>();
        }
        lesProduitsVendus.add(unProduit);
    }
}
