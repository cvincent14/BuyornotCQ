package com.example.slam.buyornot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Produit unProduit = new Produit("Fromage", 3336590083787L, 100, "lait", 10, 10, 10, 10, 10, 10, 10, 10, 11,10, 10);

        ProduitManager produitmanager = new ProduitManager(this);
        produitmanager.open();

        produitmanager.addProduit(unProduit);

        produitmanager.close();*/
    }

    public void afficheliste(View view){
        Intent intent = new Intent(this, ProduitListe.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void back(View view){
        finish();
    }
}
