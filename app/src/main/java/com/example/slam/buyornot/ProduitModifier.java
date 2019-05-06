package com.example.slam.buyornot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class ProduitModifier extends AppCompatActivity {
    private int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produitmodifier);
        Intent intent = getIntent();

        // vérifie qu'une valeur est associée à la clé “id”
        id = intent.getIntExtra("id",-1);

        // nouveau produit
        Produit unProduit = new Produit();
        //preparation de la connexion a la base
        ProduitManager produitmanager = new ProduitManager(this);

        produitmanager.open();
        unProduit = produitmanager.getProduit(id);
        produitmanager.close();

        EditText libelleProduit = (EditText) findViewById(R.id.contentNom);
        libelleProduit.setText(unProduit.getLibelle());

        EditText codeBarreProduit = (EditText) findViewById(R.id.contentCodeBarre);
        long codeB = unProduit.getCodeBarre();
        codeBarreProduit.setText(Long.toString(codeB));
/*
        EditText marque = (EditText) findViewById(R.id.marque);
        marque.setText(unProduit.getMarque().getProduit());
*/
        EditText quantite = (EditText) findViewById(R.id.contentQuantite);
        quantite.setText(Integer.toString(unProduit.getQuantite()));
/*
        EditText conditionnement = (EditText) findViewById(R.id.conditionnement);
        conditionnement.setText(unProduit.getConditionnement().getLibelle());

        EditText categories = (EditText) findViewById(R.id.categories);
        Categorie lesCategories = unProduit.getCategories();
        String libCategories = "";

        //boucle pour concatener les libelles des categories en une variable
        categories.setText(libCategories);

        EditText origineIngredients = (EditText) findViewById(R.id.origineIngredients);
        ArrayList<LieuxDeFabrication> lesPaysOrigine = unProduit.getLieuxDeFabrication();
        String libPaysOrigine = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        origineIngredients.setText(libPaysOrigine);

        EditText paysDeVente = (EditText) findViewById(R.id.paysDeVente);
        ArrayList<Pays> lesPaysVente = unProduit.getPaysVente();
        String libPaysVente = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        paysDeVente.setText(libPaysVente);

        EditText nova = (EditText) findViewById(R.id.nova);
        nova.setText(unProduit.getNova().getLibelle);

        EditText nutriscore = (EditText) findViewById(R.id.nutriscore);
        nutriscore.setText(Integer.toString(unProduit.getNutriscore()));
*/
        EditText ingredients = (EditText) findViewById(R.id.contentIngredient);
        ingredients.setText(unProduit.getIngredients());
/*
        EditText allergenes = (EditText) findViewById(R.id.allergenes);
        ArrayList<Allegene> lesAllergenes = unProduit.getAllergenes();
        String libAllergenes = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        allergenes.setText(libAllergenes);

        EditText additifs = (EditText) findViewById(R.id.additifs);
        ArrayList<Additif> lesAdditifs = unProduit.getAdditifs();
        String libAdditifs = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        additifs.setText(libAdditifs);

        EditText tauxFruitsLegum = (EditText) findViewById(R.id.tauxFruitsLegum);
        tauxFruitsLegum.setText(Integer.toString(unProduit.getFruitsLegumes()));

        //Reperes nutritionnels
*/
        EditText energie = (EditText) findViewById(R.id.contentEnergie);
        energie.setText(Float.toString(unProduit.getEnergie()));

        EditText matatiereGrass = (EditText) findViewById(R.id.contentMatiereGrasse);
        matatiereGrass.setText(Float.toString(unProduit.getMatiereGrasse()));

        EditText acidesGrasStatures = (EditText) findViewById(R.id.contentAcideGras);
        acidesGrasStatures.setText(Float.toString(unProduit.getAcidesGras()));

        EditText glucides = (EditText) findViewById(R.id.contentGlucide);
        glucides.setText(Float.toString(unProduit.getGlucides()));

        EditText sucres = (EditText) findViewById(R.id.contentSucre);
        sucres.setText(Float.toString(unProduit.getSucres()));

        EditText fibres = (EditText) findViewById(R.id.contentFibre);
        fibres.setText(Float.toString(unProduit.getFibresAlimentaires()));

        EditText proteines = (EditText) findViewById(R.id.contentProteine);
        proteines.setText(Float.toString(unProduit.getProteine()));

        EditText sel = (EditText) findViewById(R.id.contentSel);
        sel.setText(Float.toString(unProduit.getSel()));

        EditText sodium = (EditText) findViewById(R.id.contentSodium);
        sodium.setText(Float.toString(unProduit.getSodium()));

    }

    public void annuler(View view){
        finish();
    }

    public void modifier(View view){
        try {
            String libelle = ((EditText) (findViewById(R.id.contentNom))).getText().toString();
            Long codeBarre = Long.valueOf(((EditText) findViewById(R.id.contentCodeBarre)).getText().toString());
            String ingredient = ((EditText) findViewById(R.id.contentIngredient)).getText().toString();
            int quantite = Integer.parseInt(((EditText) findViewById(R.id.contentQuantite)).getText().toString());
            //String lien = ((EditText) findViewById(R.id.contentLien)).getText().toString();
            String lien = "test";
            float sodium = Float.valueOf((((EditText) (findViewById(R.id.contentSodium))).getText().toString()));
            //float fruitsLegumes = Float.valueOf((((EditText) (findViewById(R.id.contentFruitsLegumes))).getText().toString()));
            float fruitsLegumes = 0;
            float energie = Float.valueOf((((EditText) (findViewById(R.id.contentEnergie))).getText().toString()));
            float matiereGrasse = Float.valueOf((((EditText) (findViewById(R.id.contentMatiereGrasse))).getText().toString()));
            float acideGras = Float.valueOf((((EditText) (findViewById(R.id.contentAcideGras))).getText().toString()));
            float glucide = Float.valueOf((((EditText) (findViewById(R.id.contentGlucide))).getText().toString()));
            float sucre = Float.valueOf((((EditText) (findViewById(R.id.contentSucre))).getText().toString()));
            float fibre = Float.valueOf((((EditText) (findViewById(R.id.contentFibre))).getText().toString()));
            float proteine = Float.valueOf((((EditText) (findViewById(R.id.contentProteine))).getText().toString()));
            float sel = Float.valueOf((((EditText) (findViewById(R.id.contentSel))).getText().toString()));

            int nutriscore = 0;
            try {
                Produit unProduit = new Produit(id, libelle, codeBarre, quantite, ingredient, energie, matiereGrasse, acideGras, glucide, sucre, proteine, sel, sodium, nutriscore, fruitsLegumes, fibre);

                //Toast.makeText(getApplicationContext(),"id = "+ Float.toString(unProduit.getId()), Toast.LENGTH_LONG).show();
                //Toast.makeText(getApplicationContext(), "Sel = "+ Float.toString(unProduit.getSel()), Toast.LENGTH_LONG).show();



                //connexion a la bdd
                ProduitManager bdd = new ProduitManager(this);
                bdd.open();
                //Modification dans la base
                bdd.modProduit(unProduit);

                bdd.close();
                finish();
            }catch (Exception error){
                //affiche l'erreur
                Writer writer = new StringWriter();
                error.printStackTrace(new PrintWriter(writer));
                String StringError = writer.toString();
                Toast.makeText(getApplicationContext(),StringError, Toast.LENGTH_LONG).show();
            }
        }catch (Exception error){
            Toast.makeText(getApplicationContext(), "Veuillez remplir tous les champs", Toast.LENGTH_LONG).show();
        }

    }
}
