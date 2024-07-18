import java.util.*;

public class labwork1
{
public static void main(String[] args)
{
int x=9; double x1=x;
System.out.println(x); 
System.out.println(x1);

double x2=9.78d; 
int x3=(int)x2;
System.out.println(x2);
 
System.out.println(x3);

int sum1=100+50; 
int sum2=sum1+250;
int sum3=sum2+sum2; System.out.println(sum3);


int y1=10;
String y="John"; 
//x=x+y; //this is an error as we can't add a string to an integer variable
System.out.println(y);


int x4=20; int y2;
y2=(x4==1)?61:90;
System.out.println("Value of y is:"+y2); 
y2=(x4==20)?61:90;
System.out.println("Value of y is:"+y);


String x6="Thursday";
System.out.println("Length of string is:"+x6.length());


String x7="Thursday"; 
System.out.println(x7.toUpperCase()); 
System.out.println(x7.toLowerCase());

String x8="Thursday";
 System.out.println(x8.indexOf('u'));
}
}
