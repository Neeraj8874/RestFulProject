package com.neerajc.hibernateJPA.pojo;

public class Labour {
int lid;
String lname;
int lsalary;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getLsalary() {
	return lsalary;
}
public void setLsalary(int lsalary) {
	this.lsalary = lsalary;
}
@Override
public String toString() {
	return "Labour [lid=" + lid + ", lname=" + lname + ", lsalary=" + lsalary + "]";
}


}
