package com.company;

public class Texto implements CaracteristicasLibros{
    private String titulo;
    private String autor;
    private String descripcion;
    private int cantidadPaginas;

    public Texto(String titulo, String autor, String descripcion, int cantidadPaginas) {
        this.titulo=titulo;
        this.autor=autor;
        this.descripcion=descripcion;
        this.cantidadPaginas=cantidadPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    @Override
    public String tipoCaracteristica() {
        String caracteristica="Texto normal que permite comunicar informacion";
        return caracteristica;
    }

    public class IsbnGenerator {

        int codPrefijo=978;
        int codPais=0;
        int codEditor=0;
        int codPublicacion=0;
        int codControl=0;
        int rangoMinimo=0;
        int rangoMaximo=0;

        private int generarPrefijo(){
            int decision=(int)(Math.round(Math.random()));
            if (decision==0){
                codPrefijo=979;
            }
            return codPrefijo;
        }

        private int generarPais(){
            rangoMinimo=1;
            rangoMaximo=100000;
            codPais=(int)(Math.round(Math.random()*rangoMaximo));
            return codPais;
        }

        private int generarEditor(){
            rangoMinimo=1;
            rangoMaximo=10000000;
            codEditor=(int)(Math.round(Math.random()*rangoMaximo));
            return codEditor;
        }

        private int generarPublicacion(){
            rangoMinimo=1;
            rangoMaximo=10000000;
            codPublicacion=(int)(Math.round(Math.random()*rangoMaximo)-rangoMinimo);
            return codPublicacion;
        }

        private int generarDigitoControl(){
            rangoMinimo=1;
            rangoMaximo=10;
            codControl=(int)(Math.round((Math.random()*rangoMaximo))/3);
            return codControl;
        }

        public String ISBN(){
            return generarPrefijo()+"-"+generarPais()+"-"+generarEditor()+"-"+generarPublicacion()+"-"+generarDigitoControl();
        }


    }
    IsbnGenerator isbn =new IsbnGenerator();
    public String mostrarISBN(){
        return isbn.ISBN();
    }

    public void mostrarDatos() {
        System.out.println("Nombre libro: "+titulo+"\n" +
                "Nombre del autor: "+autor+"\n" +
                "Descripcion del libro: "+descripcion+"\n" +
                "Cantidad de paginas en el libro: "+cantidadPaginas+"\n" +
                "El libro se encuentra registrado con el numero: "+mostrarISBN());
        System.out.println("La caracteristica que caracteriza este texto es: "+tipoCaracteristica());

    }
}
