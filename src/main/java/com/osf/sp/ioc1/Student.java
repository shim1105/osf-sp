package com.osf.sp.ioc1;

public class Student {
	private Person p;   //
	public Student(Person p ) {
		this.p=p;
	}
	@Override
	public String toString() {
		return "Student [p=" + p + "]";
	}
}
