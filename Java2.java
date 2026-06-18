import java.util.*;
public class Java2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;

    // int age=16;
    // if(age>=18){
    //     System.out.println("You are eligible to vote");
    // }
    // if(age>13 && age<18){
    //  System.out.println("You are a teenager");
    // }
    // else{
    //     System.out.println("not adult");   
    // } 
    // }
    
    // print the largest of two numbers

    // int A=10;
    // int B=20;

    // if(A>B) {
    //     System.out.println("A is larger");
    // }
    // else {
    //     System.out.println("B is larger");
    // }

    // income tax calculator
   if(income<500000) {
    tax=0;
   }
   else if(income>=500000 && income<1000000) {
    tax=(int)(income*0.2);
   }
   else {
    tax=(int)(income*0.3);
   } 

   System.out.println("Tax to be paid: " + tax);
}
}