package SP;
import java.util.*;

class Student {
    private String name;
    private String id;
    private String birth;
    private String address;
    private String studentClass;
    private int[] marks;

    public Student(String name, String id, String birth, String address, String studentClass, int[] marks) {
        this.name = name;
        this.id = id;
        this.birth = birth;
        this.address = address;
        this.studentClass = studentClass;
        this.marks = marks;
    }

    public double getAVG() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public String getInfo() {
        return "Name/ID: " + name + "/" + id
                + "\nBirth: " + birth
                + "\nAddress: " + address
                + "\nClass: " + studentClass
                + "\nMarks: " + Arrays.toString(marks);
    }

    public String getAddress() {
        return address;
    }

    public String getStudentClass() {
        return studentClass;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong sv: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien: " + (i + 1));
            scanner.nextLine();
            System.out.print("Name: "); String name = scanner.nextLine();
            System.out.print("ID: "); String id = scanner.nextLine();
            System.out.print("Birth: "); String birth = scanner.nextLine();
            System.out.print("Address: "); String address = scanner.nextLine();
            System.out.print("Class: "); String studentClass = scanner.nextLine();
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Mark " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine();
            students.add(new Student(name, id, birth, address, studentClass, marks));
            System.out.println();
        }

        Collections.sort(students, Comparator.comparing(Student::getAVG).reversed());

        System.out.println("5 Sv có AVG cao nhat:");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < n && i < students.size(); i++) {
            System.out.println(students.get(i).getInfo());
            System.out.println();
        }
        System.out.println("---------------------------------------------------");

        int count = 0;
        for (Student student : students) {
            if (student.getAddress().equals("Quang Ninh") && student.getStudentClass().equals("MIS2021")) {
                count++;
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.println("SV Quang Ninh va lop MIS2021: ");
        for (Student student : students) {
            if (student.getAddress().equals("Quang Ninh") && student.getStudentClass().equals("MIS2021")) {
                System.out.println(student.getInfo());
                System.out.println();
            }
        }
        System.out.println("---------------------------------------------------");

        System.out.println("So SV Quang Ninh va lop MIS2021: " + count);
    }
}
