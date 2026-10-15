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
