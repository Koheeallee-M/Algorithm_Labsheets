/*A garage needs to store information about the services it provides for vehicles. For each servicing
it performs in a day, it wishes to store the servicing number, the registration number of the
vehicle, the name of the vehicle owner and the cost of the servicing.
i. Create a class Servicing with the following attributes:
 servicingNum (int)
 registrationNum (String)
 ownerName (String)
 charge (double)
and the following methods:
 Default constructor.
 Accessor and mutator methods for each of the attributes.
 Method toString() to make it easier to display details pertaining to one servicing object.

 To enter a servicing number and the program displays all information for the
corresponding servicing object.
 To display of the average charge for servicing objects in the array.
The program should then perform the task chosen by the user. An option should also be
provided to exit the program.*/
public class Servicing {
	private int servicingNum;
	private String registrationNum;
	private String ownerName;
	private double charge;
	
	public Servicing() {
		servicingNum = 0;
		registrationNum = "0";
		ownerName = "";
		charge = 0.0;
	}
	
	public void setservicingNum(int servnum){
		servicingNum = servnum; 
	}
	public int getservicingNum() {
		 return servicingNum;
	}
	
	
	public void setregistrationNum(String regnum) {
		registrationNum = regnum; 
	}
	public String getregistrationNum(){
		 return registrationNum;
	}
	
	
	public void setownerName(String ownname){
		ownerName = ownname; 
	}
	public String getownerName() {
		 return ownerName;
	}
	
	
	public void setcharge(double chrg){
		charge = chrg; 
	}
	
	public double getcharge() {
		 return charge;
	}
	
	
	public String toString() {
		return ("Servicing number:" + servicingNum + "\n" + "Registration number:" + registrationNum + "\n" + "Owner:" + ownerName + "\n" + "Price charged:" + charge);
	}
}
