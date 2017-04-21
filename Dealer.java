package homework6Remade;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Dealer {

    static int amountOfAssets;

    public void getAmountOfAssets() {
        amountOfAssets = Stock.totalCostGoodsStock + Invoice.totalCostGoodsInvoices;
        System.out.println("Общая стоимость активов на складе и в " + Invoice.quantityInvoice + " чеках равна: " + amountOfAssets);
    }

    public void getRevenueProduct(String x) {
        Product x2 = Product.valueOf(x);
        switch (x2) {
            case Fruit:
                JOptionPane.showMessageDialog(null, "Выручка по товару " + Product.Fruit + " равна: " + Invoice.totalQuantityFruitInvoices * Product.Fruit.getPrice());
                break;
            case Vegetables:
                JOptionPane.showMessageDialog(null, "Выручка по товару " + Product.Vegetables + " равна: " + Invoice.totalQuantityVegetablesInvoices * Product.Vegetables.getPrice());
                break;
            case Clothes:
                JOptionPane.showMessageDialog(null, "Выручка по товару " + Product.Clothes + " равна: " + Invoice.totalQuantityClothesInvoices * Product.Clothes.getPrice());
                break;
            case Appliances:
                JOptionPane.showMessageDialog(null, "Выручка по товару " + Product.Appliances + " равна: " + Invoice.totalQuantityAppliancesInvoices * Product.Appliances.getPrice());
                break;
            case Chemicals:
                JOptionPane.showMessageDialog(null, "Выручка по товару " + Product.Chemicals + " равна: " + Invoice.totalQuantityChemicalsInvoices * Product.Chemicals.getPrice());
                break;
            case Other:
                JOptionPane.showMessageDialog(null, "Выручка по товару " + Product.Other + " равна: " + Invoice.totalQuantityOtherInvoices * Product.Other.getPrice());
        }
    }

    public String getNameProductForCalculationRevenue() {
        System.out.println();
        String s = null;
        boolean test = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                JOptionPane.showMessageDialog(null, "Введите наименование товара, по которому Вы хотите посчитать выручку:");
                s = sc.nextLine();
                if (Product.valueOf(s) == Product.Fruit || Product.valueOf(s) == Product.Vegetables || Product.valueOf(s) == Product.Clothes || Product.valueOf(s) == Product.Appliances || Product.valueOf(s) == Product.Chemicals || Product.valueOf(s) == Product.Other) {
                    test = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Такого товара у торговца нет!!!");
            }
        } while (test);
        return s;
    }
}
