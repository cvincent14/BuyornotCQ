package com.example.slam.buyornot;
import java.util.ArrayList;

public class Categorie {
    private int id;
    private String libelle;
    private ArrayList<Produit> lesProduits;

    public Categorie() {
    }

    public Categorie(int id, String libelle) {
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

    public ArrayList<Produit> getLesProduits() { return lesProduits; }

    public void setLesProduits(ArrayList<Produit> lesProduits) { this.lesProduits = lesProduits; }

    public void addUnProduit (Produit unProduit) {
        if (lesProduits == null){
            lesProduits = new ArrayList<Produit>();
        }
        lesProduits.add(unProduit);
    }
}
