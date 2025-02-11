package com.emsi.kbcontrole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDateNaissance(String dateNaissance);
}