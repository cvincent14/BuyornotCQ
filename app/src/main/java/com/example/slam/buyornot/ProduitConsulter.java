package com.example.slam.buyornot;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProduitConsulter extends AppCompatActivity {
    private int id = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produitconsulter);
        Initconsulter();
    }

    public void Initconsulter(){

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

        TextView libelleProduit = (TextView) findViewById(R.id.contentNom);
        libelleProduit.setText(unProduit.getLibelle());
/*
        TextView codeBarreProduit = (TextView) findViewById(R.id.codeBarre);
        long codeB = unProduit.getCodeBarre();
        codeBarreProduit.setText(Long.toString(codeB));

        TextView marque = (TextView) findViewById(R.id.marque);
        marque.setText(unProduit.getMarque().getProduit());
*/
        TextView quantite = (TextView) findViewById(R.id.contentQuantite);
        quantite.setText(Integer.toString(unProduit.getQuantite()) + " g");
/*
        TextView conditionnement = (TextView) findViewById(R.id.conditionnement);
        conditionnement.setText(unProduit.getConditionnement().getLibelle());

        TextView categories = (TextView) findViewById(R.id.categories);
        Categorie lesCategories = unProduit.getCategories();
        String libCategories = "";

        //boucle pour concatener les libelles des categories en une variable
        categories.setText(libCategories);

        TextView origineIngredients = (TextView) findViewById(R.id.origineIngredients);
        ArrayList<LieuxDeFabrication> lesPaysOrigine = unProduit.getLieuxDeFabrication();
        String libPaysOrigine = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        origineIngredients.setText(libPaysOrigine);

        TextView paysDeVente = (TextView) findViewById(R.id.paysDeVente);
        ArrayList<Pays> lesPaysVente = unProduit.getPaysVente();
        String libPaysVente = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        paysDeVente.setText(libPaysVente);

        TextView nova = (TextView) findViewById(R.id.nova);
        nova.setText(unProduit.getNova().getLibelle);

        TextView nutriscore = (TextView) findViewById(R.id.nutriscore);
        nutriscore.setText(Integer.toString(unProduit.getNutriscore()));
*/
        TextView ingredients = (TextView) findViewById(R.id.contentIngredient);
        ingredients.setText(unProduit.getIngredients());
/*
        TextView allergenes = (TextView) findViewById(R.id.allergenes);
        ArrayList<Allegene> lesAllergenes = unProduit.getAllergenes();
        String libAllergenes = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        allergenes.setText(libAllergenes);

        TextView additifs = (TextView) findViewById(R.id.additifs);
        ArrayList<Additif> lesAdditifs = unProduit.getAdditifs();
        String libAdditifs = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        additifs.setText(libAdditifs);

        TextView tauxFruitsLegum = (TextView) findViewById(R.id.tauxFruitsLegum);
        tauxFruitsLegum.setText(Integer.toString(unProduit.getFruitsLegumes()));

        //Reperes nutritionnels
*/
        TextView energie = (TextView) findViewById(R.id.contentEnergie);
        energie.setText(Float.toString(unProduit.getEnergie())+ " kcal");

        TextView matatiereGrass = (TextView) findViewById(R.id.contentMatiereGrasse);
        matatiereGrass.setText(Float.toString(unProduit.getMatiereGrasse())+ " g");

        TextView acidesGrasStatures = (TextView) findViewById(R.id.contentAcideGras);
        acidesGrasStatures.setText(Float.toString(unProduit.getAcidesGras())+ " g");

        TextView glucides = (TextView) findViewById(R.id.contentGlucide);
        glucides.setText(Float.toString(unProduit.getGlucides())+ " g");

        TextView sucres = (TextView) findViewById(R.id.contentSucre);
        sucres.setText(Float.toString(unProduit.getSucres())+ " g");

        TextView fibres = (TextView) findViewById(R.id.contentFibre);
        fibres.setText(Float.toString(unProduit.getFibresAlimentaires()));

        TextView proteines = (TextView) findViewById(R.id.contentProteine);
        proteines.setText(Float.toString(unProduit.getProteine())+ " g");

        TextView sel = (TextView) findViewById(R.id.contentSel);
        sel.setText(Float.toString(unProduit.getSel()) + " g");

        TextView sodium = (TextView) findViewById(R.id.contentSodium);
        sodium.setText(Float.toString(unProduit.getSodium()) + " g");
    }


    public void supprimer(View view){
        ProduitManager produitmanager = new ProduitManager(this);
        produitmanager.open();
        produitmanager.supProduit(id);
        produitmanager.close();
        finish();
    }

    //refresh la page
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 1) {
            Initconsulter();
        }
    }

    public void modifier(View view){
        Intent intent = new Intent(this, ProduitModifier.class);
        intent.putExtra("id",id);
        startActivityForResult(intent, 1);
    }


    public void back(View view){
        finish();
    }
}
