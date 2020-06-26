package com.example.argollas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ListView listaArgollas;
    ArrayList<Datos> Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listaArgollas = findViewById(R.id.lstArgollasClasica);
        Lista = new ArrayList<Datos>();
        Lista.add(new Datos(1,"CL1101","Argolla 6 mm 10 k",R.drawable.cl1101,"P.P : 1.8 gr"));
        Lista.add(new Datos(2,"CL1108","Argolla 6 mm 10 k",R.drawable.cl1108,"P.P : 2.0 gr"));
        Lista.add(new Datos(3,"CL1110","Argolla 6 mm 10 k",R.drawable.cl1110,"P.P : 2.0 gr"));
        Lista.add(new Datos(4,"CL1109","Argolla 6 mm 10 k",R.drawable.cl1109,"P.P : 1.9 gr"));
        Lista.add(new Datos(5,"CL1116","Argolla 6 mm 10 k",R.drawable.cl1116,"P.P : 1.8 gr"));
        Lista.add(new Datos(6,"CL1200","Argolla 6 mm 10 k",R.drawable.cl1200,"P.P : 2.0 gr"));
        Lista.add(new Datos(7,"CL1201","Argolla 6 mm 10 k",R.drawable.cl1201,"P.P : 2.0 gr"));
        Lista.add(new Datos(8,"CL1202","Argolla 6 mm 10 k",R.drawable.cl1202,"P.P : 2.0 gr"));
        Lista.add(new Datos(9,"CL088-61","Argolla 6 mm 10 k",R.drawable.cl088_61,"P.P : 2.0 gr"));

        Lista.add(new Datos(10,"CL1108-41","Argolla 4 mm 10 k",R.drawable.cl1108_41,"P.P : 1.5 gr"));
        Lista.add(new Datos(11,"CL1117","Argolla 4 mm 10 k",R.drawable.cl1117,"P.P : 1.3 gr"));
        Lista.add(new Datos(12,"CL1118","Argolla 4 mm 10 k",R.drawable.cl1118,"P.P : 1.3 gr"));
        Lista.add(new Datos(13,"CL1119","Argolla 4 mm 10 k",R.drawable.cl1119,"P.P : 1.3 gr"));
        Lista.add(new Datos(14,"CL1120","Argolla 4 mm 10 k",R.drawable.cl1120,"P.P : 2.0 gr"));


        Lista.add(new Datos(15,"CL1122","Argolla 4 mm 10 k",R.drawable.cl1122,"P.P : 1.3 gr"));
        Lista.add(new Datos(16,"CL1123","Argolla 4 mm 10 k",R.drawable.cl1123,"P.P : 1.3 gr"));
        Lista.add(new Datos(17,"CL1126","Argolla 4 mm 10 k",R.drawable.cl1126,"P.P : 1.3 gr"));

        Lista.add(new Datos(18,"CL1128","Argolla 4 mm 10 k",R.drawable.cl1128,"P.P : 1.4 gr"));
        Lista.add(new Datos(19,"CL1129","Argolla 4 mm 10 k",R.drawable.cl1129,"P.P : 1.3 gr"));
        Lista.add(new Datos(20,"CL1131","Argolla 4 mm 10 k",R.drawable.cl1131,"P.P : 1.3 gr"));

        Lista.add(new Datos(21,"CL1104B","Argolla 6 mm 10 k",R.drawable.cl1104b,"P.P : 1.8 gr"));
        Lista.add(new Datos(22,"CL1110B","Argolla 6 mm 10 k",R.drawable.cl1110b,"P.P : 2.0 gr"));
        Lista.add(new Datos(23,"CL1112B","Argolla 6 mm 10 k",R.drawable.cl1112b,"P.P : 2.0 gr"));
        Lista.add(new Datos(24,"CL1114B","Argolla 6 mm 10 k",R.drawable.cl1114b,"P.P : 1.7 gr"));

        Lista.add(new Datos(25,"CL004COCP-41","Argolla 4 mm 10 k",R.drawable.cl004cocp_41,"P.P : 2.3 gr"));

        Lista.add(new Datos(26,"CL001","Argolla 6 mm 14 k",R.drawable.cl001,"P.P : 2.0 gr"));
        Lista.add(new Datos(27,"CL002","Argolla 6 mm 14 k",R.drawable.cl002,"P.P : 1.9 gr"));
        Lista.add(new Datos(28,"CL003","Argolla 6 mm 14 k",R.drawable.cl003,"P.P : 1.9 gr"));
        Lista.add(new Datos(29,"CL005","Argolla 6 mm 14 k",R.drawable.cl005,"P.P : 2.0 gr"));
        Lista.add(new Datos(30,"CL012","Argolla 6 mm 14 k",R.drawable.cl012,"P.P : 2.0 gr"));


        Lista.add(new Datos(31,"CL014","Argolla 6 mm 14 k",R.drawable.cl014,"P.P : 1.9 gr"));
        Lista.add(new Datos(32,"CL016","Argolla 6 mm 14 k",R.drawable.cl016,"P.P : 1.9 gr"));
        Lista.add(new Datos(33,"CL017","Argolla 6 mm 14 k",R.drawable.cl017,"P.P : 2.0 gr"));
        Lista.add(new Datos(34,"CL068-64","Argolla 6 mm 14 k",R.drawable.cl068_64,"P.P : 2.2 gr"));


        Lista.add(new Datos(35,"CL009","Argolla 4 mm 14 k",R.drawable.cl009,"P.P : 1.3 gr"));
        Lista.add(new Datos(36,"CL010","Argolla 4 mm 14 k",R.drawable.cl010,"P.P : 1.3 gr"));
        Lista.add(new Datos(37,"CL086-44","Argolla 4 mm 14 k",R.drawable.cl086_44,"P.P : 1.4 gr"));


        Lista.add(new Datos(38,"CL004CPR","Argolla 6 mm 14 k",R.drawable.cl004cpr,"P.P : 2.8 gr"));
        Lista.add(new Datos(39,"CL008CPR","Argolla 6 mm 14 k",R.drawable.cl008cpr,"P.P : 2.9 gr"));


        Lista.add(new Datos(40,"CL001COCP","Argolla 6 mm 14 k",R.drawable.cl068_64,"P.P : 2.8 gr"));
        Lista.add(new Datos(41,"CL004COCP","Argolla 6 mm 14 k",R.drawable.cl004cocp,"P.P : 2.8 gr"));


        Lista.add(new Datos(42,"CF002","Argolla 6 mm 14 k",R.drawable.cf002,"P.P : 3.5 gr"));
        Lista.add(new Datos(43,"CF007","Argolla 6 mm 14 k",R.drawable.cf007,"P.P : 3.3 gr"));
        Lista.add(new Datos(44,"CF002-44","Argolla 4 mm 14 k",R.drawable.cf002_44,"P.P : 2.4 gr"));
        Lista.add(new Datos(45,"CF065-64","Argolla 6 mm 14 k",R.drawable.cf065_64,"P.P : 3.5 gr"));
        Lista.add(new Datos(46,"CF065-44","Argolla 4 mm 14 k",R.drawable.cf065_44,"P.P : 2.4 gr"));


        Lista.add(new Datos(47,"CF006R","Argolla 6 mm 14 k",R.drawable.cf006r,"P.P : 3.4 gr"));
        Lista.add(new Datos(48,"CF009R","Argolla 6 mm 14 k",R.drawable.cf009r,"P.P : 3.4 gr"));
        Lista.add(new Datos(49,"CF011R","Argolla 6 mm 14 k",R.drawable.cf011r,"P.P : 3.4 gr"));

        Lista.add(new Datos(50,"CF004CPR","Argolla 6 mm 14 k",R.drawable.cf004cpr,"P.P : 3.5 gr"));
        Lista.add(new Datos(51,"CF007CPR","Argolla 6 mm 14 k",R.drawable.cf007cpr,"P.P : 3.5 gr"));

        Lista.add(new Datos(52,"CP069-64","Argolla 6 mm 14 k",R.drawable.cp069_64,"P.P : 3.5 gr"));
        Lista.add(new Datos(53,"CP072R-64","Argolla 6 mm 14 k",R.drawable.cp072r_64,"P.P : 3.4 gr"));
        Lista.add(new Datos(54,"CP073R-64","Argolla 6 mm 14 k",R.drawable.cp073r_64,"P.P : 3.5 gr"));

        Lista.add(new Datos(55,"CF002B","Argolla 6 mm 14 k",R.drawable.cf002b,"P.P : 3.5 gr"));
        Lista.add(new Datos(56,"CF002B-44","Argolla 4 mm 14 k",R.drawable.cf002b_44,"P.P : 2.4 gr"));
        Lista.add(new Datos(57,"CF065B-44","Argolla 4 mm 14 k",R.drawable.cf065b_44,"P.P : 2.4 gr"));
        Lista.add(new Datos(58,"CF065B-64","Argolla 6 mm 14 k",R.drawable.cf065b_64,"P.P : 3.4 gr"));

        Lista.add(new Datos(59,"EF028R","Argolla 6 mm 14 k",R.drawable.ef028r,"P.P : 4.5 gr"));
        Lista.add(new Datos(60,"EF057R-54","Argolla 5 mm 14 k",R.drawable.ef057r_54,"P.P : 3.2 gr"));


        Lista.add(new Datos(61,"CM074RG-64","Argolla 6 mm 14 k",R.drawable.cm074rg_64,"P.P : 2.4 gr"));














        Adaptador miadaptador = new Adaptador(getApplicationContext(),Lista);
        listaArgollas.setAdapter(miadaptador);

        listaArgollas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Datos obj = (Datos) parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", (Serializable) obj);
                startActivity(paso);
            }
        });

    }

}
