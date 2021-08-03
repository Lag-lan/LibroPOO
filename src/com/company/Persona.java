package com.company;

public class Persona {

    //Creacion de atributos de la clase
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;
    private double peso;
    private double altura;
    private final int IDEAL = -1;
    private final int DEBAJO_IDEAL=0;
    private final int SOBREPESO=1;

    //Creo el constructor por defecto
    public Persona(){
        this.nombre="";
        this.edad=0;
        this.sexo="H";
        this.peso=0;
        this.altura=0;
    }
    //Creo el constructor que recibe 3 parametros
    public Persona(String nombre, int edad, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=0;
        this.altura=0;
    }
    //Creo el constructor que recibe todos los atributos
    public Persona(String nombre, int edad, int dni, String sexo, int peso, int altura){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura){

        double hallarPeso=(peso/(Math.pow(altura,2)));
        if(hallarPeso>=20 && hallarPeso<=25){
            return DEBAJO_IDEAL;
        }else if(hallarPeso<20 && hallarPeso>=0){
            return IDEAL;
        }else{
            return SOBREPESO;
        }

    }

    //Genero el metodo que crea un documento de identificacion para la persona
    private void generarDni(){
        //segun lo que lei, necesito generar los rangos en los cuales generare el DNI aleatorio para el objeto
        int rangoMinimo=100000;
        int rangoMaximo=1000000;
        int rango=rangoMaximo-rangoMinimo+100000;
        //casteo el resultado que genera la clase math ya que esta genera un double entre 0 y 1
        int generar=(int)(Math.random()*rango)+rangoMinimo;
        dni=generar;
    }

    public boolean esMayorDeEdad(int edad){
        if(edad>=18){
            return true;
        }else{
            return false;
        }
    }

    public void comprobarSexo(String sexo){
        if(sexo!="H"||sexo!="h"){
           if (sexo=="M"||sexo=="m"){
               this.sexo=sexo;
           }System.out.println("Ingreso un caracter erroneo");
        }this.sexo="H";
    }

    public String toString(){
        if (sexo=="H" || sexo == "h"){
            sexo="HOMBRE";
        }else if(sexo=="M"||sexo=="m"){
            sexo="MUJER";
        }else sexo="TRANSFORMER";
        return "Informacion Subministrada por ahora: \n"+
                "Nombre: "+nombre+"\n"+
                "Dni: "+dni+"\n"+
                "Edad: "+edad+"\n"+
                "Sexo: "+sexo+"\n"+
                "Peso: "+peso+"\n"+
                "Altura: "+altura;
    }

    //va en el main
//        Scanner sc = new Scanner(System.in);
//        imprimirPantalla("Ingrese su nombre");
//        String nombre=sc.nextLine();
//        imprimirPantalla("su nombre es: "+nombre);
//        imprimirPantalla("Ingrese su edad: ");
//        int edad=sc.nextInt();
//        imprimirPantalla("Su edad es: "+edad);
//        imprimirPantalla("Ingrese H si es hombre o M si es mujer");
//        String sexo=sc.nextLine();
//        imprimirPantalla("Ingrese su peso en kilogramos (kg):");
//        double peso=sc.nextDouble();
//        imprimirPantalla("Ingrese su altura en metros: ");
//        double altura=sc.nextDouble();
//        imprimirPantalla("su peso es de: "+peso+"kg\n y su altura es: "+altura+"metros");

}
