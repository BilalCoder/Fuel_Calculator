package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int l = sc.nextInt();
        if(l<0){
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Enter the distance covered");
        int d = sc.nextInt();
        if(d<0){
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Liters/100KM\n"+String.format("%.2f", (double)(100*l)/d));
        System.out.println("Miles/gallons\n"+String.format("%.2f", (d*0.6214)/(l*0.2642)));

    }
}
