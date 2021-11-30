package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnEnviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, MainDatosPersonales.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtFechaNac = (EditText)findViewById(R.id.txtFechaNac);
        EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        RadioButton rbtnMasculino= (RadioButton)findViewById(R.id.rbtnMasculino);
        RadioButton rbtnfemenino= (RadioButton)findViewById(R.id.rbtnFemenino);
        String ResuladoRbtn="";
        if(rbtnfemenino.isChecked()==true){
            ResuladoRbtn="Femenino";
        }
        else if(rbtnMasculino.isChecked()==true)
        {
            ResuladoRbtn="Masculino";
        }

//Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        b.putString("FechaNac", txtFechaNac.getText().toString());
        b.putString("Telefono", txtTelefono.getText().toString());
        b.putString("Sexo", ResuladoRbtn.toString());


//Añadimos la información al intent
        intent.putExtras(b);
        //Iniciamos la nueva actividad
        startActivity(intent);

    }


}