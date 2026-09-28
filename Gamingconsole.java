/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.scanner
package com.mycompany.gamingconsole;

/**
 *
 * @author khuma
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int[] storeNumbers = 6000, 9000, 3800};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        double[] prices = {1000, 2000,3000}; 

        int[][] sales = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Store #" + storeNumbers[i] + " (" + cities[i] + ")");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + consoles[j] + " units: ");
                sales[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        
        System.out.println("\n--- YEARLY SALES REPORT ---");
        System.out.println("Store\tCity\t\tPS5\tXBOX\tSWITCH\tTotal Units\tTotal Revenue");

        int grandUnits = 0;
        double grandRevenue = 0;

       
        for (int i = 0; i < 3; i++) {
            int cityUnits = 0;
            double cityRevenue = 0;

            String tab = cities[i].equals("Port Elizabeth") ? "\t" : "\t\t";
            System.out.print(storeNumbers[i] + "\t" + cities[i] + tab);

            for (int j = 0; j < 3; j++) {
                System.out.print(sales[i][j] + "\t");
                cityUnits += sales[i][j];
                cityRevenue += sales[i][j] * prices[j];
            }

            grandUnits += cityUnits;
            grandRevenue += cityRevenue;

            System.out.println(cityUnits + "\t\tR" + cityRevenue);
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("TOTALS\t\t\t\t\t\t" + grandUnits + "\t\tR" + grandRevenue);

        sc.close();
    }
}
        
    

