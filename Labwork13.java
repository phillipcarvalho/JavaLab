import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
/*interface firstinterface{
    public void myMethod();
}

interface secondinterface{
    public void myOthermethod();
}
interface secondinterface2{
    public void myOthermethod2();
}
class Demo implements firstinterface, secondinterface{
    public void myMethod(){
        System.out.println("Some text...");
    }
    public void myOthermethod(){
        System.out.println("Some other text....");
    }
    public void myOthermethod2(){
        System.out.println("Some other text to observe....");
    }
}*/

//enum

/*enum level{
    LOW,
    MEDIUM,
    HIGH
}*/


public class Labwork13{
    public static void main(String args[]){
       /*Demo obj=new Demo();
       obj.myMethod();
       obj.myOthermethod();
       obj.myOthermethod2();*/
       
        //level x=level.MEDIUM;
        //System.out.println(x);
        /*switch(x){
            case LOW:
            System.out.println("Low Level");
            break;
            case MEDIUM:
            System.out.println("Medium Level");
            break;
            case HIGH:
            System.out.println("High Level");
            break;

        }*/
        /*for(level i:level.values()){
                System.out.println(i);
        }*/
        /*LocalDate a=LocalDate.now();
        System.out.println(a);*/
        LocalTime b=LocalTime.now();
        System.out.println(b);
    }
}