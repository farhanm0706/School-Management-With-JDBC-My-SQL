package Model;

public class TeacherModel {
private String teachId;
private String name;
private long phone;
private String graduation;
private String lastWork;
private double salary;
public TeacherModel(String teachId, String name, long phone, String graduation, String lastWork, double salary) {
	super();
	this.teachId = teachId;
	this.name = name;
	this.phone = phone;
	this.graduation = graduation;
	this.lastWork = lastWork;
	this.salary = salary;
}
public TeacherModel() {
	// TODO Auto-generated constructor stub
}
public String getTeachId() {
	return teachId;
}
public void setTeachId(String teachId) {
	this.teachId = teachId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getGraduation() {
	return graduation;
}
public void setGraduation(String graduation) {
	this.graduation = graduation;
}
public String getLastWork() {
	return lastWork;
}
public void setLastWork(String lastWork) {
	this.lastWork = lastWork;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
