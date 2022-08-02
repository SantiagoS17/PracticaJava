/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introduccionjava;
import java.util.Scanner ;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in) ;
        int f,c;
        System.out.println("Ingresa la temperatura en grados centigrados");
        c = leer.nextInt();
        f = 32 + (9*c/5);
        System.out.println("El equivalente en grados Fahrenheit es: "+f);
    }
    
}
