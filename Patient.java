class Patient
{
private int patientId;
private String patientName;
private int patientAge;
private String patientBloodGroup;
private String patientGender;
private String patientAddress;
private long contactNo;
private int wardNo;
private String attenderName;
private String diseaseName;
private String consultant;
private String hospitalName;
private double fees;
//getter and setter
 public void setPatientId(int patientId){
	 this.patientId=patientId;
 }
 public int getPatientId(){
	 return patientId;
 }

 public void setName(String patientName){	
this.patientName=patientName;
}
 public String getName(){
	return patientName; 
 }

public void setAge(int patientAge){	
this.patientAge=patientAge;
}
 public int getAge(){
	return patientAge; 
 }
 
 public void setBldGroup(String patientBloodGroup){	
this.patientBloodGroup=patientBloodGroup;
}
 public String getBldGroup(){
	return patientBloodGroup;
 }
 public void setGender(String patientGender ){	
this.patientGender=patientGender;
}
 public String getGender(){
	return patientGender; 
 }
public void setAddress(String patientAddress ){	
this.patientAddress=patientAddress;
}
 public String getAddress(){
	return patientAddress; 
 } 
 public void setContactNo(long contactNo){	
this.contactNo=contactNo;
}
 public long getContactNo(){
	return contactNo;
 }
 public void setWardNo(int wardNo){	
this.wardNo=wardNo;
}
 public int getWardNo(){
	return wardNo;
 }
 public void setAttenderName(String attenderName){	
this.attenderName=attenderName;
}
 public String getAttenderName(){
	return attenderName;
 }
 public void setDiseaseName(String diseaseName){	
this.diseaseName=diseaseName;
}
 public String getDiseaseName(){
	return diseaseName;
 }
 public void setConsultant(String consultant){	
this.consultant=consultant;
}
 public String getConsultant(){
	return consultant;
 }
  public void setHospitalName(String hospitalName){	
this.hospitalName=hospitalName;
}
 public String getHospitalName(){
	return hospitalName;
 }
 public void setFees(double fees){	
this.fees=fees;
}
 public double getFees(){
	return fees;
 }

}
 
 //encapuslation where inorder to make the data safer we use the keyword private(which is used to protect the data from the outside world ) 
 //so that to access it we have another method that is setter and getter in this where we can use it .

