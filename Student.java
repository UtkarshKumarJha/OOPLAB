package Lab6;

import java.util.Scanner;

public class Student {
    int regno;
    String name;
    int age;

    Student(int n, String na, int a) {
        regno = n;
        name = na;
        age = a;
    }

}

class PG extends Student {
    int semester;
    int fees;

    PG(int reg, String n, int a, int sem, int fee) {
        super(reg, n, a);
        semester = sem;
        fees = fee;
    }

    void Display() {
        System.out.println("Registration Number: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Semester " + semester);
        System.out.println("Fees " + fees);
    }

}

class UG extends Student {
    int semester;
    int fees;

    UG(int reg, String n, int a, int sem, int fee) {
        super(reg, n, a);
        semester = sem;
        fees = fee;
    }

    void Display() {
        System.out.println("Registration Number: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Semester " + semester);
        System.out.println("Fees " + fees);
    }
}

class Main {

    public static void main(String[] args) {
        int u = 0;
        int p = 0;
        char response = 'y';
        while (response == 'y') {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name: ");
            String n = sc.nextLine();
            System.out.print("Enter the reg no.: ");
            int reg = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the age: ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the semester: ");
            int sem = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the fees: ");
            int fees = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the choice: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "UG":
                    UG ug = new UG(reg, n, a, sem, fees);
                    ug.Display();
                    u = u + 1;
                    break;
                case "PG":
                    PG pg = new PG(reg, n, a, sem, fees);
                    p = p + 1;
                    pg.Display();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.print("Do you want to do another admission? (y/n): ");
            response = sc.next().charAt(0);
            sc.close();
        }

        System.out.println("Number of UG admissions:" + u);
        System.out.println("Number of PG admissions:" + p);
    }
}