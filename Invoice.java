package homework6Remade;

import java.util.Random;

public class Invoice implements Goods {

    static int quantityInvoice;
    static int totalCostGoodsInvoices;
    static int totalQuantityFruitInvoices;
    static int totalQuantityVegetablesInvoices;
    static int totalQuantityClothesInvoices;
    static int totalQuantityAppliancesInvoices;
    static int totalQuantityChemicalsInvoices;
    static int totalQuantityOtherInvoices;

    @Override
    public void totalCost(int x) {
        Random r = new Random();
        Product[][] invoice = new Product[quantityInvoice][x];
        for (int i = 0; i < quantityInvoice; i++) {
            int QuantityGoodsInvoiceNumber = r.nextInt(x);
            if (QuantityGoodsInvoiceNumber == 0) {
                QuantityGoodsInvoiceNumber = 1;
            }
            for (int j = 0; j < QuantityGoodsInvoiceNumber; j++) {
                invoice[i][j] = Product.values()[r.nextInt(Product.values().length)];
                totalCostGoodsInvoices = totalCostGoodsInvoices + invoice[i][j].getPrice();
                getQuantityTypeProductInvoice(invoice[i][j]);
            }
        }
        System.out.println("Общая количество товара вида: " + Product.Fruit + " во всех " + quantityInvoice + " чеках равно: " + totalQuantityFruitInvoices);
        System.out.println("Общая количество товара вида: " + Product.Vegetables + " во всех " + quantityInvoice + " чеках равно: " + totalQuantityVegetablesInvoices);
        System.out.println("Общая количество товара вида: " + Product.Clothes + " во всех " + quantityInvoice + " чеках равно: " + totalQuantityClothesInvoices);
        System.out.println("Общая количество товара вида: " + Product.Appliances + " во всех " + quantityInvoice + " чеках равно: " + totalQuantityAppliancesInvoices);
        System.out.println("Общая количество товара вида: " + Product.Chemicals + " во всех " + quantityInvoice + " чеках равно: " + totalQuantityChemicalsInvoices);
        System.out.println("Общая количество товара вида: " + Product.Other + " во всех " + quantityInvoice + " чеках равно: " + totalQuantityOtherInvoices);
        System.out.println("Общая количество всех видов товара во всех " + quantityInvoice + " чеках равно: " + (totalQuantityFruitInvoices
                + totalQuantityVegetablesInvoices + totalQuantityClothesInvoices + totalQuantityAppliancesInvoices + totalQuantityChemicalsInvoices + totalQuantityOtherInvoices));
        System.out.println("Общая стоимость товара в " + quantityInvoice + " чеках равна: " + totalCostGoodsInvoices);
    }

    public static void getQuantityInvoice(int x) {
        Random r = new Random();
        quantityInvoice = r.nextInt(x);
        System.out.println("Количество чеков у торговца равно: " + quantityInvoice + " штук.");
    }

    public static void getQuantityTypeProductInvoice(Product x) {
        switch (x) {
            case Fruit:
                totalQuantityFruitInvoices = totalQuantityFruitInvoices + 1;
                break;
            case Vegetables:
                totalQuantityVegetablesInvoices = totalQuantityVegetablesInvoices + 1;
                break;
            case Clothes:
                totalQuantityClothesInvoices = totalQuantityClothesInvoices + 1;
                break;
            case Appliances:
                totalQuantityAppliancesInvoices = totalQuantityAppliancesInvoices + 1;
                break;
            case Chemicals:
                totalQuantityChemicalsInvoices = totalQuantityChemicalsInvoices + 1;
                break;
            case Other:
                totalQuantityOtherInvoices = totalQuantityOtherInvoices + 1;
                break;
        }
    }
}
