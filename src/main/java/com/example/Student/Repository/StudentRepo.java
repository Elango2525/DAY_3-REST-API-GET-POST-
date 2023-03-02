package com.example.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.StudentDetails;

public interface StudentRepo extends JpaRepository<StudentDetails,Integer> {

}
