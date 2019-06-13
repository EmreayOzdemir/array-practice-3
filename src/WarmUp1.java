
public class WarmUp1 {


		  
		  int num = getANumber();//Direct cagirmak istersek getA100 ; 
		  
		  {
		    //num = 150; 
		    System.out.println( "init block 1 " );
		  }
		  {
		    //num = 150; 
		    System.out.println( "init block 2 " );
		  }
		  
		  public WarmUp1() {
		  //  num = 150; 
		    num = 200 ; 
		  }
		  
		  public WarmUp1(int x) {
		  //  num = 150; 
		    num = 400 ; 
		  }
		  
		  public static void main(String[] args) {
		    
		    
		    WarmUp1 w = new WarmUp1(); 
		    System.out.println(w.num);
		    

		  }
  public int getANumber() {
	  return 200;
  }
  }

//*comment*/   