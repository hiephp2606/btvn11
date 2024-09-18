package service;

import entities.Student;

import java.util.Scanner;

public class StudentService {
    public Student studentInput (Scanner scanner) {
        System.out.printf("Nhap ten sinh vien: ");
        String name = scanner.nextLine();
        System.out.printf("Nhap tuoi sinh vien: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhap diem sinh vien: ");
    }
}
