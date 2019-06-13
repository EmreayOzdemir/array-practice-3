

	class test1{
		
		public void method1() {
			System.out.println("A");
		}
		
		public final static void method2() {
			
		}
		
		private void method3() {
			
		}
		
		
		
		
	}





	public class OverrideReview extends test1 {
		
			@Override   // checks if the method is being override or not
			public void method1() {
					System.out.println("B");
				}
			
//			@Override
//			public static void method2() {         
			//   only instance methods taht are not final not private can be override
//				
//			}
		
		/*
		  override:  method needs to be override in the sub class.
		  			cannot override a methods within the class
		  			
		  			
		  			
		  		
		 */
			public static void main(String[] args) {
						method2() ;
}
}