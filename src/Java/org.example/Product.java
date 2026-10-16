/*
Create a Product class with product ID, name, price, and stock quantity.
Add methods to display details, add stock, reduce stock after a sale, and calculate stock value (price * quantity).
Do not allow sales that exceed available stock.
 */

package org.example;

public class Product {
    String productId;
    String productName;
    double price;
    int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void displayDetails(){
        System.out.println("\n" + "product ID:" + this.productId + " product name:" + this.productName + " Price:" + this.price + " stock quantity:S" + this.stockQuantity);
    }

    public int addStock(int num){

        this.stockQuantity += num;

        return this.stockQuantity;
    }


    public int reduceStock(int num){


        if(num > this.stockQuantity)
        {
            System.out.println("Sales exceeds available stock");
            System.out.println("Stock quantity did not change ");

        }
        else
        {
            this.stockQuantity -= num;

        }




        return this.stockQuantity;
    }

    public double stockValue(){
        double finAmnt =0.0;

        finAmnt = this.price * this.stockQuantity;

        return finAmnt;
    }


}
