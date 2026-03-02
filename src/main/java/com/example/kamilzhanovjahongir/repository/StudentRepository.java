package com.example.kamilzhanovjahongir.repository;


import com.example.kamilzhanovjahongir.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}
