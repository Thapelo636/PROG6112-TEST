/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author khuma
 */
    
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        int[][] sampleSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        String[] products = {"P1", "P2", "P3"};
        Product product = new Product(sampleSales, products);
        
        int expected = 153; // Matches total from sample
        assertEquals(expected, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageProductsSold_WithValidData_ReturnsCorrectValue() {
        int[][] sampleSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        String[] products = {"P1", "P2", "P3"};
        Product product = new Product(sampleSales, products);
        
        double expected = 17.0; // 153 / 9
        assertEquals(expected, product.GetAverageProductSold(), 0.01);
    }
}

