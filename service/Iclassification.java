package service;

import entities.Student;

import java.util.List;

public interface Iclassification {
    void classify();
    void display(List<Student> studentList);
}
