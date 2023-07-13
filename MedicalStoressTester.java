class MedicalStoresssTester{
public static void main(String medicine[]){
//Medicine.getMedicineName();
MedicalStoresss.addMedicine("Paracetamol");
MedicalStoress.addMedicine("Aspirin");              
MedicalStoress.addMedicine("Cipla");            
MedicalStoress.addMedicine("Ativan");             
MedicalStoress.addMedicine("Diazepam");             
MedicalStoress.addMedicine("Loratadine");             
MedicalStoress.addMedicine("Amlodipine");           
MedicalStoress.addMedicine("Amoxicillin");              
MedicalStoress.addMedicine("Spironolactone");           
MedicalStoress.addMedicine("Metformin");
MedicalStoress.getAllMedicine();
boolean value=MedicalStoress.updateMedicineName("Paracetamol","New Paracetamol");
boolean value1=MedicalStoress.updateMedicineName("Aspirin","New Aspirin");
boolean value2=MedicalStoress.updateMedicineName("Cipla","New Cipla");
boolean value3=MedicalStoress.updateMedicineName("Ativan","New Ativan");
boolean value4=MedicalStoress.updateMedicineName("Diazepam","New Diazepam");
MedicalStoress.getAllMedicine();
MedicalStoress.deleteMedicineName("New Ativan");
MedicalStoress.getAllMedicineNamePostDeletetion();
}
}