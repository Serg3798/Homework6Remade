package homework6Remade;

import static homework6Remade.Invoice.getQuantityInvoice;

public class Homework6Remade {

    public static void main(String[] args) {
        int maxQuantityStock = 500;
        int maxQuantityInvoice = 20;
        int maxQuantityGoodsInvoice = 100;
        Stock stock = new Stock();
        stock.totalCost(maxQuantityStock);
        getQuantityInvoice(maxQuantityInvoice);
        Invoice invoice = new Invoice();
        invoice.totalCost(maxQuantityGoodsInvoice);
        Dealer dealer = new Dealer();
        dealer.getAmountOfAssets();
        String s = dealer.getNameProductForCalculationRevenue();
        dealer.getRevenueProduct(s);
    }
}
