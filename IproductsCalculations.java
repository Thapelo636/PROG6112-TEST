/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author khuma
 */

public class ProductCalculations implements IProductCalculations {
    private double price;

package mattresssales;

public interface IProductCalculations {
    double GetVat();
    double GetCommission();
    double GetTotal();
}
}
