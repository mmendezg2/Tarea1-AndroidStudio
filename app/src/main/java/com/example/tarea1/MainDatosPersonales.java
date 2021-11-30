package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainDatosPersonales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_datos_personales);


//Localizar los controlesTextView
        TextView txtNombrePer = (TextView)findViewById(R.id.lblNombreP);
        TextView txtGeneroPer = (TextView)findViewById(R.id.lblGeneroP);
        TextView txtFechaNacPer = (TextView)findViewById(R.id.lblFechaNaciP);
        TextView txtTelefonoPer = (TextView)findViewById(R.id.lblTelefonoP);
//Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
//Construimos el mensaje a mostrar
        txtNombrePer.setText(bundle.getString("NOMBRE"));
        txtGeneroPer.setText(bundle.getString("Sexo"));
        txtFechaNacPer.setText(bundle.getString("FechaNac"));
        txtTelefonoPer.setText(bundle.getString("Telefono"));


    }
}