package com.chell.shopping.creditcard;

public class Shopping implements Comparable<Shopping> {
    private String productName;
    private double value;

    public Shopping(String productName, double value) {
        this.productName = productName;
        this.value = value;
    }

    public String getProductName() {
        return productName;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Product: " + productName + " - $" + value + '\n';
    }

    @Override
    public int compareTo(Shopping otherShopping) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherShopping.value));
    }
}
