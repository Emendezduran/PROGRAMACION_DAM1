
package BOLETIN1.BOLETIN1_5.src;

import java.util.Scanner;

public class B1_5 
{
    public static void main(String[] args) {

        int mnauticasametros = 1852;
        
        Scanner scanmillasNauticas = new Scanner(System.in);
        
        System.out.println("Millas Nauticas:");
        
        float mnauticas = scanmillasNauticas.nextFloat();
        float equivalenciaenmetros = mnauticas * mnauticasametros;
        
        System.out.println("Metros:" + equivalenciaenmetros + " m.");

    }
}
