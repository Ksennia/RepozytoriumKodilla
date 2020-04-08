package com.kodilla.good.patterns.challenges;



public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Steve", "Jobs", "steve.iphoneman@post.domen");
        Product product = new Product("Invisible Pen", 13.0, 3);

        return new OrderRequest(user, product);
    }
}
