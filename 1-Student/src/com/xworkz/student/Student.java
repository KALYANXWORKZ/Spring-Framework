package com.xworkz.student;

public class Student {
	private int usn;
	private String name;
	private String branch;
	private String college;
	private String university;
	private double feesPerYear;
	private int totalStregnth;
	private int noOfBoys;
	private int noOfGirls;
	private int noOfFaculties;
	private String location;
	private String state;
	private String country;
	private String continent;
	private int courseDuration;
	private String principalName;

	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public double getFeesPerYear() {
		return feesPerYear;
	}

	public void setFeesPerYear(double feesPerYear) {
		this.feesPerYear = feesPerYear;
	}

	public int getTotalStregnth() {
		return totalStregnth;
	}

	public void setTotalStregnth(int totalStregnth) {
		this.totalStregnth = totalStregnth;
	}

	public int getNoOfBoys() {
		return noOfBoys;
	}

	public void setNoOfBoys(int noOfBoys) {
		this.noOfBoys = noOfBoys;
	}

	public int getNoOfGirls() {
		return noOfGirls;
	}

	public void setNoOfGirls(int noOfGirls) {
		this.noOfGirls = noOfGirls;
	}

	public int getNoOfFaculties() {
		return noOfFaculties;
	}

	public void setNoOfFaculties(int noOfFaculties) {
		this.noOfFaculties = noOfFaculties;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", branch=" + branch + ", college=" + college
				+ ", university=" + university + ", feesPerYear=" + feesPerYear + ", totalStregnth=" + totalStregnth
				+ ", noOfBoys=" + noOfBoys + ", noOfGirls=" + noOfGirls + ", noOfFaculties=" + noOfFaculties
				+ ", location=" + location + ", state=" + state + ", country=" + country + ", continent=" + continent
				+ ", courseDuration=" + courseDuration + ", principalName=" + principalName + "]";
	}

}
