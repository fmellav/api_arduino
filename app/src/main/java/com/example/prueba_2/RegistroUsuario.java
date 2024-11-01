package com.example.prueba_2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RegistroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro_usuario);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void btn_registrar (View v)
    {
        EditText editName = findViewById(R.id.editRegisUser);
        EditText editNombre = findViewById(R.id.editRegisNom);
        EditText editPass = findViewById(R.id.editRegisPass);
        EditText editCoreo = findViewById(R.id.editRegisCorreo);

        String userName = editName.getText().toString();
        String userNombre = editNombre.getText().toString();
        String userPass = editPass.getText().toString();
        String userCorreo = editCoreo.getText().toString();

        if (!userName.isEmpty() && !userNombre.isEmpty() && !userPass.isEmpty() && userCorreo.isEmpty()) {

            //Volver a Login
            Intent registrar = new Intent(this, MainActivity.class);
            startActivity(registrar);
            finish();
        }
        else
        {
            Toast.makeText(RegistroUsuario.this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show();
        }

    }


    public void btn_cancelar(View v)
    {
        Intent cancelar = new Intent(this, MainActivity.class);
        startActivity(cancelar);
        finish();
    }

}