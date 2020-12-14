package application;

public class admission {
private String student,email,father,gender,Addr,Univ1,Univ2,DOB;
private int per1,year1,per2,year2 ;
public admission(String student,String email,String father,String gender,String Addr,String Univ1,int per1,int year1,String Univ2,int per2,int year2,String DOB) {
	this.student = student;
	this.email = email;
	this.father = father;
	this.gender = gender;
	this.Addr = Addr;
	this.Univ1 = Univ1;
	this.Univ2 = Univ2;
	this.DOB = DOB;
	this.per1 = per1;
	this.per2 = per2;
    this.year1 = year1;
	this.year2 = year2;
	
	
	
	
}
public String getStudent() {
	return student;
}
public void setStudent(String student) {
	this.student = student;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFather() {
	return father;
}
public void setFather(String father) {
	this.father = father;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddr() {
	return Addr;
}
public void setAddr(String addr) {
	Addr = addr;
}
public String getUniv1() {
	return Univ1;
}
public void setUniv1(String univ1) {
	Univ1 = univ1;
}
public String getUniv2() {
	return Univ2;
}
public void setUniv2(String univ2) {
	Univ2 = univ2;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public int getPer1() {
	return per1;
}
public void setPer1(int per1) {
	this.per1 = per1;
}
public int getYear1() {
	return year1;
}
public void setYear1(int year1) {
	this.year1 = year1;
}
public int getPer2() {
	return per2;
}
public void setPer2(int per2) {
	this.per2 = per2;
}
public int getYear2() {
	return year2;
}
public void setYear2(int year2) {
	this.year2 = year2;
}

}
