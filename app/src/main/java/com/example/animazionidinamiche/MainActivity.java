package com.example.animazionidinamiche;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;



//classe principale, dove possiamo dichiarare le variabili globali.
public class MainActivity extends AppCompatActivity {

    //variablile globale utilizzabile da tutti i metodi.
    int contatorePressione;

    //metodo onclick per rendere l'animazione clickabile.
    public  void spinnerClickato(View view) {
        //creo due varibaili di tipo immage Viev
        ImageView scudo = (ImageView) findViewById(R.id.shieldId);
        ImageView spinner = (ImageView) findViewById(R.id.spinnerId);
        //ogni volta che un immagine viene clickata  il contatore viene incrementato.
        contatorePressione++;

        //per tenere conto del valore del contatore uso il log.i.
        //convertendo il valore integer in string.
        Log.i("Contatore",Integer.toString(contatorePressione));

        //se il valore modulo del contattore non è uguale a zero
        if(contatorePressione%2!=0) {
            //lo scudo viene nascosto
            scudo.animate().alpha(0).setDuration(2000);
            //e lo spinner trasla sul'asse x e ruota 10 volte.
            spinner.animate().translationXBy(2000).rotation(3600);
         //se il modulo del contatore ritorna 0 fai tornare le immagini al loro posto.
        }else if(contatorePressione%2==0) {

            scudo.animate().alpha(1).setDuration(2000);
            spinner.animate().translationXBy(-2000).rotation(3600);
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //quando l'app viene avviata
        ImageView spinner = (ImageView) findViewById(R.id.spinnerId);
        //Lo spinner viene settato a -2000
        spinner.setX(-2000);
        //e dopo ruota e trasla verso il centro dello schermo.
        spinner.animate().translationXBy(2000).rotation(3600).setDuration(2000);

    }
}
