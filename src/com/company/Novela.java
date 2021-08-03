package com.company;

public class Novela extends Texto{
    String generoNovela;
    int cantidadLibros;

    public Novela(String titulo, String autor, String descripcion, int cantidadPaginas, String generoNovela, int cantidadLibros) {
        super(titulo, autor, descripcion, cantidadPaginas);
        this.generoNovela=generoNovela;
        this.cantidadLibros=cantidadLibros;
    }

    public String getGeneroNovela() {
        return generoNovela;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    @Override
    public String tipoCaracteristica() {
        String caracteristica=CARACTERISTICAS_NOVELA;
        return caracteristica;
    }

    @Override
    public String mostrarISBN() {
        return super.mostrarISBN();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
//        System.out.println(tipoCaracteristica());
        System.out.println("El genero de la novela es: "+generoNovela+"\n" +
                "La novela cuenta con "+cantidadLibros+" libros como continuacion de la saga");

    }

}
