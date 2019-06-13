package reviewPackage;

public class Person {
	
	private String name;
	
	private int age;
	private char gender;
	//static not instance we will not set this variable
	//it will be increased any time we create an object
	private static int counter;
	public Person(String name, int age, char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		//once we will create an object counter will be increased by one.
		counter++;
		System.out.println("person constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	//we need this method to check value of counter
	//get method usually stands for
	public static int getCounter(){
		return counter;
		
	}
	//idea of toString methods is to provide string represantation of an object.To convert object into readable string. 
	//to convert object into readable string it translate java to understandable language
	@Override//this override means toString mthod is coming from object class and Object is a superclass for all java classes.
	//every class automatically extends object class. since toString is coming from object class, we are actually changing behavior of original method.tHIS PROCESS CALLS METHOD OVERRIDING.
	//when inheriated method is re-acted in a sub class (same name, same parameters, same return type), this annotation @Override-is optinal
	//but you can put this annotation only on top of overridden method. 
	//if you would like to change method implemntation in the child class, we free to override method.
	//what is method implementation?whatever is inside curly braces{}
	//lets if we will not override toString() method in our custom class-we will not be able to translate (make readable for us) object of custom class. 
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
