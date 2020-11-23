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
public class ElegirMenu4 {
     Scanner sc3=new Scanner(System.in);
    //eleccion del Té si la persona asi lo desea
    int Atun;
    int Pollo;
    int Tocino;
    int numeros4;
    
    public ElegirMenu4() {
        System.out.println("Elija el tipo de Sandwich");
        System.out.println("-----------------------");
        System.out.println("1. Sandwich de atun ....$2.00\n2. Sandwich de pollo ....$2.00\n3. Sandwich de tocino y huevo ....$2.50");
        numeros4=sc3.nextInt();
        
         do{
        if (numeros4==1){
        System.out.println("Has elegido Sandwich de atun");
        }
        else if (numeros4==2)
                System.out.println("Has elejido Sandwich de pollo");
        else if (numeros4==3)
            System.out.println("Has elejido Sandwich de tocino y huevo");
        }
        while(numeros4<=5);
            }
}
