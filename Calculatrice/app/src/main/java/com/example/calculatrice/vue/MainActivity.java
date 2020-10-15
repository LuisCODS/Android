package com.example.calculatrice.vue;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.calculatrice.R;
//ADD BY ME
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    // Proprietes globaux
    private EditText champ1;
    private EditText champ2;
    private EditText result;
    private Button btnSomme;
    private Button btn_Soustraction;
    private Button btn_Division;
    private Button btn_Multiplication;
    Double nb1, nb2, resultat;//Globaux

    //PORTE D'ENTRÉE DE L'APPLICATION
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//CHARGE L'INTERFACE GRAPHIQUE ET SES COMPOSANTS
        LinearLayout l = findViewById(R.id.homePage); //GET ELEMENT BY ID TO: MODIFICATION DE LA COULEUR DU LAYOUT
        //l.setBackgroundColor(Color.GRAY);
        //l.setGravity(Gravity.CENTER_HORIZONTAL);
        //call methodes...
        init();
        calculer();
    }

    /**
     * fait la liaison des composants graphiques.
     * Recupere les widget par l'ID
     */
    private void init()
    {
        //Toast.makeText(MainActivity.this, "Entrée invalide!", Toast.LENGTH_SHORT).show();
        champ1 =  findViewById(R.id.txt1);
        champ2 =  findViewById(R.id.txt2);
        result = findViewById(R.id.txtResult);
        btnSomme = findViewById(R.id.btnAddition);
        btn_Soustraction = findViewById(R.id.btnSustration);
        btn_Multiplication = findViewById(R.id.btnMultiplication);
        btn_Division = findViewById(R.id.btnDivision);
    }//fin methode init()

    /**
     * fait le calcul
     */
    private void calculer()
    {
        //BUTTON SOMME
         btnSomme.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                try {
                    // get inputs filds values
                    nb1 = Double.parseDouble(champ1.getText().toString() );
                    nb2 = Double.parseDouble(champ2.getText().toString() );
                    resultat = nb1+nb2;
                    result.setText(resultat.toString());//SHOW RESULT
                }catch (Exception e){
                    //MSN erreur
                    Toast.makeText(MainActivity.this, "Entrée invalide!", Toast.LENGTH_SHORT).show();
                }finally {
                    //VIDE LES CHAMPS APRES LE RESULTAT
                    champ1.setText("");
                    champ2.setText("");
                }
             }
         });

         //BUTTON SOUSTRACTION
        btn_Soustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // get inputs filds values
                    nb1 = Double.parseDouble(champ1.getText().toString() );
                    nb2 = Double.parseDouble(champ2.getText().toString() );
                    resultat = nb1-nb2;
                    result.setText(resultat.toString());
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Entrée invalide!", Toast.LENGTH_SHORT).show();
                }finally {
                    //VIDE LES CHAMPS APRES LE RESULTAT
                    champ1.setText("");
                    champ2.setText("");
                }
            }
        });

        //BUTTON MULTIPLICATION
        btn_Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // get inputs filds values
                    nb1 = Double.parseDouble(champ1.getText().toString() );
                    nb2 = Double.parseDouble(champ2.getText().toString() );
                    resultat = nb1*nb2;
                    result.setText(resultat.toString());
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Entrée invalide!", Toast.LENGTH_SHORT).show();
                }finally {
                    //VIDE LES CHAMPS APRES LE RESULTAT
                    champ1.setText("");
                    champ2.setText("");
                }
            }
        });

        //BUTTON DIVISION
        btn_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // get inputs filds values
                    nb1 = Double.parseDouble(champ1.getText().toString() );
                    nb2 = Double.parseDouble(champ2.getText().toString() );
                    resultat = nb1/nb2;
                    result.setText(resultat.toString());
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Entrée invalide!", Toast.LENGTH_SHORT).show();
                }finally {
                    //VIDE LES CHAMPS APRES LE RESULTAT
                    champ1.setText("");
                    champ2.setText("");
                }
            }
        });

     }//fin methode calculer()

}//fin class