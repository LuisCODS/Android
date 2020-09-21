package com.example.calculatrice.model;

public class Calculatrice {

    //Propriétés
    private Integer valeurUM;
    private Integer valeurDEUX;
    //private float resultat;

    //Contructeur
    public Calculatrice(Integer valeurUM, Integer valeurDEUX) {
        this.valeurUM = valeurUM;
        this.valeurDEUX = valeurDEUX;
        //Envois les valeurs saisis pour le calcule
        getCalcul();
    }

    //Gets & sets
    public Integer getValeurUM() {
        return valeurUM;
    }
    public void setValeurUM(Integer valeurUM) {
        this.valeurUM = valeurUM;
    }
    public Integer getValeurDEUX() {
        return valeurDEUX;
    }
    public void setValeurDEUX(Integer valeurDEUX) {
        this.valeurDEUX = valeurDEUX;
    }

    /**
     * Methodes qui calcule les deux valeurs recu en parametre
     * @return
     */
    public float getCalcul() {
        float total =  this.valeurUM  + this.valeurDEUX;
        //Toast.makeText(MainActivity.this, "Entrée invalide! test!", Toast.LENGTH_SHORT).show();
        return total;
    }


}//fin class
