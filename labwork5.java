import java.util.*;
public class labwork5{

    void isArmstrong(int n1){
        int sum=0;
        int x=n1;
        int a1;
        while(x>0){
            a1=x%10;
            sum=sum + a1*a1*a1;
            x=x/10;
        }
        if(sum==n1){
            System.out.println(n1);
        }
    }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        labwork5 f=new labwork5();
        System.out.println("Enter the range");
        
        int beg=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("Armstrong numbers in the given range are:");
        for(int i=beg;i<=end;i++){
            f.isArmstrong(i);
        }
          for(int i=0;i<10;i++){
            if(i==0 || i==9){
                String top="";
                for(int j=0;j<30;j++){
                    top=top+"*";
                }
                System.out.println(top);
            }
            else{
                System.out.println("*\t\t\t     *");
            }
          }
            int x;
            System.out.println("Enter the first number");
            int a=sc.nextInt();
            System.out.println("Enter the second number");
            int b=sc.nextInt();
         if(a>b){
            x=a;
         }
         else{
            x=b;
         }

            
    while(x<=(a*b)) {
      if( x % a == 0 && x % b == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", a, b, x);
        break;
      }
      x++;
    }
    }
}