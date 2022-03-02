package Model;

public class StudentModel {
  private String sId;
  private String name;
  private String address;
  private String classname;
public StudentModel(String sId, String name, String address, String classname) {
	super();
	this.sId = sId;
	this.name = name;
	this.address = address;
	this.classname = classname;
}
public String getsId() {
	return sId;
}
public void setsId(String sId) {
	this.sId = sId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
  
}
