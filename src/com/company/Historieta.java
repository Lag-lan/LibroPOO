package com.company;

public class Historieta extends Texto{
    String dibujante;
    String entintador;
    String tipoHistorieta;
    String generoHistorieta;
    String casaPublicadora;


    public Historieta(String titulo, String autor, String descripcion, int cantidadPaginas, String dibujante, String entintador, String tipoHistorieta, String generoHistorieta, String casaPublicadora) {
        super(titulo, autor, descripcion, cantidadPaginas);
        this.dibujante=dibujante;
        this.entintador=entintador;
        this.tipoHistorieta=tipoHistorieta;
        this.generoHistorieta=generoHistorieta;
        this.casaPublicadora=casaPublicadora;
    }

    public String getDibujante() {
        return dibujante;
    }

    public String getEntintador() {
        return entintador;
    }

    public String getTipoHistorieta() {
        return tipoHistorieta;
    }

    public String getGeneroHistorieta() {
        return generoHistorieta;
    }

    public String getCasaPublicadora() {
        return casaPublicadora;
    }

    @Override
    public String tipoCaracteristica() {
        String caracteristica=CARACTERISTICAS_HISTORIETA;
        return caracteristica;
    }

    @Override
    public String mostrarISBN() {
        return super.mostrarISBN();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
//        System.out.println("La caracteristica del libro es: "+tipoCaracteristica());
        System.out.println("El dibujo de la historieta se encuentra realizado por: "+dibujante+"\n" +
                "El entintado de la historieta corre a cargo de: "+entintador+"\n" +
                "El tipo de historieta es: "+tipoHistorieta+"\n" +
                "El genero al que pertenece la historieta es: "+generoHistorieta+"\n" +
                "Y su publicacion corre a cargo de: "+casaPublicadora);

    }
}
