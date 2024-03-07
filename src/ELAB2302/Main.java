package ELAB2302;

import java.util.Scanner;
import java.util.ArrayList;

class Student {
    protected String name;
    protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name);
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
        int count = 0;
        for(Student student:students) {
            if(student.age >= 18) {
                student.display();
            }
            count++;
        }
        System.out.println(count);
    }
}
