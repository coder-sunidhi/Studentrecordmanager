import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Student Records Manager using ArrayList, HashMap & HashSet
 * Demonstrates proper use of all three collections as per requirements.
 */
public class StudentRecordsManager {

    // Collections as per Task Requirement
    private ArrayList<Student> studentsList = new ArrayList<>();        // Ordered list of students
    private HashMap<Integer, Student> studentsMap = new HashMap<>();    // Fast lookup by ID
    private HashSet<Integer> studentIds = new HashSet<>();              // Unique IDs (HashSet)

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new StudentRecordsManager().run();
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = getValidIntegerInput();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> searchStudent();
                case 3 -> displayAllStudents();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Thank you for using Student Records Manager! 👋");
                default -> System.out.println("❌ Invalid option! Please choose 1-5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n=== Student Record Manager ===");
        System.out.println("1. Add New Student");
        System.out.println("2. Search Student by ID");
        System.out.println("3. Display All Students");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private int getValidIntegerInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("❌ Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // Using HashSet to check uniqueness
        if (studentIds.contains(id)) {
            System.out.println("❌ Student with this ID already exists!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();

        Student student = new Student(id, name, marks);

        studentsList.add(student);
        studentsMap.put(id, student);
        studentIds.add(id);                    // HashSet for unique IDs

        System.out.println("✅ Student added successfully!");
    }

    private void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        Student student = studentsMap.get(id);
        if (student != null) {
            System.out.println("✅ Found -> " + student);
        } else {
            System.out.println("❌ Student not found!");
        }
    }

    private void displayAllStudents() {
        if (studentsList.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("\n=== All Students (" + studentsList.size() + ") ===");
        for (Student s : studentsList) {
            System.out.println(s);
        }
    }

    private void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        if (studentsMap.containsKey(id)) {
            Student student = studentsMap.remove(id);
            studentsList.remove(student);
            studentIds.remove(id);

            System.out.println("✅ Student deleted successfully!");
        } else {
            System.out.println("❌ Student not found!");
        }
    }
}
