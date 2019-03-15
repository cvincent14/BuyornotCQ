package com.example.slam.buyornot;

public class Label {
    private String labelCode;
    private String labelLibelle;

    public Label(String labelCode, String labelLibelle){
        this.labelCode = labelCode;
        this.labelLibelle = labelLibelle;
    }

    public String getLabelCode() {
        return labelCode;
    }

    public void setLabelCode(String labelCode) {
        this.labelCode = labelCode;
    }

    public String getLabelLibelle() {
        return labelLibelle;
    }

    public void setLabelLibelle(String labelLibelle) {
        this.labelLibelle = labelLibelle;
    }
}
