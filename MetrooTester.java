class MetrooTester{
public static void main(String station[]){
//Metroo.getStationName();
Metroo.addStation("Rajajinagar");
Metroo.addStation("Yeshwanthpur");
Metroo.addStation("Mahalakshmi");
Metroo.addStation("Vijaynagar");
Metroo.addStation("Mahathma Gandhi Road");
Metroo.addStation("Jayanagar");
Metroo.addStation("Banashankari");
Metroo.getAllStation();
boolean value=Metroo.updateStationName("Rajajinagar","Rajajinagar North-West of Bangalore");
boolean value1=Metroo.updateStationName("Yeshwanthpur","Yeshwanthpur North-West of Bangalore");
boolean value2=Metroo.updateStationName("Mahalakshmi","Mahalakshmi North-West of Bangalore");
boolean value3=Metroo.updateStationName("Vijaynagar","Vijaynagar West of Bangalore");
boolean value4=Metroo.updateStationName("Mahathma Gandhi Road","Mahathma Gandhi Road North of Bangalore");
boolean value5=Metroo.updateStationName("Jayanagar","Jayanagar South of Bangalore");
boolean value6=Metroo.updateStationName("Banashankari","Banashankari South of Bangalore");
Metroo.getAllStation();
Metroo.deleteStationName("Vijaynagar West of Bangalore");
Metroo.getAllStationNamePostDeletetion();
}
}