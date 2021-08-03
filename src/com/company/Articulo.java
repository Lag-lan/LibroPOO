package com.company;

public class Articulo extends Texto{
    String campoAcademico;
    String ejemploProblema;
    String solucionProblema;
    String universidadOrigen;
    String revistaPublica;

    public Articulo(String titulo, String autor, String descripcion,
                    int cantidadPaginas, String campoAcademico,
                    String ejemploProblema, String solucionProblema,
                    String universidadOrigen, String revistaPublica) {
        super(titulo, autor, descripcion, cantidadPaginas);
        this.campoAcademico=campoAcademico;
        this.ejemploProblema=ejemploProblema;
        this.solucionProblema=solucionProblema;
        this.universidadOrigen=universidadOrigen;
        this.revistaPublica=revistaPublica;
    }

    public String getCampoAcademico() {
        return campoAcademico;
    }

    public String getEjemploProblema() {
        return ejemploProblema;
    }

    public String getSolucionProblema() {
        return solucionProblema;
    }

    public String getUniversidadOrigen() {
        return universidadOrigen;
    }

    public String getRevistaPublica() {
        return revistaPublica;
    }

    @Override
    public String tipoCaracteristica() {
        String caracteristica=CARACTERISTICAS_ARTICULO;
        return caracteristica;
    }

    @Override
    public String mostrarISBN() {
        return super.mostrarISBN();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El campo academico en el que se centra el articulo es: "+campoAcademico+"\n" +
                "Problema que plantea el articulo: "+ejemploProblema+"\n" +
                "Solucion del problema planteado: "+solucionProblema+"\n" +
                "Universidad en donde se realizo la investigacion: "+universidadOrigen+"\n" +
                "Revista en la que se publico el articulo: "+revistaPublica);

    }
}
