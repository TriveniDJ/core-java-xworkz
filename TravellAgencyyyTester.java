class TravellAgencyyyTester{
public static void main(String tourist[]){
//Travell.gettouristName();
TravellAgencyyy.addTourist("Goa");
TravellAgencyy.addTourist("Agra");
TravellAgencyy.addTourist("Rajasthan");
TravellAgencyy.addTourist("Delhi");
TravellAgencyy.addTourist("Munnar");
TravellAgencyy.addTourist("Coorg");
TravellAgencyy.addTourist("Manali");
TravellAgencyy.addTourist("Ooty");
TravellAgencyy.getAllTourist();
boolean value=TravellAgencyy.updateTouristName("Goa","goa");
boolean value1=TravellAgencyy.updateTouristName("Agra","agra ");
boolean value2=TravellAgencyy.updateTouristName("Rajasthan","rajasthani");
boolean value3=TravellAgencyy.updateTouristName("Delhi","delhiii");
boolean value4=TravellAgencyy.updateTouristName("Munnar","munnar");
TravellAgencyy.getAllTourist();
TravellAgencyy.deleteTouristName("delhiii");
TravellAgencyy.getAllTouristNamePostDeletetion();
}
}