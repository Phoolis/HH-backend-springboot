package syksy24.backend.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import syksy24.backend.domain.Student;

public class StudentController {

    // class-level variable to store the list of students
    private static List<Student> studentList = new ArrayList<>();

    // populate the list with students
    static {
        studentList.add(new Student("Pekka", "Pouta"));
        studentList.add(new Student("Kyösti", "Pöysti"));
        studentList.add(new Student("Maurizio", "Undercover"));
    }
    
    @GetMapping("/studentlist")
    public String showStudents(Model model) {
        model.addAttribute("students", studentList);
        return "studentList";
    }
}
