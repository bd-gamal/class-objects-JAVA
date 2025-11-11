public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println("Détails de voiture 1 :");
        car1.displayCar();

        System.out.println();

        Car car2 = new Car("Ferrari", "Enzo Ferrari", 1978);
        System.out.println("Détails de voiture 2 :");
        car2.displayCar();
    }
}

class Car {
    String brand;
    String model;
    int year;

    public Car() {
        this.brand = "Inconnu";
        this.model = "Inconnu";
        this.year = 0;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayCar() {
        System.out.println("Brand : "+ brand);
        System.out.println("Model : "+ model);
        System.out.println("Year : "+ year);
    }
}