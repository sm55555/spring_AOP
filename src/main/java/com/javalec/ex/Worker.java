package com.javalec.ex;

public class Worker {
	private String name;
	private int num;
	private String job;

	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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


	public void getWorkerInfo() {
		System.out.println("Name is " + getName());
		System.out.println("Num is " + getNum());
		System.out.println("Job is " + getJob());
	}
}
