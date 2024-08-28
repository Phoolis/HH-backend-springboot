package syksy24.backend.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import syksy24.backend.domain.Student;

@Controller
public class StudentController {

    // class-level variable to store the list of students
    private static List<Student> studentList = new ArrayList<>();

    // populate the list with students
    static {
        studentList.add(new Student("Pekka", "Pouta"));
        studentList.add(new Student("Kyösti", "Pöysti"));
        studentList.add(new Student("Maurizio", "Undercover"));
    }
    
    @RequestMapping("/main")
    public String showMainPage() {
        return "main";
    }

    @GetMapping("/studentlist")
    public String showStudents(Model model) {
        model.addAttribute("students", studentList);
        return "studentList";
    }
}
