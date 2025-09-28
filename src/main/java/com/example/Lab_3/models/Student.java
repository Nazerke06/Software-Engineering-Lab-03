package com.example.Lab_3.models;

public class Student {
    Long id;
    String name;
    String surname;
    int exam;
    String mark;

    public Student(Long id, String name, String surname, int exam, String mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.mark = mark;
    }
    private String calculateMark(int exam) {
        if (exam >= 90) return "A";
        if (exam >= 75) return "B";
        if (exam >= 60) return "C";
        if (exam >= 50) return "D";
        return "F";
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
}
