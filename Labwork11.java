import java.util.*;

public class Labwork11 implements animal{

    public void sound(){
System.out.println("The pig says:wee wee");
    }
    public void sleep(){
        System.out.println("Zzz");
    }


    //private String name="Mustang";
    public static void main(String args[]){
        /*person p=new person();
        p.set("John");
        System.out.println(p.get());*/
       /*  Labwork11 l=new Labwork11();
        l.honk();
        System.out.println(l.brand+" "+l.name);*/
        
        /*outer.inner i=new outer.inner();
        
        System.out.println(i.y);*/
        /*outer o=new outer();
        outer.inner i=o.new inner();
        System.out.println(i.myinner());*/


        Labwork11 l=new Labwork11();
        l.sound();
        l.sleep();


        

    }
}