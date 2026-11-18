/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author khuma
 */

public interface IProduct {
    int GetTotalProductsSold();
    double GetAverageProductSold();
    String GetMostPopularProduct();
}

public class Product implements IProduct {
    private int[][] sales;
    private String[] products;

    public Product(int[][] sales, String[] products) {
        this.sales = sales;
        this.products = products;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = products.length * sales[0].length;
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
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

   