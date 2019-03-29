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
