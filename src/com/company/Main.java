package com.company;

import java.util.Scanner;

public class Main {

    public static void imprimirPantalla(String texto){
        System.out.println(texto);
    }
    final static String _titulo = "Ingrese el titulo: \n";
    final static String _autor = "Ingrese el autor: \n";
    final static String _descripcion = "Ingrese la descripcion: \n";
    final static String _cantidadPaginas = "Ingrese la cantidad de paginas que posee: \n";
    final static String _campoAcademico = "Ingrese el campo academico(campo de estudio) del libro o articulo: \n";
    final static String _generoNovela = "Ingrese el genero de la novela: \n";
    final static String _cantidadLibros = "Si tiene saga(s) ingrese la cantidad de libros siguientes o ingrese 0 para continuar: \n";
    final static String _nombreDibujante = "Ingrese el nombre del dibujante de la obra (Puede ser el mismo autor en dado caso): \n";
    final static String _nombreEntintador = "Ingrese el nombre del entintador de la obra (Puede ser el mismo autor en dado caso): \n";
    final static String _tipoHistorieta = "Ingrese el tipo de historieta (comic, manga aka comic japones): \n";
    final static String _generoHistorieta = "Ingrese el genero de la historieta: \n";
    final static String _casaPublicadora = "Ingrese el nombre de la casa editorial que lo publica: \n";
    final static String _metodoLectura = "Ingrese el sentido de lectura del manga: \n";
    final static String _lenguajeOrigen = "Ingrese el lenguaje de lectura del manga: \n";
    final static String _ejemploProblema = "Ingrese el problema a entender: \n";
    final static String _solucionProblema = "Ingrese la solucion al problema a entender: \n";
    final static String _universidadOrigen = "Ingrese la universidad a cargo de la investigacion: \n";
    final static String _revistaPublica = "Ingrese la revista a cargo de la publicacion: \n";


    private static int generarPais(){
        int rangoMinimo=1;
        int rangoMaximo=100000;
        int codPrefijo=(int)(Math.round(Math.random()*rangoMaximo));
        return codPrefijo;
    }
    private static int generarEditor(){
        int rangoMinimo=1;
        int rangoMaximo=10000000;
        int codEditor=(int)(Math.round(Math.random()*rangoMaximo));
        return codEditor;
    }

//PRIMER APLICACION DE CONCEPTOS POO
    public static void main(String[] args) {
        int i;
        Scanner ingreso = new Scanner(System.in);

        imprimirPantalla("------------  REGISTRO DE LIBROS  --------------\n" +
                "\n INGRESE LA CANTIDAD DE LIBROS QUE DESEA REGISTRAR:");

        int cantidad=Integer.valueOf(ingreso.nextLine());

        Texto[] textos = new Texto[cantidad];
        imprimirPantalla("Apartir de este momento ingresara los datos de acuerdo a sus necesidades...");
        for(i=0;i< textos.length;i++){
            imprimirPantalla("Ingrese seleccion");
            imprimirPantalla("1.Desea ingresar un libro academico\n" +
                    "2.Desea ingresar una novela\n" +
                    "3.Desea ingresar una historieta\n" +
                    "4.Desea ingresar un manga \n"+
                    "5.Desea ingresar un Articulo Cientifico\n");


            int seleccion=Integer.valueOf(ingreso.nextLine());
            if(seleccion==1){
                imprimirPantalla("Ha seleccionado Libro Academico" +
                        "\n______________________________________________________");
                imprimirPantalla(_titulo);
                String titulo=ingreso.nextLine();
                imprimirPantalla(_autor);
                String autor=ingreso.nextLine();
                imprimirPantalla(_descripcion);
                String descripcion=ingreso.nextLine();
                imprimirPantalla(_cantidadPaginas);
                int pagina=Integer.valueOf(ingreso.nextLine());
                imprimirPantalla(_campoAcademico);
                String campoAcademico=ingreso.nextLine();
                textos[i] =new LibroAcademico(titulo,autor,descripcion,pagina,campoAcademico);

            }else if(seleccion==2){
                imprimirPantalla("Ha seleccionado Novela" +
                        "\n______________________________________________________");
                imprimirPantalla(_titulo);
                String titulo=ingreso.nextLine();
                imprimirPantalla(_autor);
                String autor=ingreso.nextLine();
                imprimirPantalla(_descripcion);
                String descripcion=ingreso.nextLine();
                imprimirPantalla(_cantidadPaginas);
                int pagina=Integer.valueOf(ingreso.nextLine());
                imprimirPantalla(_generoNovela);
                String generoNovela=ingreso.nextLine();
                imprimirPantalla(_cantidadLibros);
                int cantidadLibros = Integer.valueOf(ingreso.nextLine());
                textos[i] =new Novela(titulo,autor,descripcion,pagina,generoNovela, cantidadLibros);
            }else if(seleccion==3){
                imprimirPantalla("Ha seleccionado Historieta" +
                        "\n______________________________________________________");
                imprimirPantalla(_titulo);
                String titulo=ingreso.nextLine();
                imprimirPantalla(_autor);
                String autor=ingreso.nextLine();
                imprimirPantalla(_descripcion);
                String descripcion=ingreso.nextLine();
                imprimirPantalla(_cantidadPaginas);
                int pagina=Integer.valueOf(ingreso.nextLine());
                imprimirPantalla(_nombreDibujante);
                String dibujante=ingreso.nextLine();
                imprimirPantalla(_nombreEntintador);
                String entintador=ingreso.nextLine();
                imprimirPantalla(_tipoHistorieta);
                String tipoHistorieta=ingreso.nextLine();
                imprimirPantalla(_generoHistorieta);
                String generoHistorieta=ingreso.nextLine();
                imprimirPantalla(_casaPublicadora);
                String casaPublicadora=ingreso.nextLine();
                textos[i] =new Historieta(titulo,autor,descripcion,pagina,dibujante, entintador, tipoHistorieta, generoHistorieta, casaPublicadora);

            }else if (seleccion==4){
                imprimirPantalla("Ha seleccionado Manga" +
                        "\n______________________________________________________");
                imprimirPantalla(_titulo);
                String titulo=ingreso.nextLine();
                imprimirPantalla(_autor);
                String autor=ingreso.nextLine();
                imprimirPantalla(_descripcion);
                String descripcion=ingreso.nextLine();
                imprimirPantalla(_cantidadPaginas);
                int pagina=Integer.valueOf(ingreso.nextLine());
                imprimirPantalla(_nombreDibujante);
                String dibujante=ingreso.nextLine();
                imprimirPantalla(_nombreEntintador);
                String entintador=ingreso.nextLine();
                imprimirPantalla(_tipoHistorieta);
                String tipoHistorieta=ingreso.nextLine();
                imprimirPantalla(_generoHistorieta);
                String generoHistorieta=ingreso.nextLine();
                imprimirPantalla(_casaPublicadora);
                String casaPublicadora=ingreso.nextLine();
                textos[i] =new Manga(titulo,autor,descripcion,pagina,dibujante, entintador, tipoHistorieta, generoHistorieta, casaPublicadora);

            }else if (seleccion==5){
                imprimirPantalla("Ha seleccionado Articulo" +
                        "\n______________________________________________________");
                imprimirPantalla(_titulo);
                String titulo=ingreso.nextLine();
                imprimirPantalla(_autor);
                String autor=ingreso.nextLine();
                imprimirPantalla(_descripcion);
                String descripcion=ingreso.nextLine();
                imprimirPantalla(_cantidadPaginas);
                int pagina=Integer.valueOf(ingreso.nextLine());
                imprimirPantalla(_campoAcademico);
                String campoAcademico=ingreso.nextLine();
                imprimirPantalla(_ejemploProblema);
                String ejemploProblema=ingreso.nextLine();
                imprimirPantalla(_solucionProblema);
                String solucionProblema=ingreso.nextLine();
                imprimirPantalla(_universidadOrigen);
                String universidadOrigen=ingreso.nextLine();
                imprimirPantalla(_revistaPublica);
                String revistaPublica=ingreso.nextLine();
                textos[i] =new Articulo(titulo,autor,descripcion,pagina,campoAcademico,ejemploProblema,solucionProblema,universidadOrigen,revistaPublica);

            }
        }
        imprimirPantalla("Los actualmente tiene ingresados: "+textos.length+"\n" +
                "Desea ver todos los datos? (ingrese s(si) o n(no))");
        String mostrarDatos=ingreso.nextLine();

        if(mostrarDatos.equals("s") || mostrarDatos.equals("S")){
            for (Texto text: textos
            ) {
                System.out.println("\n");
                text.mostrarDatos();
            }
        }

        imprimirPantalla("\nDesea editar algun nombre?: (ingrese s(si) o n(no))");
        String edicion=ingreso.nextLine();
        if (edicion.equals("s") || edicion.equals("S")){
            imprimirPantalla("De acuerdo a los siguientes nombres ingrese la posicion la cual desea editar: ");
            for (i=0;i<textos.length;i++) {
                System.out.println("\n");
                imprimirPantalla((i+1)+"-"+textos[i].getTitulo());
            }

        }

    }
}
