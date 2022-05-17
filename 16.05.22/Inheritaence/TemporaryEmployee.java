package model;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emp_store")
public class TemporaryEmployee extends Person {

	
	private String departmentName;

	public TemporaryEmployee(int personId, String name, String departmentName) {
		super(personId, name);
		this.departmentName=departmentName;
		// TODO Auto-generated constructor stub
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

	

}