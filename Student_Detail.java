public class Student_Detail {
    private String name;
    private int id;
    private final String college_name;

    public Student_Detail(String name, int id, String college_name) {
        this.name = name;
        this.id = id;
        this.college_name = college_name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College Name: " + college_name);
    }

    public static void main(String[] args) {

        Student_Detail student1 = new Student_Detail("Utkarsh", 123, "MIT");
        Student_Detail student2 = new Student_Detail("Jane Smith", 456, "MIT");

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
    }
}
