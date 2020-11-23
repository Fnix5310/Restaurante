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
public class ElegirMenu2 {
    Scanner sc1=new Scanner(System.in);
    //eleccion del Té si la persona asi lo desea
    int Blanco;
    int Verde;
    int Negro;
    int numeros2;
    
    public ElegirMenu2() {
        System.out.println("Elija el tipo de Te");
        System.out.println("-----------------------");
        System.out.println("1. Te blanco ....$2.00\n2. Te verde ....$2.00\n3. Te negro ....$2.00");
        numeros2=sc1.nextInt();
        
         do{
        if (numeros2==1){
        System.out.println("Has elegido Te Blanco");
        }
        else if (numeros2==2)
                System.out.println("Has elejido Te Verde");
        else if (numeros2==3)
            System.out.println("Has elejido Te Negro");
       
        }
        while(numeros2<=5);
            }
}
