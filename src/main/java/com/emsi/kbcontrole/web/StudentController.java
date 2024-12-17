package com.emsi.kbcontrole.web;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.emsi.kbcontrole.dao.Student;
import com.emsi.kbcontrole.dto.StudentDTO;
import com.emsi.kbcontrole.services.StudentService;


@Controller
public class StudentController {

	@Autowired
    private  StudentService studentService;

    @MutationMapping
    public Student saveStudent(@Argument StudentDTO student) {
        return studentService.saveStudent(student);
    }

    @QueryMapping
    public List<StudentDTO> getStudentsByDateNaissance(@Argument String dateNaissance) {
        return studentService.getStudentsByDateNaissance(dateNaissance);
    }
}
