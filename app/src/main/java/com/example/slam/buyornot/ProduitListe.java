package com.example.slam.buyornot;

        import android.content.Intent;
        import android.database.Cursor;
        import android.database.MatrixCursor;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.SimpleCursorAdapter;

        import java.util.ArrayList;

public class ProduitListe extends AppCompatActivity {
    private ArrayList<Integer> idProduits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produitliste);

        initList();
    }

    // construit la liste des produits
    private void initList() {
        String[] columns = new String[] { "_id", "col1", "col2" };
        MatrixCursor matrixCursor= new MatrixCursor(columns);

        startManagingCursor(matrixCursor);
        ProduitManager produitManager = new ProduitManager(this);
        produitManager.open();

        idProduits = new ArrayList<>();
        Cursor c = produitManager.getLesProduits();
        //boucle sur les produit
        if (c.moveToFirst())
        {
            do {
                matrixCursor.addRow(new Object[] { 1, c.getString(1),  /*a changer */ c.getLong(2)});
                idProduits.add(c.getInt(0));
            }
            while (c.moveToNext());
        }
        c.close();

        String[] from = new String[] {"col1", "col2"};

        int[] to = new int[] { R.id.proNom, R.id.codNova};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.row_activity_produit_lister, matrixCursor, from, to, 0);
        ListView lv = (ListView) findViewById(R.id.ListeProduits);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                consulteproduit(idProduits.get(position));
            }
        });

    }

    //revoit vers ajouter un produit
    public void addproduit(View view) {
        Intent intent = new Intent(this, ProduitForm.class);
        startActivityForResult(intent, 1);
    }
    //revoit vers consulter un produit
    public void consulteproduit(Integer idProduit) {
        Intent intent = new Intent(this, ProduitConsulter.class);
        intent.putExtra("id",idProduit);
        startActivityForResult(intent, 1);
    }
    //refresh la page
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 1) {
            initList();
        }
    }
    // revenir au menue
    public void back(View view){
        finish();
    }

}
