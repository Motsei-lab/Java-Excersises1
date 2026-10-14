package org.example;

public class Product {
    String productId;
    String productName;
    double price;
    int stockQuantity;

    Product(String productId,String productName, double price, int stockQuantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void displayDetails(){
        System.out.println("\n" + "product ID: " + this.productId + " product name:" + this.productName + "Price:" + this.price + "stock quantity" + this.stockQuantity);
    }

    public int addStock(){
        int stock=0;
        stock = this.stockQuantity + 1;
        return stock;
    }


}
