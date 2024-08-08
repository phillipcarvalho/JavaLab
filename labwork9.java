import java.util.*;

 
public class labwork9{

    int x=5;
    int x8;
    int y=10;
    final int y1=10;
    int x3=5;
    String fname="John";
    String lname="Doe";
    int age=24;

static void mymethod(){
    System.out.println("Hello world!");
}
static void mymethod1(){
    System.out.println("Static methods can be called without creating objects");
}
public void mymethod2(){
    System.out.println("Public methods must be called by creating objects");
}
    public void fullthrottle(){
        System.out.println("The car is going as fast as it can");
    }
    public void speed(int speed){
        System.out.println("The max speed is: "+speed);
    }
    int x5;
    int x6;
    
   public labwork9(){
    x5=5;
   }

   public labwork9(int y){
    x6=y;
   }




    public static void main(String args[]){
        labwork9 l=new labwork9();
        System.out.println(l.x);
        labwork9 l1=new labwork9();
        labwork9 l2=new labwork9();
        System.out.println(l1.x);
        System.out.println(l2.x);
       labwork9 l5=new labwork9();
       l5.x=40;
        System.out.println(l5.x);
        labwork9 l6=new labwork9();
        l6.y=25;
        System.out.println(l6.y);
        labwork9 l7=new labwork9();
        //l7.y1=25;
        System.out.println(l7.y1);
        labwork9 l8=new labwork9();
        labwork9 l9=new labwork9();
        l9.x3=25;
        System.out.println(l8.x3);
        System.out.println(l9.x3);
        labwork9 l10=new labwork9();
        System.out.println("Name: "+l10.fname+" "+l10.lname);
        System.out.println("Age: "+l10.age);
        mymethod();
        labwork9 l11=new labwork9();
        mymethod1();
        l11.mymethod2();
     labwork9 l12=new labwork9();
        l12.fullthrottle();
        l12.speed(150);
        labwork9 l13=new labwork9();
        System.out.println(l13.x5);
        labwork9 l14=new labwork9(5);
        System.out.println(l14.x6);
        second l15=new second();
        System.out.println(l15.x);

    }
}