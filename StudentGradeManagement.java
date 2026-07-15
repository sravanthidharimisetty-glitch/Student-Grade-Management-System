import java.util.Scanner;
class Student {
    String name;
    int[] marks = new int[3];
    double average;
    char grade;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        average = sum / 3.0;
        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 50)
            grade = 'C';
        else
            grade = 'F';
    }
    void display() {
        System.out.println("\n----- Student Report -----");
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks[0] + " " + marks[1] + " " + marks[2]);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}