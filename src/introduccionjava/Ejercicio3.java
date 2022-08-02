/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package introduccionjava;
import java.util.Scanner   ;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String frase;
       frase = leer.nextLine();
        System.out.println("Tu frase en mayusculas es: "+ frase.toUpperCase());
        System.out.println("Tu frase en minusculas es: "+ frase.toLowerCase() );
       
       
    }
    
}
