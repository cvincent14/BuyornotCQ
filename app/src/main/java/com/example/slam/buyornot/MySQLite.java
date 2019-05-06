package com.example.slam.buyornot;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLite extends SQLiteOpenHelper {
        private static final String DATABASE_NAME = "buyornot.sqlite";
        private static final int DATABASE_VERSION = 2;
        private static MySQLite sInstance;

        public static synchronized MySQLite getInstance(Context context) {
            if (sInstance == null) { sInstance = new MySQLite(context); }
            return sInstance;
        }
        private MySQLite(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            // Création de la base de données

            // création table "produit"
            sqLiteDatabase.execSQL(ProduitManager.CREATE_TABLE_PRODUIT);

            //insertion de données dans la base
            sqLiteDatabase.execSQL(ProduitManager.INSERT_DONNEES);


        }
        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
            // Mise à jour de la base de données
            // méthode appelée sur incrémentation de DATABASE_VERSION
            // on peut faire ce qu'on veut ici, comme recréer la base :
            onCreate(sqLiteDatabase);
        }
} // class MySQLite

