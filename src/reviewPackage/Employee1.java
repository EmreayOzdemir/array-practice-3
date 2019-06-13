package reviewPackage;

public class Employee1 extends Person {

		
	

	private int employee_id;
	  private int salary;
	  //this is a constant for max salary 
	  //we shouldn't have employees who has higher salary than max_salary
	  final private int MAX_SALARY=1500000;

	  public Employee1(String name, int age, char gender, int employee_id, int salary) {
	    super(name, age, gender);
	    this.employee_id = employee_id;
	    this.salary = salary;

	  }

	  public int getEmployee_id() {
	    return employee_id;
	  }

	  public void setEmployee_id(int employee_id) {
	    this.employee_id = employee_id;
	  }

	  public int getSalary() {
	    return salary;
	  }

	  public void setSalary(int salary) {
		  if(salary<=MAX_SALARY) {
			  
		  }
	    this.salary = salary;
	  }

	  @Override
	  public String toString() {
	    return "Employee [name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + ", employee_id="
	        + employee_id + ", salary=" + salary + "]";
	  }

	}



