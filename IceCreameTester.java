class IceCreameTester{
public static void main(String ice[]){
//IceCreame.geticeName();
IceCreame.addIce("Brownie");
IceCreame.addIce("Chocolate");
IceCreame.addIce("Kiwi");
IceCreame.addIce("Red Velvet");
IceCreame.addIce("Avocada");
IceCreame.addIce("Mocha");
IceCreame.getAllIce();
boolean value=IceCreame.updateIceName("Brownie","Blackice");
boolean value1=IceCreame.updateIceName("Chocolate","Chocolate cream");
boolean value2=IceCreame.updateIceName("Kiwi","Kiwi Fruit");
boolean value3=IceCreame.updateIceName("Red Velvet","Redvelvet");
boolean value4=IceCreame.updateIceName("Avocada","Green Avocada");
boolean value5=IceCreame.updateIceName("Mocha","Mocha Flavor");
IceCreame.getAllIce();
IceCreame.deleteIceName("Kiwi Fruit");
IceCreame.getAllIceNamePostDeletetion();
}
}