package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
