package com.pagination.bean;

public class Emp {
	private String firstName,lastName,email,phone,gender,department,jobTitle;
	private int yearsOfExperience;
	private float salary;
	public Emp() {
		
	}
	public Emp(String firstName,String lastName,String email,String phone,String gender,String department,String jobTitle,int yearsOfExperience,float salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.department = department;
		this.jobTitle = jobTitle;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + ", department=" + department + ", jobTitle=" + jobTitle
				+ ", yearsOfExperience=" + yearsOfExperience + ", salary=" + salary + "]";
	}

}
