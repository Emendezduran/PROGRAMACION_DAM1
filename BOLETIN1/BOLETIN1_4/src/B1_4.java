
package BOLETIN1.BOLETIN1_4.src;

import java.util.Scanner;

public class B1_4 {
  
     public static void main(String[] args) {
     
        float N1, N2;
        
        Scanner ler = new Scanner (System.in);    
        
        System.out.println("Ingresa los 2 numeros para realizar las operaciones");
        
         N1=ler.nextFloat();
         N2=ler.nextFloat();
        
         float suma = N1 + N2;
         float resta = N1 - N2;
         float multiplicacion = N1 * N2;
         float division = N1 / N2;
        
         System.out.println("Resultado de la suma: "+suma);
         System.out.println("Resultado de la resta: "+resta);
         System.out.println("Resultado de la multiplicacion: "+multiplicacion);
         System.out.println("Resultado de la division: "+division);

    }
}