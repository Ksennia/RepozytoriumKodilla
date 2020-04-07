package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product) {
        System.out.println("Zapisuje dane do bazy danych");
        return true;
    }
}
