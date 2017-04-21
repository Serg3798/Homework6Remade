package homework6Remade;

import java.util.Random;

public class Stock implements Goods {

    static int totalCostGoodsStock;
    static int quantityStock;

    @Override
    public void totalCost(int x) {
        Random r = new Random();
        quantityStock = r.nextInt(x);
        System.out.println("Количество товара на складе равно: " + quantityStock + " штук.");
        Product[] stock = new Product[quantityStock];
        ToFile file = new ToFile();
        file.openFile();
        for (int i = 0; i < quantityStock; i++) {
            stock[i] = Product.values()[r.nextInt(Product.values().length)];
            totalCostGoodsStock = totalCostGoodsStock + stock[i].getPrice();
            file.addRecord(i, stock[i].getPrice(), stock[i]);
        }
        file.closeFile();
        System.out.println("Информацию о товаре, имеющемся на складе, и его цене Вы можете посмотреть в файле: homework6Remade.txt на диске С.");
        System.out.println("Общая стоимость товара на складе равна: " + totalCostGoodsStock);
    }
}
