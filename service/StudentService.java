package service;

import database.StudentData;
import entities.Student;

import java.util.List;
import java.util.Scanner;

public class StudentService implements Iclassification {
//    studentInput
    public void studentInput (Scanner scanner) {
        boolean loop = true;
        System.out.printf("Nhap ten sinh vien: ");
        String name = scanner.nextLine();
        System.out.printf("Nhap tuoi sinh vien: ");
        int age = Integer.parseInt(scanner.nextLine());
        double marksTest = 0;
        do {
            System.out.printf("Nhap diem sinh vien: ");
            double marks = Double.parseDouble(scanner.nextLine());
            if (marks > 10) {
                System.out.println("Diem so phai nho hon 10");
            }
            else if (marks < 0) {
                System.out.println("Diem so phai lon hon 0");
            }
            else {
                marksTest = marks;
                loop = false;
            }
        } while (loop == true);
        String classify = "";
        StudentData.studentList.add(new Student(name, age, marksTest, classify));
    }


//    Interface
    @Override
    public void classify() {
        for (Student student : StudentData.studentList) {
            if (student.getMarks() >= 8) {
                student.setClassification("A");
            } else if (student.getMarks() <= 6.5) {
                student.setClassification("C");
            }
            else {
                student.setClassification("B");
            }
        }
    }

    @Override
    public void display(List<Student> studentList) {
        System.out.println(studentList);
    }
}
