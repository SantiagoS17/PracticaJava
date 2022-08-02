/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package introduccionjava;
import java.util.Scanner  ;
/**
 *
 * @author santi
 */
public class Ejercicio5 {

 
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     double num,doble,triple,raiz ;
        System.out.println("Ingresa un numero cualquiera");
        num=leer.nextInt();
        doble = num *2;
        triple=num*3;
        raiz=Math.sqrt(num);
        System.out.println("El doble del numero inngresado es: "+doble);
        System.out.println("El triple del numero ingresado es: "+triple);
        System.out.println("La raiz cuadrada del numero ingresado es: "+raiz);
        
    }
    
}
