import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +
                ", Age: " + age + ", Course: " + course;
    }
}

class StudentService {
    private HashMap<Integer, Student> students = new HashMap<>();

    public void addStudent(Student s) {
        if (students.containsKey(s.getId())) {
            System.out.println("ID already exists!");
            return;
        }
        students.put(s.getId(), s);
        System.out.println("Student added!");
    }

    public void searchStudent(int id) {
        Student s = students.get(id);
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("Not found!");
        }
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No records.");
            return;
        }
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        if (students.remove(id) != null) {
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1.Add 2.Search 3.Display 4.Delete 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    service.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    service.searchStudent(sc.nextInt());
                    break;

                case 3:
                    service.displayAll();
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
