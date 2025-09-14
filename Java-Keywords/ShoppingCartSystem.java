class Product {
    static double discount = 10.0; // in percentage

    private String productName;
    private double price;
    private int quantity;
    public final int productID;

    // Constructor using 'this'
    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails() {
        if (this instanceof Product) {
            double total = price * quantity;
            double finalPrice = total - (total * discount / 100);
            System.out.println("Product: " + productName + ", ID: " + productID +
                               ", Qty: " + quantity + ", Price: " + price +
                               ", Final Price after " + discount + "% discount: " + finalPrice);
        }
    }

    // ✅ Add this main method
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 301);
        Product p2 = new Product("Phone", 20000, 2, 302);

        p1.displayDetails();
        p2.displayDetails();
        Product.updateDiscount(15); // update discount to 15%
        p1.displayDetails();
    }
}
