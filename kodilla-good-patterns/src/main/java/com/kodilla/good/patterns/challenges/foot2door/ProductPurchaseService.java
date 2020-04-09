package com.kodilla.good.patterns.challenges.foot2door;

public class ProductPurchaseService implements PurchaseService {

    @Override
    public boolean purchase(final Producer producer, final Product product) {
        System.out.println("You order " + product.getNameOfProduct() + " " +
                product.getQuantityOfProduct() + " pieces, from " + producer.getName());
        return true;
    }
}
