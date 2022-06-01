package com.jbk.HieberNetDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
String course;



public Student(int id, String name, String course) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
}
public Student() {
	super();

}
public Student(String name, String course) {
	super();
	this.name = name;
	this.course = course;
}
}
