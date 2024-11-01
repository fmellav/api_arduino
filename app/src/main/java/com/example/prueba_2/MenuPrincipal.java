package com.example.prueba_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btn_cerrar (View v)
    {
        Intent cerrar = new Intent(this, MainActivity.class);
        startActivity(cerrar);
        finish();
    }

    public void btn_ElimCuenta (View v)
    {
        Intent eliminar = new Intent(this, eliminar_cuenta.class);
        startActivity(eliminar);
        finish();
    }

    public void btn_Emp_disp (View v)
    {
        Intent empDisp = new Intent(this, Emparejar_Disp.class);
        startActivity(empDisp);
        finish();
    }


}