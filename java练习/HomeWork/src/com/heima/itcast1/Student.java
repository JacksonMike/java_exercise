package com.heima.itcast1;

public class Student {
    private String name;
    private int age;
    private char sex;
    private int StudentNum;
    private int ClassNum;
    public Student(String name,int age,char sex,int StudentNum,int ClassNum) {
     	this.name = name;
     	this.age = age;
     	this.sex = sex;
     	this.StudentNum = StudentNum;
     	this.ClassNum = ClassNum;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getStudentNum() {
		return StudentNum;
	}
	public void setStudentNum(int studentNum) {
		StudentNum = studentNum;
	}
	public int getClassNUm() {
		return ClassNum;
	}
	public void setClassNUm(int classNUm) {
		ClassNum = classNUm;
	}  
}
