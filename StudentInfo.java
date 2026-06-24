import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variables to store student information
        String fullName;
        String indexNumber;
        int age;
        char gender;
        String department;
        int level;
        double gpa;

        // Collect user input
        System.out.print("Enter Full Name: ");
        fullName = scanner.nextLine();

        System.out.print("Enter Index Number: ");
        indexNumber = scanner.nextLine();

        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Gender (M/F): ");
        gender = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Department: ");
        department = scanner.nextLine();

        System.out.print("Enter Level: ");
        level = scanner.nextInt();

        System.out.print("Enter GPA: ");
        gpa = scanner.nextDouble();

        // Determine adult status
        String adultStatus = (age >= 18) ? "YES" : "NO";

        // Determine academic classification
        String academicClass;
        if (gpa >= 3.5 && gpa <= 4.0) {
            academicClass = "First Class";
        } else if (gpa >= 3.0 && gpa < 3.5) {
            academicClass = "Second Class Upper";
        } else if (gpa >= 2.5 && gpa < 3.0) {
            academicClass = "Second Class Lower";
        } else {
            academicClass = "Pass";
        }

        // Display formatted student profile
        System.out.println("\n================================");
        System.out.println("        STUDENT PROFILE");
        System.out.println("================================");
        System.out.println("Name: " + fullName);
        System.out.println("Index: " + indexNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.println("GPA: " + gpa);
        System.out.println("Adult Status: " + adultStatus);
        System.out.println("Academic Class: " + academicClass);
        System.out.println("================================");

        scanner.close();
    }
}