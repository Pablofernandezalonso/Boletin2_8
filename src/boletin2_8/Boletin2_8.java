
package boletin2_8;

import java.util.Scanner;


public class Boletin2_8 {

    
    public static void main(String[] args) {
        
       double bCien, bVeinte , bCinco , monedas;
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce la cantidad de billetes de 100€");
       bCien = sc.nextDouble();
       System.out.println("Introduce la cantidad de billetes de 20€");
       bVeinte = sc.nextDouble();
       System.out.println("Introduce la cantidad de billetes de 5€");
       bCinco = sc.nextDouble();
       System.out.println("Introduce la cantidad de monedas de 1€");
       monedas = sc.nextDouble();
       System.out.println(bCien+" billetes de 100 + "+bVeinte+" billetes de 20 + "+bCinco+" billetes de 5€ + "+monedas+" monedas de 1€ son "+(bCien*100)+(bVeinte*20)+(bCinco*5)+monedas+" euros");
    }
    
}
