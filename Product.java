/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khuma
 */

public class Product implements IProducts {

    @Override
    public int calculateTotalSales(int[][] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double calculateAverageSales(int totalSales, int productCount, int monthsCount) {
        return (double) totalSales / (productCount * monthsCount);
    }

    @Override
    public String determineMostPopularProduct(String[] products, int[][] sales) {
        int[] productTotals = new int[products.length];
        
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                productTotals[i] += sales[i][j];
            }
        }
        
        int maxIndex = 0;
        for (int i = 1; i < productTotals.length; i++) {
            if (productTotals[i] > productTotals[maxIndex]) {
                maxIndex = i;
            }
        }
        
        return products[maxIndex] + " (" + productTotals[maxIndex] + ")";
    }
}