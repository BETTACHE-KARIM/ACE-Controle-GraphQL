package com.emsi.kbcontrole.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.emsi.kbcontrole.dao.Student;
import com.emsi.kbcontrole.dao.StudentRepository;
import com.emsi.kbcontrole.dto.StudentDTO;
import com.emsi.kbcontrole.mapper.StudentMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentManager implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public Student saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toEntity(studentDTO);
       

    return  studentRepository.save(student);}

    @Override
    public List<StudentDTO> getStudentsByDateNaissance(String dateNaissance) {
        return studentRepository.findByDateNaissance(dateNaissance)
                                .stream()
                                .map(studentMapper::toDTO)
                                .collect(Collectors.toList());
    }
}