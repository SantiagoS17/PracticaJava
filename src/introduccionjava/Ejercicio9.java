/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    String  cadena,minuscula;
        System.out.println("Ingresa una palabra o frase");
    cadena=leer.nextLine();
    String subcadena;
        subcadena= cadena.substring(0,1);
    minuscula = subcadena.toLowerCase();
    String letra = "a"  ;
    if (letra.equals(subcadena))
     System.out.println("CORRECTO");
         else
     System.out.println("INCORRECTO");
        
        
     }
    
    }
