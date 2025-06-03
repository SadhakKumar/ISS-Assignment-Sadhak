package com.sadhak.corejava.collectionoperations;

public class Student implements Comparable<Student> {
    // This class represents a Student with properties like name, age, and grade.
    private String name;
    private int id;
    private String grade;

    // Constructor to initialize the Student object with name, id, and grade
    public Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getters for the properties
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    // Overriding the toString method from the object class to provide a string
    // representation of the Student object
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + id +
                ", grade='" + grade + '\'' +
                '}';
    }

    // Overriding the equals method to compare Student objects based on their
    // properties
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Student))
            return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name);
    }

    // Overriding the hashCode method from the object class to provide a hash code
    @Override
    public int hashCode() {
        return 31 * id + name.hashCode();
    }

    // Overriding the compareTo method from the Comparable interface
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

}
