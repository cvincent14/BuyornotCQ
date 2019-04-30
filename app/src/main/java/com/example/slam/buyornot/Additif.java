package com.example.slam.buyornot;

import java.util.ArrayList;

public class Additif {
    private int id;
    private String produit;
    private ArrayList<Produit> lesProduits;

    public Additif() {
    }

    public Additif(int id, String produit) {
        this.id = id;
        this.produit = produit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
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
