package com.example.calculatrice.vue;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.calculatrice.R;

public class MainActivity extends AppCompatActivity {

    // Proprietes globaux
    private EditText champ1;
    private EditText champ2;
    private EditText txtResult;
    private Button btnSomme;
    private Button btnSus;
    private Button btnMulti;
    private Button btnDiv;
    Double nb1, nb2, resultat;//Globaux

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //call methodes...
        init();
        calculer();
    }

    /**
     * fait la liaison des composants graphiques.
     */
    private void init() {
        //Toast.makeText(MainActivity.this, "Entrée invalide!", Toast.LENGTH_SHORT).show();
        champ1 =  (EditText)findViewById(R.id.txt1);
        champ2 =  (EditText)findViewById(R.id.txt2);
        txtResult = (EditText)findViewById(R.id.txtResult);
        btnSomme = (Button)findViewById(R.id.btnAddition);
        btnSus = (Button)findViewById(R.id.btnSustration);
        btnMulti = (Button)findViewById(R.id.btnMultiplication);
        btnDiv = (Button)findViewById(R.id.btnDivision);
    }

    /**
     * fait le calcul
     */
    private void calculer(){
         btnSomme.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                try {
                    // get inputs filds values
                    nb1 = Double.parseDouble(champ1.getText().toString() );
                    nb2 = Double.parseDouble(champ2.getText().toString() );
                    resultat = nb1+nb2;
                    txtResult.setText(resultat.toString());
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Entrée invalide!", Toast.LENGTH_SHORT).show();
                }
             }
         });
        btnSus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // get inputs filds values
                    nb1 = Double.parseDouble(champ1.getText().toString() );
                    nb2 = Double.parseDouble(champ2.getText().toString() );
                    resultat = nb1-nb2;
                    txtResult.setText(resultat.toString());
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Entrée invalide!", Toast.LENGTH_SHORT).show();
                }
            }
        });
     }



}// fin class