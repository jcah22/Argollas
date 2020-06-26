package com.example.argollas;

import java.io.Serializable;

public class Datos implements Serializable {

    private int id;
    private String sku;
    private  String detalle;
    private int imagen;
    private String pesopromidio;

    public Datos(int id, String sku, String detalle, int imagen, String pesopromidio) {
        this.id = id;
        this.sku = sku;
        this.detalle = detalle;
        this.imagen = imagen;
        this.pesopromidio = pesopromidio;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getPesopromidio() {
        return pesopromidio;
    }

    public void setPesopromidio(String pesopromidio) {
        this.pesopromidio = pesopromidio;
    }
}
