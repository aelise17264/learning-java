package OOP;

public class Employee2 {
    private String name;
    protected double salary;
    private int age;

    public Employee2(String name, double salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
     
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }

}
