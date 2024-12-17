package com.emsi.kbcontrole.services;

import java.util.List;

import com.emsi.kbcontrole.dao.Student;
import com.emsi.kbcontrole.dto.StudentDTO;

public interface StudentService {
	Student saveStudent(StudentDTO studentDTO);

    List<StudentDTO> getStudentsByDateNaissance(String dateNaissance);
}