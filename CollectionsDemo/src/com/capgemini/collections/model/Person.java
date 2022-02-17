package com.capgemini.collections.model;

public class Person implements Comparable<Person>{
	
	private long aadhar;
	private String name;
	private String location;
	private int pin;
	
	public Person(long aadhar, String name, String location, int pin) {
		this.aadhar = aadhar;
		this.name = name;
		this.location = location;
		this.pin = pin;
	}
	
	@Override
	public int compareTo(Person o) {
		Long aadhar1=this.aadhar;
		Long aadhar2=o.aadhar;
		return (aadhar1.compareTo(aadhar2));
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Person [aadhar=" + aadhar + ", name=" + name + ", location="
				+ location + ", pin=" + pin + "]";
	}


	
	

}
