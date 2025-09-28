package com.example.Lab_3.services;

import com.example.Lab_3.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    public class StudentLists {
        private List<StudentLists> items = new ArrayList<>();

        public StudentLists() {
            items.add(new StudentLists(1L,"Nazerke", "Abdimalik", 99, "A+"));
        }

        public List<StudentLists> getAllItems() {
            return items;
        }
    }
