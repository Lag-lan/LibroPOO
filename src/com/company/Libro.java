package com.company;

public class Libro extends IsbnGenerator{
    private int codigo;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro (int codigo,String titulo, String autor, int numeroPaginas){
        this.codigo=codigo;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

//    public String generarISBN(){
//        //Generacion del numero del estandar internacional de numeros
//        //Genero los limites a usar con la libreria de Math
//            return "";
//
//    }

    public String mostrarDatos(){
        return "El libro " +"'"+titulo+"'"+" identificado con el codigo "+ codigo +
                " creado por "+autor+" y contiene un total de "+numeroPaginas+" paginas.";
    }
}
