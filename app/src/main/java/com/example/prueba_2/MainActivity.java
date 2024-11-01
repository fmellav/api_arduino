package com.example.prueba_2;

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

    public void btn_ingresar(View v)
    {
        EditText cuadroUsuario = findViewById(R.id.editLogUser);
        EditText cuadroPass = findViewById(R.id.editLogPass);

        String userName = cuadroUsuario.getText().toString();
        String userPass = cuadroPass.getText().toString();

        if (userName.equals("admin") && userPass.equals("admin"))
        {
            Intent iniciar = new Intent(this, MenuPrincipal.class);
            startActivity(iniciar);
            finish();
        }
        else
        {
            Toast.makeText(this, "Datos no encontrados, intente nuevamente", Toast.LENGTH_SHORT).show();
        }

    }

    public void btn_login_regis(View v)
    {
        Intent registrarse = new Intent(this, RegistroUsuario.class);
        startActivity(registrarse);
        finish();
    }

}