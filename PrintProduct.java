/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khuma
 */

public class PrintProduct {
    public void printReport(IProduct productData) {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");
        System.out.println("TOTAL PRODUCT SALES: " + productData.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + (int) productData.GetAverageProductSold());
        System.out.println("MOST POPULAR PRODUCT: " + productData.GetMostPopularProduct());
    }
}  

