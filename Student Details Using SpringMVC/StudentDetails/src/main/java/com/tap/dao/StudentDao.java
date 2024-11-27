package com.tap.dao;

import java.util.List;

import com.tap.entity.Student;

public interface StudentDao {
	void addStudent(Student student);
    Student getStudent(int sNo);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(int sNo);
}
