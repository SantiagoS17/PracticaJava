/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package introduccionjava;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite,suma,numero;
        suma = 0 ;
        System.out.println("Ingresa el numero limite");
        limite = leer.nextInt();
         
        do{
           System.out.println("Ingresa un numero cualquiera");
            suma= (leer.nextInt()+suma);}
        while (limite>suma);
             System.out.println("La suma de los numeros que ingresaste superaron el limite establecido");
    }
    
}
