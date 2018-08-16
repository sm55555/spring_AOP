package com.javalec.ex;

public class Student {
	private String name;
	private int num;
	private int gradedNum;
	private int classNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getGradedNum() {
		return gradedNum;
	}
	public void setGradedNum(int gradedNum) {
		this.gradedNum = gradedNum;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	public void getStudentInfo() {
		System.out.println("Name is " + getName());
		System.out.println("Num is " + getNum());
		System.out.println("Grade is " + getGradedNum());
		System.out.println("Class is " + getClassNum());
	}

}
