public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 8500.0);
        p1.displayProduct();
    }
}
    class Product {
        int id;
        String name;
        double price;

        public Product (int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public void displayProduct() {
            System.out.println("Product ID : "+ id);
            System.out.println("Product name : "+ name);
            System.out.println("Product Price : "+ price);
        }
    }