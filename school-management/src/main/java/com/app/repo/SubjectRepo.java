package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Integer>{

	List<Subject> findByName(String name);
}
