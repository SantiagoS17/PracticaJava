/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package introduccionjava;
import java.util.Scanner;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Para entrar debes acertarle al numero de caracteres, ingresa una palabra o frase");
        String palabra = leer.nextLine();
        int largo;
        largo = palabra.length();
        if (largo==8)
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");
           
    }

    
    }
 
