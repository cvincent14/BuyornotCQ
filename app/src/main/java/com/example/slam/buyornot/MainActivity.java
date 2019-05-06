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
    }

    //affiche la page lister les produits
    public void afficheliste(View view){
        Intent intent = new Intent(this, ProduitListe.class);
        startActivity(intent);
    }

    public void back(View view){
        finish();
    }
}
