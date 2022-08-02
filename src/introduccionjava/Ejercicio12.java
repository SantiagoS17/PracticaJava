/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package introduccionjava;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el mensaje:");
        String frase = leer.nextLine();
         frase = frase.toUpperCase();
        int cant = frase.length();
        int correcto = 0 ;
        int incorrecto = 0;
       
        do{
        if (cant == 5 && frase.substring(0,1).equals("X") && frase.substring(cant-1).equals("O")){
            System.out.println("La palabra ingresada es correcta");
            correcto = correcto + 1;
            System.out.println("Ingrese otro mensaje");
            frase = leer.nextLine();
         
        }else{
            System.out.println("La palabra ingresada es incorrecta ");
            incorrecto = incorrecto + 1;
            System.out.println("Ingrese otro mensaje");
            frase = leer.nextLine();
         
        }
        }
        while ((!frase.equals("&&&&&")));  
        
        System.out.println("La cantidad de palabras correctas ingresadas es: " + correcto );
        System.out.println("La cantidad de palabras incorrectas ingresadas es: " + incorrecto);
        
        }
     }
