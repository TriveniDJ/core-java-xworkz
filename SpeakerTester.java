class SpeakerTester
{
public static void main(String test[])
{
System.out.println("Main started");
boolean value = Speaker.onOrOff();
System.out.println("Is speaker connected"+ value);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.decreaseVolume();
boolean value1 = Speaker.onOrOff();
//System.out.println("Is speaker connected"+ value);
System.out.println("Is speaker connected"+value1);
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
//System.out.println("Is speaker connected "+value1);
System.out.println("Invoking onOrOff()");
System.out.println("main ended");
}
}
