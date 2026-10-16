
/*
Create a Product class with name, price, and quantity.
In the main class, create an array of at least four products,
calculate line totals and the subtotal,
 apply a 10% discount if the subtotal exceeds 1,000,
 and display a receipt with line totals, subtotal, discount, and final total.
 */
public class products {
    String prodName;
    double price;
    int quantity;

    products(String prodName, double price, int quantity)
    {
        this.prodName = prodName;
        this.price = price;
        this.quantity = quantity;
    }
    double calculateStock(){
        return price * quantity;
    }

    @Override
    public String toString()
    {
        return "Product " + prodName + " price " + price + " quantity " + quantity;
    }

}
