public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(6.3, 2.6);
        rect.rectDisplay();
    }
}
    class Rectangle {
        double length;
        double width;

        public Rectangle (double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double calculateArea () {
            return length * width;
        }

        public void rectDisplay() {
            System.out.println("Rectangle details : ");
            System.out.println("Length --> "+ length);
            System.out.println("Width --> "+ width);
            System.out.println("Area --> "+ calculateArea());
        }
    }