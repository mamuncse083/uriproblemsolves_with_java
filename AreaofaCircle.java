/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriproblemsolves;

import java.util.Scanner;

public class AreaofaCircle {

   public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double pi = 3.14159;
        double r = obj.nextDouble();
        double area = (pi * r * r);

        System.out.format("A=%.4f\n",area); 
    }
}
