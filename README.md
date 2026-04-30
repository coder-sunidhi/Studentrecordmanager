Student Record Manager 🎓

A simple Java Console-Based Student Record Management System that allows users to Add, Search, Display, and Delete student records efficiently using HashMap for fast data storage and retrieval.

📌 Repository

GitHub Repo: "Studentrecordmanager"
GitHub Profile: "coder-sunidhi"

---

🚀 Features

✅ Add new student records
✅ Search student by ID
✅ Display all student records
✅ Delete student record by ID
✅ Prevent duplicate Student IDs
✅ Simple menu-driven console interface
✅ Efficient record handling using "HashMap"

---

🛠️ Technologies Used

- Java
- OOP Concepts
  - Classes & Objects
  - Encapsulation
  - Method Overriding
- Collections Framework
  - "HashMap"
- Scanner Class for user input

---

📂 Project Structure

Studentrecordmanager/
│── Main.java
│── README.md

Classes Used

1. "Student"

Stores student details:

- ID
- Name
- Age
- Course

Methods:

- Constructor
- Getter methods
- Setter methods
- "toString()" override for formatted display

---

2. "StudentService"

Handles all student operations:

- "addStudent()"
- "searchStudent()"
- "displayAll()"
- "deleteStudent()"

Uses:

HashMap<Integer, Student>

Where:

- Key = Student ID
- Value = Student Object

This makes searching and deletion O(1) average time complexity.

---

3. "Main"

Contains:

- Menu-driven program loop
- User input handling
- Calls service methods

---

▶️ How to Run

Clone Repository

git clone https://github.com/coder-sunidhi/Studentrecordmanager.git

Open Project

Open in:

- IntelliJ IDEA
- Eclipse
- VS Code
- Any Java IDE

Compile

javac Main.java

Run

java Main

---

💻 Sample Output

1.Add 2.Search 3.Display 4.Delete 5.Exit

ID: 101
Name: Rahul
Age: 20
Course: Computer Science

Student added!

Display:

ID: 101, Name: Rahul, Age: 20, Course: Computer Science

---

🧠 Concepts Demonstrated

This project demonstrates:

- Object-Oriented Programming
- Data Encapsulation
- CRUD Operations
- Java Collections
- Console Application Development

---

🔮 Future Improvements

Possible enhancements:

- Update student details feature
- File storage/database integration
- GUI version using Java Swing / JavaFX
- Sorting records
- Search by name/course
- Validation checks

---

🤝 Contributing

Contributions are welcome.

1. Fork the repo
2. Create a branch
3. Commit changes
4. Open Pull Request

---

📜 License

This project is open-source and available under the MIT License.

---

Made with ❤️ by coder-sunidhi
