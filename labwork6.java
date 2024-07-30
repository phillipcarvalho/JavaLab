import java.util.*;
 public class labwork6{
    public static void main(String args[]){
        
        //StringBuffer sb=new StringBuffer("Hello");
        /*sb.append(" Java");
        System.out.println(sb);
        sb.insert(1,"Java");
        System.out.println(sb);
        sb.replace(1,3,"Java");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());// now 34
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());//34
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());//70 */

        //String Builder
       /* StringBuilder sb=new StringBuilder("Hello");
        StringBuilder sb2=new StringBuilder("Hello");
        StringBuilder sb3=new StringBuilder("Hello");
        StringBuilder sb4=new StringBuilder("Hello");
        StringBuilder sb5=new StringBuilder("Hello");
        
        sb.append("Java");
        System.out.println(sb);
        sb2.insert(1,"Java");
        System.out.println(sb2);
        sb3.replace(1,3,"Java");
        System.out.println(sb3);
        sb4.delete(1,3);
        System.out.println(sb4);
        sb5.reverse();
        System.out.println(sb5);
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.capacity());
        sb1.append("Hello");
        System.out.println(sb1.capacity());//now 16
        sb1.append("java is my favourite language");
        System.out.println(sb1.capacity());// now 34
        sb1.ensureCapacity(10);
        System.out.println(sb1.capacity());//34
        sb1.ensureCapacity(50);
        System.out.println(sb1.capacity());*///70 
        
        //Java Program to find the third largest element in an array
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Third largest element is: "+arr[n-3]);


    }
}