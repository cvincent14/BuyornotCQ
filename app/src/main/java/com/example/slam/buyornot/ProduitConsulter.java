package com.example.slam.buyornot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProduitConsulter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produitconsulter);
    }

    public void back(View view){
        finish();
    }
}
