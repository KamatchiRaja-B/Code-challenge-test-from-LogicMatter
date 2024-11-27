package com.tap.daoimpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tap.dao.StudentDao;
import com.tap.entity.Student;

@Component("sdaoi")
public class StudentDaoImpl implements StudentDao {
	
	 private Session session;
	 private Transaction t;

	SessionFactory sessionFactory;

	@Autowired
	public StudentDaoImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	// Create
    @Override
    public void addStudent(Student s) {
        session = sessionFactory.openSession();
        t = session.beginTransaction();
        session.persist(s); 
        t.commit();
        session.close();
    }

    // Read all
    @Override
    public ArrayList<Student> getAllStudents() {
        session = sessionFactory.openSession();
        t = session.beginTransaction();
        Query query = session.createQuery("from Student", Student.class);
        ArrayList<Student> studentList = (ArrayList<Student>) query.list();
        t.commit();
        session.close();
        return studentList;
    }

    // Read specific
    @Override
    public Student getStudent(int sNo) {
        session = sessionFactory.openSession();
        t = session.beginTransaction();
        Student student = session.get(Student.class, sNo); 
        t.commit();
        session.close();
        return student;
    }

    // Update
    @Override
    public void updateStudent(Student s) {
        session = sessionFactory.openSession();
        t = session.beginTransaction();
        session.update(s); 
        t.commit();
        session.close();
    }

    // Delete
    @Override
    public void deleteStudent(int sNo) {
        session = sessionFactory.openSession();
        t = session.beginTransaction();
        Student student = session.get(Student.class, sNo);
        if (student != null) {
            session.delete(student);
        }
        t.commit();
        session.close();
    }
}
