package view;

import database.StudentData;
import service.StudentService;

import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();
    public void displayMenu () {
        System.out.println("1. Nhap sinh vien \n2. In danh sach sinh vien\n3. Thoat");
        System.out.printf("Nhap lua chon: ");
    }

    public void menuSelect (Scanner scanner) {
        boolean loop = true;
        do {
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.studentInput(scanner);
                    break;
                case 2:
                    studentService.classify();
                    studentService.display(StudentData.studentList);
                    break;
                case 3:
                    loop = false;
            }
        } while (loop == true);

    }
}
