import java.util.*;
public class labwork4{
    public static void main(String args[]){
         char x[]={'h','e','l','l','o'};
        String y=new String(x);
        System.out.println(y);

        System.out.println("1:Addition");
        System.out.println("2:Subraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");
        System.out.println("5:Modulus");
        System.out.println("6:Exponential");
        System.out.println("7:Quit");
        int x=5;
        Scanner sc=new Scanner(System.in);
        while(x!=0){
            System.out.println("Please enter your operation");
        x=sc.nextInt();
        if(x>7){
            System.out.println("Invalid Input, kindly reenter");
            
        }
        else{
            if(x==1){
                System.out.println("Please enter two numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a+b);
            }
            else if(x==2){
                System.out.println("Please enter two numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a-b);
            }
            else if(x==3){
                System.out.println("Please enter two numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a*b);
            }
            else if(x==4){
                System.out.println("Please enter two numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a/b);
            }
            else if(x==5){
                System.out.println("Please enter two numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a%b);
            }
            else if(x==6){
                System.out.println("Please enter the number");
                int b=sc.nextInt();
                System.out.println(Math.exp(b));
            }
        }
        }
        System.out.println("Thank you");
        sc.close();
    }
}
