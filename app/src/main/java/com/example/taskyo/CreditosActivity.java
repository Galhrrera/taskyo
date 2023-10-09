package com.example.taskyo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreditosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        // Obtén una referencia al botón "Inicio" en el layout
        Button buttonInicio = findViewById(R.id.buttonInicio);

        // Configura un OnClickListener para el botón "Inicio"
        buttonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para redirigir a la vista principal (activity_main)
                Intent intent = new Intent(CreditosActivity.this, MainActivity.class);
                // Inicia la actividad principal
                startActivity(intent);
                // Cierra la actividad actual (CreditosActivity)
                finish();
            }
        });
    }
}