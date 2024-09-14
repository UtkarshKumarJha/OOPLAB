package Lab5;

public class Employee {
    String name;
    String city;
    int salary;
    int da;
    int rent;

    void getData(String n, String c, int s, int a, int r) {
        name = n;
        city = c;
        salary = s;
        da = a;
        rent = r;
    }

    int calculate() {
        int total = salary + salary * da / 100 + salary * rent / 100;
        return total;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Salary: " + salary);
        System.out.println("DA: " + da + "%");
        System.out.println("Rent: " + rent + "%");
        System.out.println("Total Salary: " + calculate());

    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData("John", "New York", 5000, 20, 10);
        e.display();

    }

}
