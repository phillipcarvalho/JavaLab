/*import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;*/

/*class employee{
    float salary=40000;

}
class programmer extends employee{
    int bonus=10000;

}*/

class animal{
    void eat(){
        System.out.println("eating.....");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("barking....");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping....");
    }
}
class Cat extends animal{
    void meow(){
        System.out.println("meowing...... ");
    }
}


public class Labwork14{
    public static void main(String args[]){
        /*LocalDateTime x=LocalDateTime.now();
        System.out.println("Before formatting: "+x);
        DateTimeFormatter x1=DateTimeFormatter.ofPattern("dd-MM-yyyyHH:MM:ss");
        String y=x1.format(x);
        System.out.println("After Formatting: "+y);*/

//Inheritance

        /*programmer p=new programmer();
        System.out.println("Programmer Salary: "+(p.salary));
        System.out.println("Programmer  bonus: "+p.bonus);*/


        /*BabyDog b=new BabyDog();
        b.eat();
        b.bark();
        b.weep();*/
        Cat c=new Cat();
        c.meow();
        c.eat();
        //c.bark();//C.T Error
        BabyDog g=new BabyDog();
        g.weep();





    }
}