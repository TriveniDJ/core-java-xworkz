class AirConditionerTester 
{
    public static void main(String[] args) 
	{
        
        boolean connected = AirConditioner.onOrOff();
        System.out.println("speaker is connected " +connected);
        AirConditioner.increaseTemperature();
       
        boolean connected1 =AirConditioner.onOrOff();
        System.out.println("speaker is connected " +connected1);
        AirConditioner.decreaseTemperature();


    }
}