package com.kodilla.good.patterns.challenges;

public class Product {
    private String nameOfProduct;
    private double priceOfProduct;
    private int quantityOfProduct;

    public Product(String nameOfProduct, double priceOfProduct, int quantityOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }
}
