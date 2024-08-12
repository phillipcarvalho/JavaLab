import java.util.*;

abstract class Labwork10{
        int year;
        String name;
     
        
        public Labwork10(int year1,String name1){
            year=year1;
            name=name1;
        }
        public String fname="John";
        public int age=24;
        public abstract void study();
}

class Student extends Labwork10{
    public int year=2018;
    public void study(){
        System.out.println("Studying all day");
    }
}



