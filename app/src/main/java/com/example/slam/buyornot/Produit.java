package com.example.slam.buyornot;

import java.util.ArrayList;

public class Produit {
    private int id;
    private String libelle;
    private long codeBarre;
    private int quantite;
    private String ingredients;
    private float energie;
    private float matiereGrasse;
    private float acidesGras;
    private float glucides;
    private float sucres;
    private float proteine;
    private float sel;
    private float sodium;
    private int nutriscore;
    private float fruitsLegumes;
    private float fibresAlimentaires;
    private String lien;
    private ArrayList<Additif> lesAdditifs;
    private ArrayList<Allergene> lesAllergenes;
    private ArrayList<Categorie> lesCategories;
    private CodeEmballeur leCodeEmballage;
    private ArrayList<Conditionnement> lesConditionnements;
    private ArrayList<Label> lesLabels;
    private ArrayList<LieuxDeFabrication> lesLieuxDeFabrications;
    private ArrayList<Magasin> lesMagasins;
    private Marque laMarque;
    private Nova leNova;
    private Nutriscore leNutriscore;
    private ArrayList<Pays> lesPaysDOrigine;
    private ArrayList<Pays> lesPaysDeVente;

    public Produit() {
    }

    public Produit(String libelle, long codeBarre, int quantite, String ingredients, float energie, float matiereGrasse, float acidesGras,
                   float glucides, float sucres, float proteine, float sel, float sodium, int nutriscore, float fruitsLegumes, float fibresAlimentaires, String lien) {
        this.libelle = libelle;
        this.codeBarre = codeBarre;
        this.quantite = quantite;
        this.ingredients = ingredients;
        this.energie = energie;
        this.matiereGrasse = matiereGrasse;
        this.acidesGras = acidesGras;
        this.glucides = glucides;
        this.sucres = sucres;
        this.proteine = proteine;
        this.sel = sel;
        this.sodium = sodium;
        this.nutriscore = nutriscore;
        this.fruitsLegumes = fruitsLegumes;
        this.fibresAlimentaires = fibresAlimentaires;
        this.lien = lien;
    }

    public Produit(int id, String libelle, long codeBarre, int quantite, String ingredients, float energie, float matiereGrasse, float acidesGras,
                   float glucides, float sucres, float proteine, float sel, float sodium, int nutriscore, float fruitsLegumes, float fibresAlimentaires, String lien) {
        this.id = id;
        this.libelle = libelle;
        this.codeBarre = codeBarre;
        this.quantite = quantite;
        this.ingredients = ingredients;
        this.energie = energie;
        this.matiereGrasse = matiereGrasse;
        this.acidesGras = acidesGras;
        this.glucides = glucides;
        this.sucres = sucres;
        this.proteine = proteine;
        this.sel = sel;
        this.sodium = sodium;
        this.nutriscore = nutriscore;
        this.fruitsLegumes = fruitsLegumes;
        this.fibresAlimentaires = fibresAlimentaires;
        this.lien = lien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public long getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(long codeBarre) {
        this.codeBarre = codeBarre;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public float getEnergie() {
        return energie;
    }

    public void setEnergie(float energie) {
        this.energie = energie;
    }

    public float getMatiereGrasse() {
        return matiereGrasse;
    }

    public void setMatiereGrasse(float matiereGrasse) {
        this.matiereGrasse = matiereGrasse;
    }

    public float getAcidesGras() {
        return acidesGras;
    }

    public void setAcidesGras(float acidesGras) {
        this.acidesGras = acidesGras;
    }

    public float getGlucides() {
        return glucides;
    }

    public void setGlucides(float glucides) {
        this.glucides = glucides;
    }

    public float getSucres() {
        return sucres;
    }

    public void setSucres(float sucres) {
        this.sucres = sucres;
    }

    public float getProteine() {
        return proteine;
    }

    public void setProteine(float proteine) {
        this.proteine = proteine;
    }

    public float getSel() {
        return sel;
    }

    public void setSel(float sel) {
        this.sel = sel;
    }

    public float getSodium() {
        return sodium;
    }

    public void setSodium(float sodium) {
        this.sodium = sodium;
    }

    public int getNutriscore() {
        return nutriscore;
    }

    public void setNutriscore(int nutriscore) {
        this.nutriscore = nutriscore;
    }

    public float getFruitsLegumes() {
        return fruitsLegumes;
    }

    public void setFruitsLegumes(float fruitsLegumes) { this.fruitsLegumes = fruitsLegumes; }

    public float getFibresAlimentaires() {
        return fibresAlimentaires;
    }

    public void setFibresAlimentaires(float fibresAlimentaires) { this.fibresAlimentaires = fibresAlimentaires; }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public ArrayList<Additif> getLesAdditifs() { return lesAdditifs; }

    public void setLesAdditifs(ArrayList<Additif> lesAdditifs) { this.lesAdditifs = lesAdditifs; }

    public void addUnAdditif (Additif unAdditif) {
        if (lesAdditifs == null){
            lesAdditifs = new ArrayList<Additif>();
        }
        lesAdditifs.add(unAdditif);
    }

    public ArrayList<Allergene> getLesAllergenes() { return lesAllergenes; }

    public void setLesAllergenes(ArrayList<Allergene> lesAllergenes) { this.lesAllergenes = lesAllergenes; }

    public void addUnAllergene (Allergene unAllergene) {
        if (lesAllergenes == null){
            lesAllergenes = new ArrayList<Allergene>();
        }
        lesAllergenes.add(unAllergene);
    }

    public ArrayList<Categorie> getLesCategories() { return lesCategories; }

    public void setLesCategories(ArrayList<Categorie> lesCategories) { this.lesCategories = lesCategories; }

    public void addUneCategorie (Categorie uneCategorie) {
        if (lesCategories == null){
            lesCategories = new ArrayList<Categorie>();
        }
        lesCategories.add(uneCategorie);
    }

    public CodeEmballeur getLeCodeEmballage() { return leCodeEmballage; }

    public void setLeCodeEmballage(CodeEmballeur leCodeEmballage) { this.leCodeEmballage = leCodeEmballage; }

    public ArrayList<Conditionnement> getLesConditionnements() { return lesConditionnements; }

    public void setLesConditionnements(ArrayList<Conditionnement> lesConditionnements) { this.lesConditionnements = lesConditionnements; }

    public void addUnConditionnement (Conditionnement unConditionnement) {
        if (lesConditionnements == null){
            lesConditionnements = new ArrayList<Conditionnement>();
        }
        lesConditionnements.add(unConditionnement);
    }

    public ArrayList<Label> getLesLabels() { return lesLabels; }

    public void setLesLabels(ArrayList<Label> lesLabels) { this.lesLabels = lesLabels; }

    public void addUnLabel (Label unLabel) {
        if (lesLabels == null){
            lesLabels = new ArrayList<Label>();
        }
        lesLabels.add(unLabel);
    }

    public ArrayList<LieuxDeFabrication> getLesLieuxDeFabrications() { return lesLieuxDeFabrications; }

    public void setLesLieuxDeFabrications(ArrayList<LieuxDeFabrication> lesLieuxDeFabrications) { this.lesLieuxDeFabrications = lesLieuxDeFabrications; }

    public void addUnLieuDeFabrication (LieuxDeFabrication unLieuDeFabrication) {
        if (lesLieuxDeFabrications == null){
            lesLieuxDeFabrications = new ArrayList<LieuxDeFabrication>();
        }
        lesLieuxDeFabrications.add(unLieuDeFabrication);
    }

    public ArrayList<Magasin> getLesMagasins() { return lesMagasins; }

    public void setLesMagasins(ArrayList<Magasin> lesMagasins) { this.lesMagasins = lesMagasins; }

    public void addUnMagasin (Magasin unMagasin) {
        if (lesMagasins == null){
            lesMagasins = new ArrayList<Magasin>();
        }
        lesMagasins.add(unMagasin);
    }

    public Marque getLaMarque() { return laMarque; }

    public void setLaMarque(Marque laMarque) { this.laMarque = laMarque; }

    public Nova getLeNova() { return leNova; }

    public void setLeNova(Nova leNova) { this.leNova = leNova; }

    public Nutriscore getLeNutriscore() { return leNutriscore; }

    public void setLeNutriscore(Nutriscore leNutriscore) { this.leNutriscore = leNutriscore; }

    public ArrayList<Pays> getLesPaysDOrigine() { return lesPaysDOrigine; }

    public void setLesPaysDOrigine(ArrayList<Pays> lesPaysDOrigine) { this.lesPaysDOrigine = lesPaysDOrigine; }

    public void addUnPays (Pays unPaysDOrigine) {
        if (lesPaysDOrigine == null){
            lesPaysDOrigine = new ArrayList<Pays>();
        }
        lesPaysDOrigine.add(unPaysDOrigine);
    }

    public ArrayList<Pays> getLesPaysDeVente() { return lesPaysDeVente; }

    public void setLesPaysDeVente(ArrayList<Pays> lesPaysDeVente) { this.lesPaysDeVente = lesPaysDeVente; }

    public void addUnPaysDeVente (Pays unPaysDeVente) {
        if (lesPaysDeVente == null){
            lesPaysDeVente = new ArrayList<Pays>();
        }
        lesPaysDeVente.add(unPaysDeVente);
    }
}
