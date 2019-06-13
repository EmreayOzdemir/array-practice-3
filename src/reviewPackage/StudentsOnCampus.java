package reviewPackage;

public class StudentsOnCampus extends Student{
	private boolean isOnCampus;
	public StudentsOnCampus(String name, int age, char gender, int students_id) {
		super(name, age, gender, students_id);
		
		
	}
	
public void goToCampus() {
	if(isOnCampus==false) {
		isOnCampus=true;
		System.out.println("coming to the campus..");
	}else {
		System.out.println("already in campus");
	}
	
	// we need it, in order to access isOnCampus
	  // instance variable outside
	
}
public boolean getIsOnCampus() {
    return isOnCampus;
  }
}
