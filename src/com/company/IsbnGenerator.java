package com.company;

public class IsbnGenerator {
    int codPrefijo=978;
    int codPais;
    int codEditor;
    int codPublicacion;
    int codControl;
    int rangoMinimo;
    int rangoMaximo;


    public int getCodPrefijo() {
        return codPrefijo;
    }

    public int getCodPais() {
        return codPais;
    }

    public int getCodEditor() {
        return codEditor;
    }

    public int getCodPublicacion() {
        return codPublicacion;
    }

    public int getCodControl() {
        return codControl;
    }

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
        codPublicacion=(int)(Math.round(Math.random()*rangoMaximo));
        return codPublicacion;
    }

    private int generarDigitoControl(){
        rangoMinimo=1;
        rangoMaximo=10;
        codControl=(int)(Math.round((Math.random()*rangoMaximo))%3);
        return codControl;
    }

    public void ISBN(){
        System.out.println(generarPrefijo()+"-"+generarPais()+"-"+generarEditor()+"-"+generarPublicacion()+"-"+generarDigitoControl());
    }

}
