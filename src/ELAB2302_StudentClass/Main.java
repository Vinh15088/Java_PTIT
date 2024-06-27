package ELAB2302;

import java.util.Scanner;

class Student {
    private String name;
    private int age;
    public static int numberOfStudent = 0;
    public Student() {};
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }

    public void display() {
        if(age >= 18) System.out.println(name);
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s = new Student();
        while(scanner.hasNextLine()) {
            String name = scanner.nextLine();
            if(name.isEmpty()) break;

            String age = scanner.nextLine();
            int newAge = Integer.parseInt(age);
            Student st = new Student(name, newAge);

            st.display();
        }

        System.out.println(s.getNumberOfStudent());
    }
}