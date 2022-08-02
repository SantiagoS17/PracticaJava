/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package introduccionjava;
import java.util.Scanner;

public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clave= "eureka";
        System.out.println("Ingresa la palabra clave");        
        String frase=leer.nextLine();
         
        if (clave.equals(frase))
            System.out.println("La clave ingresada es correcta");
        else
            
            System.out.println("La clave ingresada es incorrecta");
    }
        
        
        
    }
    
