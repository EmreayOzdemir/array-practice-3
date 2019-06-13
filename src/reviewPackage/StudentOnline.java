package reviewPackage;

public class StudentOnline extends Student{
      private boolean isOnline;
	public StudentOnline(String name, int age, char gender, int students_id) {
		super(name, age, gender, students_id);
		System.out.println("StudentOnline constructor");
		
	}
	public void joinZoom() {
		if(isOnline==false) {//this method will set status of isOnline variable, like a setter method, it sets status
			isOnline=true;
			System.out.println("joining class online");
		}else {
			System.out.println("already joined to class");
		}
		
	}//will return value of isOnline instance variable
	//it is not an action it is like a status report
	public boolean getIsOnline() {
		return isOnline;
	}

}
