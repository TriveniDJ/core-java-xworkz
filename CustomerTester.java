class CustomerTester{
public static void main(String hii[]){

Customer details=new Customer();
//details.customerId=1;
//details.firstName="bus";
details.setCustomerId(1);
System.out.println(details.getCustomerId());

details.setName("MADAN");
System.out.println(details.getName());

details.setNamess("GOWDA");
System.out.println(details.getNamess());

details.setEmail("madangowda6363@gmail.com");
System.out.println(details.getEmail());

details.setPhoneNo(63623499);
System.out.println(details.getPhoneNo());

details.setAddress("Banglore Indhira nagar");
System.out.println(details.getAddress());

details.setDob("23/07/2001");
System.out.println(details.getDob());

//details.setLast("GOWDA");
//System.out.println(details.getLast());
}
}