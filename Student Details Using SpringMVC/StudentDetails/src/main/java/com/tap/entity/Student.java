package com.tap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="S_No")
	private int sNo;
	@Column(name="Name")
	private String name;
	@Column(name="English")
	private int english;
	@Column(name="Maths")
	private int maths;
	@Column(name="Science")
	private int science;
	@Column(name="Social")
	private int social;
	public Student() {
		super();
	}
	public Student(int sNo, String name, int english, int maths, int science, int social) {
		super();
		this.sNo = sNo;
		this.name = name;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	@Override
	public String toString() {
		return "student [sNo=" + sNo + ", name=" + name + ", english=" + english + ", maths=" + maths + ", science="
				+ science + ", social=" + social + "]";
	}
}
