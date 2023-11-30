package com.example.simulacroexamen.clases;

public class Telefono {

    private int id;
    private String telefono;


    public Telefono(int id, String telefono) {
        this.id = id;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telefono telefono1 = (Telefono) o;

        if (id != telefono1.id) return false;
        return telefono.equals(telefono1.telefono);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append(" Número Tlf: ").append(telefono);
        return sb.toString();
    }
}
