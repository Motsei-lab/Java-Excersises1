package org.example;

public class ShoppingTotal {

    public String productName;
    public double unitPrice;
    public int quantity;

    public double calculateCost(){
        double totalcost;
        totalcost = unitPrice * quantity;

        return totalcost;
    }

    public double dicountedAmt(){
        double discount;

        discount = calculateCost() - calculateCost() * 0.1;
        return discount;
    }

    public void displayAmt(){
        System.out.println("The product name is " + productName);
        System.out.println("The unit price for " + productName + " is R" + unitPrice);
        System.out.println("The quantity bought for " + productName + " is " + quantity);
        System.out.println("The total cost due: R" + calculateCost());
        System.out.println("The discounted amount from the totalcost is " + dicountedAmt());
    }
}
