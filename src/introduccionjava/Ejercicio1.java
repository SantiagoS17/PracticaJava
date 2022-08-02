
package introduccionjava;

import java.util.Scanner; 
public class Ejercicio1{

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int a,b,suma ;
       a = leer.nextInt();
       b = leer.nextInt();
       suma = a+b;
       
        System.out.println("El resultado de la suma es: " +suma);
   
       
    }
    
}
