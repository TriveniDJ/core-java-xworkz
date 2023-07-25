class Customer{
 private int customerId;
 private String firstName;
private String lastName;
private String email;
private long phoneNo;
private String address;
private String dob;


 //getter and setter
 public void setCustomerId(int customerId){
	 this.customerId=customerId;
 }
 public int getCustomerId(){
	 return customerId;
 }

 public void setName(String firstName){	
this.firstName=firstName;
}
 public String getName(){
	return firstName; 
 }

public void setNamess(String lastName){	
this.lastName=lastName;
}
 public String getNamess(){
	return lastName; 
 }
 
 public void setEmail(String email){	
this.email=email;
}
 public String getEmail(){
	return email;
 }
 public void setPhoneNo(long phoneNo){	
this.phoneNo=phoneNo;
}
 public long getPhoneNo(){
	return phoneNo;
 }
 public void setAddress(String address){	
this.address=address;
}
 public String getAddress(){
	return address;
 }
public void setDob(String dob){	
this.dob=dob;
}
 public String getDob(){
	return dob;
 } 
}
 
 //encapuslation where inorder to make the data safer we use the keyword private(which is used to protect the data from the outside world ) 
 //so that to access it we have another method that is setter and getter in this where we can use it .
