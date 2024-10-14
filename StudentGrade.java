import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();

        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            String markInput = scanner.nextLine();
            try {
                marks[i] = Integer.parseInt(markInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter valid integer marks.");
                i--;
            }
        }

        double percentage = (marks[0] + marks[1] + marks[2]) / 3.0;
        char grade;
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 50)
            grade = 'C';
        else
            grade = 'D';

        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
