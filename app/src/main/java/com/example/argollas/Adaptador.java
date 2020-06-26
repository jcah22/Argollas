package com.example.argollas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador  extends BaseAdapter {

    Context contexto;
    List<Datos> ListaClasica10k;

    public Adaptador(Context contexto, List<Datos> listaClasica10k) {
        this.contexto = contexto;
        ListaClasica10k = listaClasica10k;
    }

    @Override
    public int getCount() {
        return ListaClasica10k.size();  //retorna la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaClasica10k.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaClasica10k.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista  = inflate.inflate(R.layout.itemlistview,null);

        ImageView imagen = vista.findViewById(R.id.imagenenamoro);
        TextView sku = vista.findViewById(R.id.txtsku);
        TextView descripcion = vista.findViewById(R.id.txtdescripcion);
        TextView pesopromedio = vista.findViewById(R.id.txtpp);

        sku.setText(ListaClasica10k.get(position).getSku().toString());
        descripcion.setText(ListaClasica10k.get(position).getDetalle().toString());
        pesopromedio.setText(ListaClasica10k.get(position).getPesopromidio().toString());

        imagen.setImageResource(ListaClasica10k.get(position).getImagen());

        return vista;
    }
}
