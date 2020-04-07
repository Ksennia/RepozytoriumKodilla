package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderServiсe{


    @Override
    public boolean order(final User user, final Product product
    ) {
        System.out.println("Buyer " + user.getName() + user.getSurname()
                + " order " + product.getQuantityOfProduct() + " pieces of " +
                product.getNameOfProduct() + " price " + product.getPriceOfProduct());
        System.out.println(product.getPriceOfProduct() * product.getQuantityOfProduct());
        return true;
    }
}
