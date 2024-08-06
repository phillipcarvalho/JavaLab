import java.util.*;

public class labwork8{
    static class Student{
        public String name;
        Student (String name){
            this.name=name;
        }
        public String toString(){
            return name;
        }
    }
    public static int[] m1(){
        return new int[] {1,2,3};
    }
       
    
    public static void main(String args[]){
         Student[] mystudents=new Student[]{ new Student("Dharma"),new Student("ram"),new Student("Dharsh"),new Student("Soham"),new Student("Raj")};
        for(Student m:mystudents){
            System.out.println(m);
        }   
       int[] arr=new int[4];
         arr[0]=10;
         arr[1]=20;
         arr[2]=30;
         arr[3]=40;
         System.out.println("Trying to access an element outside the array");
         //System.out.print(arr[4]);
        int[][] arr2=new int[10][20];
        arr2[0][0]=1;
        System.out.println("arr[0][0]= "+arr2[0][0]);
        int[][][] arr3=new int[10][20][30];
        arr3[0][0][0]=1;
        System.out.println("arr[0][0][0]= "+arr3[0][0][0]);
        int arr4[]={3,1,2,5,4};
        int sum=0;
        for(int i=0;i<arr4.length;i++){
            sum=sum+arr4[i];
        }
        System.out.println("Sum of array values: "+sum);
        int arr1[]=m1();
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
       int intArray[]=new int[3];
        byte bytearray[]=new byte[3];
        short shortarray[]=new short[3];
        String[] strarray=new String[3];
        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(bytearray.getClass());
        System.out.println(shortarray.getClass());
        System.out.println(strarray.getClass());
        int intarray[]={1,2,3};
        int clonearray[]=intarray.clone();
        //will print false as deep copy is created
        System.out.println(intarray==clonearray);
        for(int i=0;i<clonearray.length;i++){
            System.out.println(clonearray[i]+" ");
} 
int intarray1[][]={{1,2,3},{4,5}};
int clonearray1[][]=intarray1.clone();
System.out.println(intarray1==clonearray1);
//will print true as shallow copy is created
System.out.println(intarray1[0]==clonearray1[0]);
System.out.println(intarray1[1]==clonearray1[1]);

}
}
