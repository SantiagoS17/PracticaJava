/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package introduccionjava;
import static introduccionjava.Ejercicio6.ValidarPar;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entero:");
        int num = leer.nextInt();
        boolean resultado=ValidarPar(num);
       
        if (resultado)   
            System.out.println("El numero que ingresaste es par");
        else
            System.out.println("El numero que ingresaste es impar");
            
    }


    public static boolean ValidarPar(int a){
        boolean result;
    if (a%2==0)
        result=true; 
    
    else
        result=false;
       return result;
  
    
}
}
