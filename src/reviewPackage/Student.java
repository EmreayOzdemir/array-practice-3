package reviewPackage;

public class Student extends Person{
     private int student_id;
     public static final String SCHOOL_NAME="Cybertek";
	public Student(String name, int age, char gender, int students_id) {
		super(name, age, gender);//super it is being super cool, it is calling parent class.if we need to call parent class constructor  we use super().
		//so we have to match arguments of super constructor.
		this.student_id=student_id;
		System.out.println("student constructor");
	}
	public String toString() {
		return"Student [name="+getName()+", age="+ getAge()+", gender="+getGender()+", student_id="+student_id+"]";
	}


}
