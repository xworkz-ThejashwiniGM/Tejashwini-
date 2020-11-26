class EvenOrOdd
{
public static void main(String a[])
{

isEven(78);
isEven(89);
isEven(287);//method calling or caller function
}
static void isEven(int number)
{
if(number %  2 !=0)
System.out.println(number + "is even");
else
System.out.println(number + " is  odd");
}
}

