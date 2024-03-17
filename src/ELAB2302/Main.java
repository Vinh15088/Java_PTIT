package ELAB2302;

import java.util.Scanner;
import java.util.ArrayList;

class Student {
    protected String name;
    protected int age;
    protected static int studentCount = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

    void display() {
        System.out.println(name);
    }

    public static int getStudentCount() {
        return studentCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while(scanner.hasNextLine()) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            String age = scanner.nextLine();

            int ageNew = Integer.parseInt(age);
            Student student = new Student(name, ageNew);
            students.add(student);
        }

        for(Student student:students) {
            if(student.age >= 18) {
                student.display();
            }
        }

        int count = Student.getStudentCount();
        System.out.println(count);
    }
}