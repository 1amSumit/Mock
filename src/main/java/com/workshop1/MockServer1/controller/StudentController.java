package com.workshop1.MockServer1.controller;

import com.workshop1.MockServer1.model.Student;
import com.workshop1.MockServer1.service.CounterService;
import com.workshop1.MockServer1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CounterService counterService;

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        counterService.incrementStudent();
        return studentService.getAllStudents();
    }

    // Get student by USN
    @GetMapping("/{usn}")
    public Student getStudentByUsn(@PathVariable String usn) {
        counterService.incrementStudent();
        return studentService.getStudentByUsn(usn);
    }

    // Add student with name only (phone can be null)
    @PostMapping("/{usn}/{name}")
    public String addStudent(@PathVariable String usn, @PathVariable String name) {
        counterService.incrementStudent();
        return studentService.addStudent(usn, name, null);
    }

    // Add or update phone number
    @PostMapping("/{usn}/phone/{phone}")
    public String addPhoneNumber(@PathVariable String usn, @PathVariable String phone) {
        counterService.incrementStudent();
        return studentService.updatePhoneNumber(usn, phone);
    }

    // Update student name
    @PutMapping("/{usn}/{name}")
    public String updateStudentName(@PathVariable String usn, @PathVariable String name) {
        counterService.incrementStudent();
        return studentService.updateStudentName(usn, name);
    }

    // Update phone number
    @PutMapping("/{usn}/phone/{phone}")
    public String updatePhoneNumber(@PathVariable String usn, @PathVariable String phone) {
        counterService.incrementStudent();
        return studentService.updatePhoneNumber(usn, phone);
    }

    // Delete student
    @DeleteMapping("/{usn}")
    public String deleteStudent(@PathVariable String usn) {
        counterService.incrementStudent();
        return studentService.deleteStudent(usn);
    }
}
