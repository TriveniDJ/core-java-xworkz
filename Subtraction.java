//subtraction using methods
/*class Subtraction
{
public static void main(String subtraction[])
{
sub(56 , 67);
sub(34 , 66);
sub(26 , 67);
sub(76 , 56);
sub(56 , 67);
sub(66 , 76);
sub(66 , 64);
sub(46 , 66);
sub(56 , 67);
sub(74 , 76);



}
public static void sub(int m,int n)
{
System.out.println(m-n);
}
}*/

//method overloading
class Subtraction
{
public static void main(String subtraction[])
{
sub(56 , 67 ,45);
sub(34 , 66 ,45);
sub(26 , 67 ,54);
sub(76 , 56 ,32);
sub(56 , 67 ,54);
sub(66 , 76 ,32);
sub(66 , 64 ,32);
sub(46 , 66 ,21);
sub(56 , 67 ,65);
sub(74 , 76 ,65);



}
public static void sub(int m,int n,int o)
{
System.out.println(m-n-o);
}
}
