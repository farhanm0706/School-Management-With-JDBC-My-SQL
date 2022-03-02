package Model;

public class PrincipalModel {
	private String PrinciId;
	private String Name;
	private long phone;
	private String Highest_Graduation;
	private String WorkPlace;
	private double Salary;
	public PrincipalModel(String princiId, String name,long Phone ,String highest_Graduation, String workPlace, double salary) {
		super();
		PrinciId = princiId;
		Name = name;
		phone=Phone;
		Highest_Graduation = highest_Graduation;
		WorkPlace = workPlace;
		Salary = salary;
	}
	
	public PrincipalModel() {
		// TODO Auto-generated constructor stub
	}

	public String getPrinciId() {
		return PrinciId;
	}
	public void setPrinciId(String princiId) {
		PrinciId = princiId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getphone()
	{
		return phone;
	}
	public void setphone(long Phone)
	{
		phone=Phone;
	}
	public String getHighest_Graduation() {
		return Highest_Graduation;
	}
	public void setHighest_Graduation(String highest_Graduation) {
		Highest_Graduation = highest_Graduation;
	}
	public String getWorkPlace() {
		return WorkPlace;
	}
	public void setWorkPlace(String workPlace) {
		WorkPlace = workPlace;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
}
