package com.example.slam.buyornot;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class ProduitListe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produitliste);
    }

    public void addproduit(View view) {
        Intent intent = new Intent(this, ProduitForm.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void consulteproduit(View view) {
        Intent intent = new Intent(this, ProduitConsulter.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void back(View view){
        finish();
    }

}
