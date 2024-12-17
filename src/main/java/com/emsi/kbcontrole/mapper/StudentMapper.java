package com.emsi.kbcontrole.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.emsi.kbcontrole.dao.Student;
import com.emsi.kbcontrole.dto.StudentDTO;

@Component
public class StudentMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public StudentDTO toDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }

    public Student toEntity(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }
}