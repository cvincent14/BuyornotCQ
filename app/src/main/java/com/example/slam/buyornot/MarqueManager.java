package com.example.slam.buyornot;

import java.util.ArrayList;

public class MarqueManager {
    private int id;
    private String produit;
    private ArrayList<Produit> lesProduits;

    private static final String TABLE_NAME = "marque";
    public static final String KEY_ID_PRODUIT="mar_id";
    public static final String KEY_LIBELLE_PRODUIT="mar_libelle";

}
