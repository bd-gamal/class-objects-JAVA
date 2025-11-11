public class Main {
    public static void main(String[] args){
        Employee emp1 = new Employee("Arroub Ismail", 12000);
        emp1.display();
    }
}

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double annualSalary() {
        return salary * 12;
    }

    public void display() {
        System.out.println("Name : "+ name);
        System.out.println("Salaire mensuel : "+ salary);
        System.out.println("Salaire annuel : "+ annualSalary());
    }
}