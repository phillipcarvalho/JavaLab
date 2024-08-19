import java.util.*;
public class labwork12{

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //    1
    /*int a=20;
    Integer i=Integer.valueOf(a);
    Integer j=a;
System.out.println(a+" "+i+" "+j);*/

//      2

/*Integer a=new Integer(3);
int i=a.intValue();
int j=a;
System.out.println(a+" "+i+" "+j );*/


//  3

/*int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    if(i%2==0 && arr[i]%2==1){
        System.out.println("Index: "+i+" Value: "+arr[i]);
    }
}*/

// 4

/*for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int j=0;

for(int i=0;i<n;i++){

    if(arr[i]!=0){
        arr[j++]=arr[i];
        
            
        }
    }
    while(j<n){
        arr[j++]=0;
    }

System.out.println("Elements:\n");

for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}*/

//          5


    /*int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    int x=sc.nextInt();
    System.out.println("The pairs");
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(arr[i]+arr[j]==x){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }*/
}


}