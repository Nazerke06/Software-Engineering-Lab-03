package com.example.Lab_3.models;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;

    public Student(Long id, String name, String surname, int exam) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.mark = calculateMark(exam);
    }
    private String calculateMark(int exam) {
        if (exam >= 90) return "A";
        if (exam >= 75) return "B";
        if (exam >= 60) return "C";
        if (exam >= 50) return "D";
        return "F";
    }

    public Long getId() {return id;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public Integer getExam() {return exam;}
    public String getMark() {return mark;}
}
