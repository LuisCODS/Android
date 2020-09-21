package com.example.calculatrice.controleur;
import com.example.calculatrice.model.Calculatrice;

//SOURCE: https://www.youtube.com/watch?v=32Ljj4epj8k

//Patron singleton utilisé ici
public final class Controle {

    private static Controle instance = null;
    private Calculatrice calculatrice;

    //Constructeur privé(on peut pas faire new)
    private Controle(){ super(); }

    /**
     *Creation d'une instance unique(singleton)
     * @return intance
     */
    public static final Controle getInstance(){
        //si pas d'instance crée
        if (Controle.instance == null){
            // On va la creer
            Controle.instance = new  Controle();
        }
        return Controle.instance;
    }

    /**
     * Crée une Instance de calculatrice
     *
     */
    public void creerInstance(Integer prm1, Integer prm2){
        calculatrice = new Calculatrice(prm1, prm2);
    }

    public float getCalcul()
    {
        return calculatrice.getCalcul();
    }



}//fin class
