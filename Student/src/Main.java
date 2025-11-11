public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Abdellah", 20, "B+");
        s1.displayInfo();
    }
}

class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
    }
}

