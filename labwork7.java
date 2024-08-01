import java.util.*;
    class student{
        public int n;
        public String name;
        student(int n,String name){
            this.n=n;
            this.name=name;
        }
    }
class labwork7{
    public static void main(String args[]){
       StringTokenizer st1=new StringTokenizer("my name is khan"," ");
       while(st1.hasMoreTokens()){
        System.out.println(st1.nextToken());
    }
        StringTokenizer st2=new StringTokenizer("my,name,is,khan",",");
        System.out.println("Next Token is :"+st2.nextToken());
         StringTokenizer st3=new StringTokenizer("The lazy brown fox is slower than the slow and steady turtle in this race"," ");
       while(st3.hasMoreTokens()){
        System.out.println(st3.nextToken());
    }
    StringTokenizer st4=new StringTokenizer("The lazy brown fox is slower than the slow and steady turtle in this race"," ");
    while(st4.hasMoreElements()){
     System.out.println(st4.nextToken());
 }
      StringTokenizer st5=new StringTokenizer("The lazy brown fox is slower than the slow and steady turtle in this race"," ");
         
    System.out.println(st5.countTokens());




//Arrays

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
       //Array of Objects
        student arr[]=new student[5];
        arr[0]=new student(0,"Paul");
        arr[1]=new student(1,"Victor");
        arr[2]=new student(2,"Pauline");
        arr[3]=new student(3,"Victoria");
        arr[4]=new student(4,"Diogo");


        for(int i=0;i<5;i++){
            System.out.println("Elements at index "+i+":"+arr[i].n+" and "+arr[i].name);
        }
    }
}