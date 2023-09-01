/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tallercompleto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Santiago
 */
public class TallerCompleto {

    /*

	- 	Realice cada punto en el orden que desee
	- 	El ejericio debe ser realizado con los conceptos vistos en clase
	- 	Como parte del ejercicio se proveen 5 metodos utilitarios a los cuales hay que definir los tipos de datos que considere
		es el mas conveniente para el tipo de dato a manejar. Cada uno de estos metodos devuelve un array con el dato que se quiere analizar.
		Por ejemplo el metodo pesos devuelve un array con los valores {70,58,3,55,63...}.
		NOTA: Estos metodos se encuentran comentados, descomente solo el metodo del punto que este trabajando para evitar error de compilacion.
  - 	No es necesario crear nuevos metodos, todos los puntos pueden ser programados en el metodo main
  -   Adicionalmente y al final de la clase se ha incluido como ejemplo el metodo  public static String[] getDirecciones(String[] data). Ese metodo se usa para
    extraer las direcciones de cada persona, las cuales son imprimidas utilizando un for desde el main

	1. Pesos:
		Imprimir los pesos
		Calcular la media de los pesos

	2. Estaturas:
		Imprimir estaturas
		Encontrar el menos alto
		Encontrar el mas alto

	3. Generos
		Contar cuantas personas tienen genero Masculino (M), y cuantas con Femenino (F)

	4. Nombres Completos
		Generar una cadena que contenga todos los nombres de las personas separados por comas asi:
		Juan Pérez,María García, Carlos Pérez

	5. Edades:
		Imprimir las edades de cada persona
		Encontrar cual es la persona con menos año
     */
    
    
    
    public static void main(String[] args) {
        
        record InformacionPersonal(String nombres, String apellidos, LocalDate fechaNacimiento, String direccion, String municipio, String nivelAcademico, String ocupacion, Character genero, Integer peso, Float estatura){
        }
        InformacionPersonal[] data = new InformacionPersonal[10];

        data[0] = new InformacionPersonal("Juan","Pérez",LocalDate.parse("15/03/1985", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123","Medellin","Licenciatura en Ingeniería","Ingeniero de Software",'M',70,1.75F);
        data[1] = new InformacionPersonal("María","García",LocalDate.parse("28/07/1992", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123","Medellin","Maestría en Psicología","Psicóloga Clínica",'F',58,1.68F);
        data[2] = new InformacionPersonal("Carlos","Pérez Garcia",LocalDate.parse("10/03/2023", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123","Medellin","","",'M',3,0.80F);
        data[3] = new InformacionPersonal("Ana","Martínez",LocalDate.parse("05/09/2009", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 14","Villa","Bachiller","Estudiante",'F',55,1.60F);
        data[4] = new InformacionPersonal("Luisa","Hernández",LocalDate.parse("20/06/1989", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Carrera 789","Envigado","Doctorado en Economía","Profesora Universitaria",'F',63,1.70F);
        data[5] = new InformacionPersonal("Javier","López",LocalDate.parse("12/04/1975", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle San Juan","Medellin","Licenciatura en Arquitectura","Arquitecto Independiente",'M',75,1.82F);
        data[6] = new InformacionPersonal("Laura","Ramírez",LocalDate.parse("18/04/1998", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6","Ciudad Metropolitana","Bachiller","Estudiante",'F',52,1.65F);
        data[7] = new InformacionPersonal("Martín","Torres",LocalDate.parse("30/02/1998", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6","Aldea","Bachiller","Estudiante",'M',68,1.78F);
        data[8] = new InformacionPersonal("Sofia","Vargas",LocalDate.parse("22/07/1995", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6","Rionegro","Bachiller","Estudiante",'F',60,1.63F);
        data[9] = new InformacionPersonal("Daniel","Sánchez",LocalDate.parse("08/12/1999", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6","Rionegro","Bachiller","Estudiante",'M',72,1.79F);

        //El metodo getDirecciones y el siguiente for se incluye como ejemplo de impresión de las direcciones
        /*String[] direcciones = getDirecciones(data);
        for (String direccion : direcciones) {
            System.out.println(direccion);
        }*/
        for(InformacionPersonal informacionPersonal : data) {
            System.out.println(informacionPersonal.direccion);
        }

        //1. Pesos:
        /*int[] pesos = getPesos(data);
        float sumaPesos = 0;
        float mediaPesos =0 ;
        int contarPesos = 0;
        for (int peso : pesos) {
            System.out.println(peso);
            sumaPesos += peso;
            contarPesos +=1;
        }
        mediaPesos = sumaPesos/(float)contarPesos;
        System.out.println("La media de los pesos es: "+mediaPesos); */
        
        
        //1. Pesos:
        float sumaPesos = 0;
        float mediaPesos =0 ;
        int contarPesos = 0;
        for(InformacionPersonal informacionPersonal : data) {
            System.out.println(informacionPersonal.peso);
            sumaPesos += informacionPersonal.peso;
            contarPesos +=1;
        }
        mediaPesos = sumaPesos/(float)contarPesos;
        System.out.println("La media de los pesos es: "+mediaPesos);
        
        

        //2. Estaturas:
        /*Float[] estaturas = getEstaturas(data);
        float menosAlto = estaturas[0];
        float masAlato = estaturas[0];
        for (Float estatura : estaturas) {
            System.out.println(estatura);
            if (estatura<menosAlto) {
                menosAlto = estatura;
            }
            if (estatura>masAlato) {
                masAlato = estatura;
            }
        }
        System.out.println("La menor estatura es de: "+menosAlto);
        System.out.println("La mayor estatura es de: "+masAlato); */
        
        
        //2. Estaturas:
        float menosAlto = data[0].estatura;
        float masAlato = data[0].estatura;
        for(InformacionPersonal informacionPersonal : data) {
            System.out.println(informacionPersonal.estatura);
            if (informacionPersonal.estatura<menosAlto) {
                menosAlto = informacionPersonal.estatura;
            }
            if (informacionPersonal.estatura>masAlato) {
                masAlato = informacionPersonal.estatura;
            }
        }
        System.out.println("La menor estatura es de: "+menosAlto);
        System.out.println("La mayor estatura es de: "+masAlato);

        //3. Generos
        /*Character[] generos = getGeneros(data);
        int contarHombres=0;
        int contarMujeres=0;
        for (Character genero : generos) {
            System.out.println(genero);
            if (genero=='M') {
                contarHombres += 1;
            } else {
                contarMujeres += 1;
            }
        }
        System.out.println("La cantidad de hombres es de: "+contarHombres+" y la cantidad de mujeres es de: "+contarMujeres);*/
        
        
        //3. Generos
        int contarHombres=0;
        int contarMujeres=0;
        for(InformacionPersonal informacionPersonal : data) {
            System.out.println(informacionPersonal.genero);
            if (informacionPersonal.genero=='M') {
                contarHombres += 1;
            } else {
                contarMujeres += 1;
            }
        }
        System.out.println("La cantidad de hombres es de: "+contarHombres+" y la cantidad de mujeres es de: "+contarMujeres);

        //4. Nombres Completos
        /*String[] nombresCompletos = getNombresCompletos(data);
        String cadenaDeNombres = "";
        for (String nombreCompleto : nombresCompletos) {
            System.out.println(nombreCompleto);
            cadenaDeNombres += nombreCompleto + ", ";
        }
        System.out.println("Se imprime una cadena con todos los nombres separados por coma");
        System.out.println(cadenaDeNombres);*/
        
        
        //4. Nombres Completos
        String cadenaDeNombres = "";
        for(InformacionPersonal informacionPersonal : data) {
            System.out.println(informacionPersonal.nombres+" "+informacionPersonal.apellidos);
            
            cadenaDeNombres += informacionPersonal.nombres+" "+informacionPersonal.apellidos + ", ";
        }
        System.out.println("Se imprime una cadena con todos los nombres separados por coma");
        System.out.println(cadenaDeNombres);
        

        //5. Edades:
        /*LocalDate[] fechasDeNacimiento = getFechasDeNacimientos(data);
        for (LocalDate fechaDeNacimiento : fechasDeNacimiento) {
            System.out.println(fechaDeNacimiento);
            long anosDiferencia = ChronoUnit.YEARS.between(LocalDate.now(), fechaDeNacimiento);
            System.out.println(fechaDeNacimiento + " " + anosDiferencia);
        }*/
        
        //5. Edades:
        for(InformacionPersonal informacionPersonal : data) {
            System.out.println(informacionPersonal.fechaNacimiento);
            long anosDiferencia = ChronoUnit.YEARS.between(LocalDate.now(), informacionPersonal.fechaNacimiento);
            System.out.println(informacionPersonal.fechaNacimiento + " " + anosDiferencia);
        }
         
    }
    
    
    
    /*
    public static int[] getPesos(String[] data) {

        int[] pesos = new int[data.length - 1];

        for (int i = 1; i < data.length; i++) {
            String[] datum = data[i].split(",");
            int peso = Integer.valueOf(datum[8]);
            pesos[i - 1] = peso;
        }
        return pesos;
    }

    public static Float[] getEstaturas(String[] data) {

        Float[] estaturas = new Float[data.length - 1];

        for (int i = 1; i < data.length; i++) {
            String[] datum = data[i].split(",");
            Float estatura = Float.valueOf(datum[9]);
            estaturas[i - 1] = estatura;
        }
        return estaturas;
    }

    public static Character[] getGeneros(String[] data) {

        Character[] generos = new Character[data.length - 1];

        for (int i = 1; i < data.length; i++) {
            String[] datum = data[i].split(",");
            Character genero = datum[7].charAt(0);
            generos[i - 1] = genero;
        }
        return generos;
    }

    public static String[] getNombresCompletos(String[] data) {

        String[] nombresCompletos = new String[data.length - 1];

        for (int i = 1; i < data.length; i++) {
            String[] datum = data[i].split(",");
            String nombreCompleto = datum[0] + " " + datum[1];
            nombresCompletos[i - 1] = nombreCompleto;
        }
        return nombresCompletos;
    }

    public static LocalDate[] getFechasDeNacimientos(String[] data) {

        LocalDate[] fechasDeNacimiento = new LocalDate[data.length - 1];

        for (int i = 1; i < data.length; i++) {
            String[] datum = data[i].split(",");
            String fechaDeNacimiento = datum[2];
            fechasDeNacimiento[i - 1] = LocalDate.parse(fechaDeNacimiento, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
        }
        return fechasDeNacimiento;
    }

    public static String[] getDirecciones(String[] data) {

        String[] direcciones = new String[data.length - 1];

        for (int i = 1; i < data.length; i++) {
            String[] datum = data[i].split(",");
            String direccion = datum[3];
            direcciones[i - 1] = direccion;
        }
        return direcciones;
    }*/
}
