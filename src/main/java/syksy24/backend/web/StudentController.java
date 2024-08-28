package syksy24.backend.web;

import java.util.ArrayList;
import java.util.List;

import syksy24.backend.domain.Student;

public class StudentController {

    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("Pekka", "Pouta"));
        studentList.add(new Student("Kyösti", "Pöysti"));
        studentList.add(new Student("Maurizio", "Undercover"));
    }
    
}
