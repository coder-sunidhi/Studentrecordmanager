import java.util.*;

// Student class
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

    // Getters
    public int getId() { return id; }
    public int getAge() { return age; }
    public String getCourse() { return course; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +
                ", Age: " + age + ", Course: " + course;
    }
}

// Service class
class StudentService {

    private ArrayList<Student> studentList = new ArrayList<>();   // ✅ REQUIRED
    private HashSet<Integer> idSet = new HashSet<>();             // ✅ REQUIRED

    public void addStudent(Student s) {
        if (idSet.contains(s.getId())) {
            System.out.println("ID already exists!");
            return;
        }

        studentList.add(s);
        idSet.add(s.getId());
        System.out.println("Student added!");
    }

    public void searchStudent(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("No records.");
            return;
        }

        // ✅ Using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (Student s : studentList) {
            sb.append(s.toString()).append("\n");
        }

        System.out.println(sb.toString());
    }

    public void deleteStudent(int id) {
        Iterator<Student> it = studentList.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            if (s.getId() == id) {
                it.remove();
                idSet.remove(id);
                System.out.println("Deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            try {
                System.out.println("\n1.Add 2.Search 3.Display 4.Delete 5.Exit");
                System.out.print("Enter choice: ");
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
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter correct data.");
                sc.nextLine(); // clear buffer
            }
        }
    }
}
