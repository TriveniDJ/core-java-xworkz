class KarnatakaTester
{
public static void main(String city[])
{
//chaiPoint.getCityAvailable();
Karnataka.addCity("bangalore");
Karnataka.addCity("mysore");
Karnataka.addCity("manglore");
Karnataka.addCity("udupi");
Karnataka.addCity("hubballi");


//karnataka>getAllCity();
boolean cham =Karnataka.updateCityName("bangalore","bengaluru");
System.out.println(cham);

boolean cham1=Karnataka.updateCityName("Mysore","mysure");
System.out.println(cham1);

boolean cham2=Karnataka.updateCityName("manglore","mangalure");
System.out.println(cham2);


boolean cham3=Karnataka.updateCityName("hubballi","hubblli");
System.out.println(cham3);

Karnataka.getAllCity();
}
}
