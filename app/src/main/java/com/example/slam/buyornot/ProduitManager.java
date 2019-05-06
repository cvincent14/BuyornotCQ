package com.example.slam.buyornot;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ProduitManager {
    private static final String TABLE_NAME = "produit";
    public static final String KEY_ID_PRODUIT="pro_id";
    public static final String KEY_LIBELLE_PRODUIT="pro_libelle";
    public static final String KEY_CODEBARRE_PRODUIT="pro_codeBarre";
    public static final String KEY_QUANTITE_PRODUIT="pro_quantite";
    public static final String KEY_INGREDIENTS_PRODUIT="pro_ingredients";
    public static final String KEY_ENERGIE_PRODUIT="pro_energie";
    public static final String KEY_MATIEREGRASSE_PRODUIT="pro_matiereGrasse";
    public static final String KEY_ACIDESGRAS_PRODUIT="pro_acidesGras";
    public static final String KEY_GLUCIDE_PRODUIT="pro_glucide";
    public static final String KEY_SUCRE_PRODUIT="pro_sucre";
    public static final String KEY_PROTEINE_PRODUIT="pro_proteine";
    public static final String KEY_SEL_PRODUIT="pro_sel";
    public static final String KEY_SODIUM_PRODUIT="pro_sodium";
    public static final String KEY_NUTRISCORE_PRODUIT="pro_nutriscore";
    public static final String KEY_FRUITLEGUMES_PRODUIT="pro_fruitLegumes";
    public static final String KEY_FIBRES_PRODUIT="pro_fibres";

    public static final String CREATE_TABLE_PRODUIT = "CREATE TABLE "+TABLE_NAME+
            " ( "+KEY_ID_PRODUIT+" INTEGER primary key AUTOINCREMENT," +
            " "+KEY_LIBELLE_PRODUIT+" TEXT," +
            " "+KEY_CODEBARRE_PRODUIT+" LONG," +
            " "+KEY_QUANTITE_PRODUIT+" INT," +
            " "+KEY_INGREDIENTS_PRODUIT+" TEXT," +
            " "+KEY_ENERGIE_PRODUIT+" FLOAT," +
            " "+KEY_MATIEREGRASSE_PRODUIT+" FLOAT," +
            " "+KEY_ACIDESGRAS_PRODUIT+" FLOAT," +
            " "+KEY_GLUCIDE_PRODUIT+" FLOAT," +
            " "+KEY_SUCRE_PRODUIT+" FLOAT," +
            " "+KEY_PROTEINE_PRODUIT+" FLOAT," +
            " "+KEY_SEL_PRODUIT+" FLOAT," +
            " "+KEY_SODIUM_PRODUIT+" FLOAT," +
            " "+KEY_NUTRISCORE_PRODUIT+" INT," +
            " "+KEY_FRUITLEGUMES_PRODUIT+" FLOAT," +
            " "+KEY_FIBRES_PRODUIT+" FLOAT" +
            " );";

    public static final String INSERT_DONNEES = "INSERT INTO produit (pro_id, pro_libelle, pro_codeBarre, pro_quantite, pro_ingredients, pro_energie, pro_matiereGrasse, pro_acidesGras," +
            "pro_glucide, pro_sucre, pro_proteine, pro_sel, pro_sodium, pro_nutriscore, pro_fruitLegumes, pro_fibres) VALUES" +
            "(1,\"Teurgoule de la Sée\", 3488790000214, 100, \"Lait entier 78 % riz 10%, sucre 12% vanille\", 122, 3.5, 0.09,18.3,0,0.043,0.017,1,0,0,0)," +
            "(2,\"Caprice des Dieux\", 3161712963223 , 100, \"Lait de vache pasteurisé de France, crème, sel, ferments lactiques.\", 333, 30, 21, 0.8, 1.4, 15.3, 1.4, 0.551, 3, 0, 0);";
    private MySQLite maBaseSQLite; // notre gestionnaire du fichier SQLite
    private SQLiteDatabase db;
    // Constructeur
    public ProduitManager(Context context)
    {
        maBaseSQLite = MySQLite.getInstance(context);
    }
    public void open()
    {
        //on ouvre la table en lecture/écriture
        db = maBaseSQLite.getWritableDatabase();
    }
    public void close()
    {
        //on ferme l'accès à la BDD
        db.close();
    }
    public long addProduit(Produit produit) {
        // Ajout d'un enregistrement dans la table
        ContentValues values = new ContentValues();

        values.put(KEY_LIBELLE_PRODUIT, produit.getLibelle());
        values.put(KEY_CODEBARRE_PRODUIT,produit.getCodeBarre());
        values.put(KEY_QUANTITE_PRODUIT,produit.getQuantite());
        values.put(KEY_INGREDIENTS_PRODUIT,produit.getIngredients());
        values.put(KEY_ENERGIE_PRODUIT,produit.getEnergie());
        values.put(KEY_MATIEREGRASSE_PRODUIT,produit.getMatiereGrasse());
        values.put(KEY_ACIDESGRAS_PRODUIT,produit.getAcidesGras());
        values.put(KEY_GLUCIDE_PRODUIT,produit.getGlucides());
        values.put(KEY_SUCRE_PRODUIT,produit.getSucres());
        values.put(KEY_PROTEINE_PRODUIT,produit.getProteine());
        values.put(KEY_SEL_PRODUIT,produit.getSel());
        values.put(KEY_SODIUM_PRODUIT,produit.getSodium());
        values.put(KEY_NUTRISCORE_PRODUIT,produit.getNutriscore());
        values.put(KEY_FRUITLEGUMES_PRODUIT,produit.getFruitsLegumes());
        values.put(KEY_FIBRES_PRODUIT,produit.getFibresAlimentaires());

        // insert() retourne l'id du nouvel enregistrement inséré, ou -1 en cas d'erreur
        return db.insert(TABLE_NAME,null,values);
    }

    public int modProduit(Produit produit) {
        // modification d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la requête
        ContentValues values = new ContentValues();

        values.put(KEY_LIBELLE_PRODUIT, produit.getLibelle());
        values.put(KEY_CODEBARRE_PRODUIT,produit.getCodeBarre());
        values.put(KEY_QUANTITE_PRODUIT,produit.getQuantite());
        values.put(KEY_INGREDIENTS_PRODUIT,produit.getIngredients());
        values.put(KEY_ENERGIE_PRODUIT,produit.getEnergie());
        values.put(KEY_MATIEREGRASSE_PRODUIT,produit.getMatiereGrasse());
        values.put(KEY_ACIDESGRAS_PRODUIT,produit.getAcidesGras());
        values.put(KEY_GLUCIDE_PRODUIT,produit.getGlucides());
        values.put(KEY_SUCRE_PRODUIT,produit.getSucres());
        values.put(KEY_PROTEINE_PRODUIT,produit.getProteine());
        values.put(KEY_SEL_PRODUIT,produit.getSel());
        values.put(KEY_SODIUM_PRODUIT,produit.getSodium());
        values.put(KEY_NUTRISCORE_PRODUIT,produit.getNutriscore());
        values.put(KEY_FRUITLEGUMES_PRODUIT,produit.getFruitsLegumes());
        values.put(KEY_FIBRES_PRODUIT,produit.getFibresAlimentaires());

        String where = KEY_ID_PRODUIT+" = ?";
        String[] whereArgs = {produit.getId()+""};
        return db.update(TABLE_NAME, values, where, whereArgs);
    }
    public int supProduit(int id) {
        // suppression d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la clause WHERE, 0 sinon
        String where = KEY_ID_PRODUIT+" = ?";
        String[] whereArgs = {Integer.toString(id)};
        return db.delete(TABLE_NAME, where, whereArgs);
    }
    public Produit getProduit(int id) {
        // Retourne le produit dont l'id est passé en paramètre
        Produit a=new Produit();
        Cursor c = db.rawQuery("SELECT * FROM "+TABLE_NAME + " where pro_id = " + id , null);
        if (c.moveToFirst()) {
            a.setId(c.getInt(c.getColumnIndex(KEY_ID_PRODUIT)));
            a.setLibelle(c.getString(c.getColumnIndex(KEY_LIBELLE_PRODUIT)));
            a.setCodeBarre(c.getLong(c.getColumnIndex(KEY_CODEBARRE_PRODUIT)));
            a.setQuantite(c.getInt(c.getColumnIndex(KEY_QUANTITE_PRODUIT)));
            a.setIngredients(c.getString(c.getColumnIndex(KEY_INGREDIENTS_PRODUIT)));
            a.setEnergie(c.getFloat(c.getColumnIndex(KEY_ENERGIE_PRODUIT)));
            a.setMatiereGrasse(c.getFloat(c.getColumnIndex(KEY_MATIEREGRASSE_PRODUIT)));
            a.setAcidesGras(c.getFloat(c.getColumnIndex(KEY_ACIDESGRAS_PRODUIT)));
            a.setGlucides(c.getFloat(c.getColumnIndex(KEY_GLUCIDE_PRODUIT)));
            a.setSucres(c.getFloat(c.getColumnIndex(KEY_SUCRE_PRODUIT)));
            a.setProteine(c.getFloat(c.getColumnIndex(KEY_PROTEINE_PRODUIT)));
            a.setSel(c.getFloat(c.getColumnIndex(KEY_SEL_PRODUIT)));
            a.setSodium(c.getFloat(c.getColumnIndex(KEY_SODIUM_PRODUIT)));
            a.setNutriscore(c.getInt(c.getColumnIndex(KEY_NUTRISCORE_PRODUIT)));
            a.setFruitsLegumes(c.getFloat(c.getColumnIndex(KEY_FRUITLEGUMES_PRODUIT)));
            a.setFibresAlimentaires(c.getFloat(c.getColumnIndex(KEY_FIBRES_PRODUIT)));
            c.close();
        }
        return a;
    }

    public Cursor getLesProduits() {
        // sélection de tous les enregistrements de la table
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }
} // class AnimalManager