package com.example.slam.buyornot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProduitForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produitform);
    }

    public void send(View view){

    }

    public void back(View view){
        finish();
    }
}
