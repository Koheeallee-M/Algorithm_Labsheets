
//include the package name if required
/*
* Implementation of class Employee
* An employee has an employee ID, a name and a salary, is attached to a department, and works on projects. 
*/
public class Employee {
	private String empID;
	private String name;
	private String department;
	private String[] projects;
	private double salary;
	
	public Employee(String empID, String name, String department, String[] projects, double salary) {
		// constructor
		this.empID = empID;
		this.name = name;
		this.department = department;
		this.projects = projects;
		this.salary = salary;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String[] getProjects() {
		return projects;
	}

	public void setProjects(String[] projects) {
		this.projects = projects;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		// returns a string representation of the employee object - used in print statements
		String str= "\tEmployee ID: " + empID + "\n\tName: " + name + "\n\tDepartment: " + department + "\n\tProject(s): ";
		for(String project : projects)
			str += "\n\t\t" + project;
		str += "\n\tSalary: " + salary;
		return str;
	}
} //end class Employee 