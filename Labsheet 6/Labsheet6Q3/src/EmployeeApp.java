
//include the package name if required

public class EmployeeApp {
	public static void main(String[] args) {
		final int MAX_NUM_EMPLOYEE = 10;							// define a constant
		Employee[] empRecords = new Employee[MAX_NUM_EMPLOYEE];		// create an array to store MAX_NUM_EMPLOYEE employee objects
		int index = 0;
		Employee emp;
		String projectName = "Transport booking system";
		
		// create Employee objects and store them in array empRecords
		empRecords[0] = new Employee("10001", "Tom Sawyer", "IT", new String[]{"HR system", "Transport booking system"}, 75000);
		empRecords[1] = new Employee("10002", "Bart Simpson", "HR", new String[]{"Recruitment", "Staff appraisal"}, 50000);
		empRecords[2] = new Employee("10003", "Bugs Bunny", "IT", new String[]{"Website maintenance", "Network maintenance", "Transport Booking system"}, 73500);
		empRecords[3] = new Employee("10004", "Donald Duck", "Accounting", new String[]{"PR processing", "Loan processing"}, 42000);
		empRecords[4] = new Employee("10005", "Shaggy Rogers", "IT", new String[]{"Server maintenance"}, 75000);
		empRecords[5] = new Employee("10006", "Woody Woodpecker", "Accounting", new String[]{"Budget forecast", "Financial statements"}, 35400);
		empRecords[6] = new Employee("10007", "Peppa Pig", "Accounting", new String[]{"Payroll", "Transport booking system"}, 63600);
		
		// display details of all employee objects in the array empRecords
		System.out.println("Employees:-");
		emp = empRecords[index];
		while(emp != null) {
			System.out.println(emp);
			System.out.println();
			emp = empRecords[++index];
		}
		
		// call method employeeName
		System.out.println("Employees working on the project '" + projectName + "': ");
		employeeName(empRecords, projectName);
		
	} // end main
		
	public static void employeeName(Employee[] employeeRecords, String projectName) {
		/*
		 * arguments: 	An array of employees, employeeRecords, and the name of a project, projectName
		 * description:	Finds and prints the names of all employees working on project projectName 
		 * return:		-
		 */

		for (int i = 0; i < employeeRecords.length; i++) {
            if (employeeRecords[i] != null) {
                String[] projects = employeeRecords[i].getProjects();
                for (int j = 0; j < projects.length; j++) {
                    if (projects[j].equals(projectName)) {
                        System.out.println(employeeRecords[i].getName());
                        break;
                    }
                }
            }
        }
  

		
		
		// PROVIDE YOUR IMPLEMENTATION FOR THIS METHOD AFTER THIS COMMENT
		
		
		
		
	} // end departmentName
} // end class