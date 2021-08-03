package com.company;

public class Manga extends  Historieta{
    String metodoLectura="Derecha a Izquierda";
    String lenguajeOrigen="Japones";

    public Manga(String titulo, String autor, String descripcion, int cantidadPaginas, String dibujante, String entintador, String tipoHistorieta, String generoHistorieta, String casaPublicadora) {
        super(titulo, autor, descripcion, cantidadPaginas, dibujante, entintador, tipoHistorieta, generoHistorieta, casaPublicadora);    }

    @Override
    public String tipoCaracteristica() {
        return super.tipoCaracteristica();
    }

    @Override
    public String mostrarISBN() {
        return super.mostrarISBN();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Su forma de lectura es de: "+metodoLectura+"\n" +
                "El idioma en el que esta hecho es: "+lenguajeOrigen);
    }
}
