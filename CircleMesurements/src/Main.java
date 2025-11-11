public class Main {
    public static void main(String[] args){
        Cercle cercle = new Cercle(3.0);
        cercle.display();
    }
}

class Cercle {
    double radius;

    public Cercle (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Mesures de cercle :");
        System.out.println("Rayon : "+ radius);
        System.out.println("L'aire : "+ getArea());
        System.out.println("Circonférence : "+ getCircumference());
    }
}