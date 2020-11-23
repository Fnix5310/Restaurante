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
public class ElegirMenu3 {
     Scanner sc2=new Scanner(System.in);
    //eleccion del Té si la persona asi lo desea
    int Pie;
    int Cupcake;
    int pastel;
    int Muffin;
    int numeros3;
    
    public ElegirMenu3() {
        System.out.println("Elija el tipo de Postre");
        System.out.println("-----------------------");
        System.out.println("1. Pie de Limon ....$1.50\n2. Cupcake ....$0.50\n3. Rebanada de Pastel de Chocolate ....$4.00\n4. Muffin de Vainilla ....$0.75");
        numeros3=sc2.nextInt();
        
         do{
        if (numeros3==1){
        System.out.println("Has elegido Pie de Limon");
        }
        else if (numeros3==2)
                System.out.println("Has elejido Cupcake");
        else if (numeros3==3)
            System.out.println("Has elejido Rebanada de pastel de Chocolate");
       else if (numeros3==4)
            System.out.println("Has elejido Muffin de vainilla");
        }
        while(numeros3<=5);
            }
}
