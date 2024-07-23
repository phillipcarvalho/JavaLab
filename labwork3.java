import java.util.Scanner;
public class labwork3{
public static void main(String args[]){
    boolean isJavafun=true;
    boolean isFishtasty=false;
    System.out.println(isJavafun);
    System.out.println(isFishtasty);

    int x=5;
    int y=10;
    System.out.println(x>y);

    //System.out.println(10==15);//returns false because 10 is not equal to 15

    if(20>18){
        System.out.println("20 is greater than 18");
    }

    int time=18;
    if(time<20){
        System.out.println("Good day");
    }
    else{
        System.out.println("Good evening");
    }

    int time1=22;
    if(time1<10){
        System.out.println("Good morning");
    }
    else if(time1<20){
        System.out.println("Good day");
    }
    else{
        System.out.println("Good evening");
    }

    int day=5;
    switch(day){
        case 1:
        System.out.println("Monday");
        break;
    

        case 2:
        System.out.println("Tuesday");
        break;
    
   
        case 3:
        System.out.println("Tuesday");
        break;
    
    
        case 4:
        System.out.println("Thursday");
        break;
    
    default:
    System.out.println("Friday");
    } 

    int i=0;
    while(i<5){
        System.out.println(i);
        i++;
    }

    int i1=0;
    do{
        System.out.println(i1);   
        i1++; 
    }
    while(i1<5);

    for(int i2=0;i2<5;i2++){
        System.out.println(i2);
    }

    String[] cars={"Volvo","Mclaren","Mercedes","Aston Martin"};
    for(String i3:cars){
        System.out.println(i3);
    }

    for(int i4=0;i4<5;i4++){
        if(i4==4){
            break;
        }
        System.out.println(i);
}

    for(int i5=0;i5<10;i5++){
        if(i5==4){
            continue;
        }
        System.out.println(i);
    }

    Scanner sc=new Scanner(System.in);
    String name;
    System.out.println("Enter name");
    name=sc.nextLine();
    System.out.println("Name:"+name);
}
}

