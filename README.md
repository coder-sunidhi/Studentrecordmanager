# Student Record Manager 🎓

A **Java-based Student Record Management System** built using core Java concepts and data structures for efficient student data handling.

## 🚀 Technologies & Concepts Used

This project is developed using **Java** and demonstrates practical implementation of:

✅ **Java Programming**
✅ **Object-Oriented Programming (OOP)**
✅ **ArrayList** for dynamic data handling
✅ **HashMap** for fast record storage & retrieval
✅ **Error Handling (Exception Handling)** for invalid inputs and smooth execution
✅ **Getter Methods** for secure data access
✅ **StringBuilder** for efficient string formatting/manipulation
✅ **Method Overriding (`toString()`)**
✅ **Scanner Class** for user input handling
✅ **Encapsulation (Private variables + Getters/Setters)**

## 📌 Features

* Add Student Record
* Search Student by ID
* Display All Students
* Delete Student Record
* Duplicate ID prevention
* Clean console-based interface
* Efficient record management using Java Collections

## 🛠 Data Structures Used

### ArrayList

Used for dynamic collection management where sequential storage is needed.

### HashMap

Used for fast lookup of students by ID.

```java
HashMap<Integer, Student>
```

* **Key → Student ID**
* **Value → Student Object**

Provides near **O(1)** search, insert, and delete operations.

## ⚠ Error Handling

The project also includes **Exception Handling** to:

* Handle invalid menu choices
* Prevent wrong input types
* Improve program stability
* Avoid crashes during execution

## 🔐 Getter Methods

Getter methods are used to securely access private student attributes:

```java
public int getId() {
    return id;
}
```

This improves **data security** and follows **encapsulation principles**.

## 🧱 StringBuilder Usage

`StringBuilder` is used for efficient string creation/formatting compared to normal string concatenation, improving performance when building larger strings.

## 💻 Built With

**Language:** Java
**Author:** coder-sunidhi
