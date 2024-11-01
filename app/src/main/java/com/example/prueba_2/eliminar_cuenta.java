package com.example.prueba_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class eliminar_cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eliminar_cuenta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btn_eliminar (View v)
    {
        EditText editElimPass = findViewById(R.id.editTxtElimPass);

        String elimPass = editElimPass.getText().toString();

        if(elimPass.isEmpty())
        {
            Toast.makeText(this, "Por favor ingresar contraseña", Toast.LENGTH_SHORT).show();
        }

        else
        {
            Intent eliminar = new Intent(this, MenuPrincipal.class);
            startActivity(eliminar);
            finish();
        }
    }

    public void btn_retorno (View v)
    {
        Intent eliminar = new Intent(this, MenuPrincipal.class);
        startActivity(eliminar);
        finish();
    }

}