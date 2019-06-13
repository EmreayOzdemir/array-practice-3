
public class Stadium {
	 int capacity; 
	  String food; 
	  
	  // ADD 2 ARG CONSTRUCTOR 
	    //--// ADD GETTERS AND SETTERS 
	    // ADD TOSTRING METHOD 

	  public int getCapacity() {
	    return capacity; 
	  }
	  
	  public Stadium(int capacity, String food) {
	    //super();
	    this.capacity = capacity;
	    this.food = food;
	  }

	  @Override
	  public String toString() {
	    return "Stadium [capacity=" + capacity 
	        + ", food=" + food + "]";
	}

	
	}

	//public int getCapacity1() {
		// TODO Auto-generated method stub
		//return 0;
	
