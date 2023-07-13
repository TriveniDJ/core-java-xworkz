class Hello
{
/*static String vegetables[] = {"potato","tomato","brijal","carrot","onoin"};
static String biskets[] = {"jimjam","crackjack","oreo","dark fantasy","cream biscket","crack jack","parleyG","unibic","milk bisckts","treat"};
static String groceries[] ={"oil","soap","dals","powder","wheat flour","sunflower oil","rice flour","rinbar","bulb","milk"};*/

public static void main(String hi[])
{
	String biskets[] = {"jimjam","crackjack","oreo","dark fantasy","cream biscket","crack jack","parleyG","unibic","milk bisckts","treat"};
	int priceOfBiskets[]={123,134,145,167,189,171,764,784,321,135};
	System.out.println("welcome to supermarket");
    System.out.println("list of vegetables and biskets and groceries are:");
	/*for(int spooIndex=0;spooIndex<vegetables.length;spooIndex++){
		System.out.println(vegetables[spooIndex]);
	}*/
	/*for(int spooIndex=0;spooIndex<biskets.length;spooIndex++){
		System.out.println(biskets[spooIndex]);
	}*/
	//we need to followc the syntax but statement can be
	/*for(int spooIndex=0;spooIndex<biskets.length;spooIndex++){
		System.out.println(biskets[spooIndex]);
	}*/
	//another type to use for loop(advance level)
	for(String bisket:biskets)
	{
		System.out.println(bisket);
	}
	for(int priceOfBisket:priceOfBiskets ){
		System.out.println(priceOfBisket);
	}
	
	System.out.println("thamkyou");
    System.out.println("visit again----------");
}
}
