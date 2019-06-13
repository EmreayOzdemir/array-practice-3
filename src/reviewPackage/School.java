package reviewPackage;

public class School {

	public static void main(String[] args) {
	
Student s1=new Student("emray", 36, 'F', 1);
System.out.println(s1);
//Student [name=Firuz, age=36, gender=M, student_id=1] toString() only in
// Student
// Person [name=Firuz, age=36, gender=M] - toString() only in Person
// day52_night_session.Student@7852e922 - no toString()
     StudentsOnCampus studentoncampus1 = new StudentsOnCampus("Mensulu", 18, 'F', 2);
    StudentOnline studentonline1 = new StudentOnline("Manzire", 33, 'F', 3);
    System.out.println(studentoncampus1);
    System.out.println(studentonline1);
    studentoncampus1.goToCampus();
    studentoncampus1.goToCampus();
    System.out.println("counter: "+Person.getCounter());
    //Student.SCHOOL_NAME = "Rival IT SDET School";
    System.out.println(Student.SCHOOL_NAME);
    
	}

}
