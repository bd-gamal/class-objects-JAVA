public class Main {
    public static void main(String[] args){
        Tempurature temp = new Tempurature(29.0);
        temp.display();
    }
}

class Tempurature {
    double celsius;

    public Tempurature(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public void display() {
        System.out.println("Température en Celsius : "+ celsius);
        System.out.println("Température en Fahrenheit : "+ toFahrenheit());
    }
}