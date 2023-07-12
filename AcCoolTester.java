class TelevisionTester{
	
	public static void main(String test[]){
		 System.out.println("main started");
		 boolean connected= Television.onOrOff();
		 
		 System.out.println("is Television connected" +connected);
		 Television.increaseTemp();
		 Television.increaseTemp();
		 Television.increaseTemp();
		 
		 Television.decreaseTemp();
		 Television.decreaseTemp();
		 
		 boolean connected1 = Television.onOrOff();
		 System.out.println("is connected" + connected1);
		 
		 Television.decreaseTemp();
		 Television.decreaseTemp();
		 
		 Television.increaseTemp();
		 Television.increaseTemp();
		 Television.increaseTemp();
		 
		 System.out.println("Televisionis off enjoy.......");
		 System.out.println("main ended");
	}
	
	
}
