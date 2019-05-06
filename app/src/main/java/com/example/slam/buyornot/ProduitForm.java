package com.example.slam.buyornot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ProduitForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produitform);
    }

    public void ajout(View view){
        try {
            String libelle = ((EditText) (findViewById(R.id.formLibelle))).getText().toString();
            Long codeBarre = Long.valueOf(((EditText) findViewById(R.id.formCodeBarre)).getText().toString());
            String ingredient = ((EditText) findViewById(R.id.formIngredient)).getText().toString();
            String lien = ((EditText) findViewById(R.id.formLien)).getText().toString();
            float sodium = Float.valueOf((((EditText) (findViewById(R.id.formSodium))).getText().toString()));
            float fruitsLegumes = Float.valueOf((((EditText) (findViewById(R.id.formFruitsLegumes))).getText().toString()));
            float energie = Float.valueOf((((EditText) (findViewById(R.id.formEnergie))).getText().toString()));
            float matiereGrasse = Float.valueOf((((EditText) (findViewById(R.id.formMatiereGrasse))).getText().toString()));
            float acideGras = Float.valueOf((((EditText) (findViewById(R.id.formAcideGras))).getText().toString()));
            float glucide = Float.valueOf((((EditText) (findViewById(R.id.formGlucide))).getText().toString()));
            float sucre = Float.valueOf((((EditText) (findViewById(R.id.formSucre))).getText().toString()));
            float fibre = Float.valueOf((((EditText) (findViewById(R.id.formFibre))).getText().toString()));
            float proteine = Float.valueOf((((EditText) (findViewById(R.id.formProteine))).getText().toString()));
            float sel = Float.valueOf((((EditText) (findViewById(R.id.formSel))).getText().toString()));
            int quantite = Integer.parseInt(((EditText) findViewById(R.id.formQuantite)).getText().toString());
            int nutriscore = 0;

            Produit unProduit = new Produit(libelle,codeBarre,quantite,ingredient,energie,matiereGrasse,acideGras,glucide,sucre,proteine,sel,sodium,nutriscore,fruitsLegumes,fibre);
            //connexion a la bdd
            ProduitManager bdd = new ProduitManager(this);
            bdd.open();
            //insertion dans la base
            bdd.addProduit(unProduit);

            bdd.close();
            finish();
        }catch (Exception error){
            Toast.makeText(getApplicationContext(), "Veuillez remplir tous les champs", Toast.LENGTH_LONG).show();
        }
    }

    public void back(View view){
        finish();
    }
}
