/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
package introduccionjava;
import java.util.Scanner;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int a = leer.nextInt();
        System.out.println("Ingresa otro numero entero");
        int b = leer.nextInt();
        int opc = 0;
    do{
        System.out.println("MENU:");
        System.out.println("1)Sumar");
        System.out.println("2)Restar");
        System.out.println("3)Multiplicar");
        System.out.println("4)Dividir");
        System.out.println("5)Salir");
        int opcion = leer.nextInt();
       leer.nextLine();
        switch(opcion){            
            case 1: 
                int suma = a + b;
                System.out.println("La suma de los numeros es: " + suma);
                break ;     
            case 2:
                int restar = a - b;
                System.out.println("La resta de los numeros es: " + restar);
                 break ;                 
            case 3:
                int multiplicar = a * b;
                System.out.println("El producto de los numeros es: " + multiplicar);
                 break ;                 
            case 4: 
                int dividir = 4 / b;
                System.out.println("La division de los numeros es: " + dividir);
                break ;
            case 5: 
                System.out.println("Estas seguro que desea salir del programa ?(S/N)");
                String respuesta = leer.nextLine();
                respuesta = respuesta.toUpperCase();
                if (respuesta.equals("S")){
                    System.out.println("Usted ha seleccinado la opcion salir");
                    opc = 5;
                }else{
                    
                    System.out.println("Ha seleccionado para seguir en el programa");
                    opc = 4;
                }
                }
        }while (opc != 5);
        
    }
    }
 
    
    
                 
        
       
    
    

