package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
