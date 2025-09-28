package com.example.Lab_3.services;

import com.example.Lab_3.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentLists {
    private List<Student> items = new ArrayList<>();

    public StudentLists() {
        items.add(new Student(1L, "Nazerke", "Abdimalik", 95));
        items.add(new Student(2L, "Aidar", "Samatov", 88));
        items.add(new Student(3L, "Aizhan", "Tulegenova", 56));
        items.add(new Student(4L, "Kairat", "Kairatov", 70));
        items.add(new Student(5L, "Madina", "Yerbolova", 81));
    }

    public List<Student> getAllItems() {
        return items;
    }
    public void addStudent(Student student) {
        items.add(student);
    }
    public void deleteStudent(Student student) {
        items.remove(student);
    }
    public String calculateMark(int exam) {
        return items.get(exam).getMark();
    }
}
