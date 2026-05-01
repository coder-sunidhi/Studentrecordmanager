import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentRecordsManager {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        HashMap<String, Integer> marksMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do {
            System.out.println("\n=== Student Records Manager ===");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
                case 1: // Add
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    
                    if (!students.contains(name)) {
                        students.add(name);
                        marksMap.put(name, marks);
                        System.out.println("✅ Student added successfully!");
                    } else {
                        System.out.println("Student already exists!");
                    }
                    break;
                    
                case 2: // Search
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();
                    if (marksMap.containsKey(searchName)) {
                        System.out.println(searchName + " -> Marks: " + marksMap.get(searchName));
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                    
                case 3: // Display
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("\nAll Students:");
                        for (String s : students) {
                            System.out.println(s + " : " + marksMap.get(s));
                        }
                    }
                    break;
                    
                case 4: // Delete
                    System.out.print("Enter student name to delete: ");
                    String delName = sc.nextLine();
                    if (students.remove(delName)) {
                        marksMap.remove(delName);
                        System.out.println("✅ Student deleted!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                    
                case 5:
                    System.out.println("Thank you! Goodbye 👋");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        
        sc.close();
    }
}
