package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
			new Student(
				1L,
				"Lola",
				"lola@gmail.com",
				LocalDate.of(1999, Month.JANUARY, 14),
				26
			)
		);
    }
}