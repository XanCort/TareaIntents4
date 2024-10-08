package com.example.tarea4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void mandarTexto(View view) {

        /*
        Entiendo que la idea era hacer
        EditText texto = findViewById(R.id.editTextText);
        texto.getText().toString();
        intent.putExtra("texto",texto");
        Me ha hecho mas gracia hacerlo como lo he hecho
         */




        Intent intent = new Intent(this, Actividad2.class);
        intent.putExtra("texto",((EditText)findViewById(R.id.editTextText)).getText().toString());
        startActivity(intent);
    }
}