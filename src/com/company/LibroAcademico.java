package com.company;

import com.company.Texto;

public class LibroAcademico extends Texto {
    String campoAcademico;

    public LibroAcademico(String titulo,
                          String autor,
                          String descripcion,
                          int cantidadPaginas,
                          String campoAcademico) {
        super(titulo, autor, descripcion, cantidadPaginas);
        this.campoAcademico = campoAcademico;
    }

    public String getCampoAcademico() {
        return campoAcademico;
    }

    @Override
    public String tipoCaracteristica() {
        String caracteristica=CARACTERISTICAS_ACADEMICO;
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
        System.out.println("El libro es relacionado al campo academico de: "+campoAcademico);
    }

}
