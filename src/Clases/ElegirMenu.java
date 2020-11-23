/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author compu
 */
public class ElegirMenu {
    Scanner sc=new Scanner(System.in);
    //eleccion del café si la persona asi lo desea
    int Expresso;
    int Doubleexpresso;
    int Cappucino;
    int Americano;
    int Mocha;
    int numero;

    public ElegirMenu() {
        System.out.println("Elija el tipo de café");
        System.out.println("-----------------------");
        System.out.println("1. Expresso ....$3.00\n2. Double Expresso ....$5.00\n3. Cappucino ....$4.00\n4. Americano ....$3.00\n5. Mocha ....$4.00");
          numero=sc.nextInt();
       
     
        do{
        if (numero==1){
        System.out.println("Has elegido Cafe Expresso");
        }
        else if (numero==2)
                System.out.println("Has elejido Cafe Double Expresso");
        else if (numero==3)
            System.out.println("Has elejido Cafe Cappucino");
        else if (numero==4)
            System.out.println("Has elejido Cafe Americano");
        else if(numero==5)
            System.out.println("Has elejido Cafe Mocha");
        }
        while(numero<=5);
            }

    
 
    
}
    

