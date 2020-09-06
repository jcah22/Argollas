package com.example.argollas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

public class DetalleActivity extends AppCompatActivity {

    ImageView foto;
     TextView sku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        foto = findViewById(R.id.imgDetalle);
        sku = findViewById(R.id.txtsku);

        StyleableToast.makeText(this, "El peso promedio en cada argolla es equivalente al #9", Toast.LENGTH_LONG, R.style.mytoast).show();
        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");

        sku.setText(obj.getSku());
        foto.setImageResource(obj.getImagen());




    }
}
