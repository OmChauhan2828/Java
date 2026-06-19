import java.util.*;
// public class Javaloops {
//     public static void main(String args[]){
//         // int count = 0;
//         // while(count <=50){
//         //     System.out.println("Hello World");
//         //     count++;
//         // }

//         // print number from 1 to 10 using while loop
//         int count=1;
//         while(count<=10){
//             System.out.println(count);
//             count++;
//         }
//         }
//     }


// Print number from 1 to n using while loop by taking input from the user;
// public class Javaloops {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int count=1;
//         while(count<=range){
//             System.out.println(count);
//             count++;
//         }
//     }


// For loop

// public class Javaloops {
//     public static void main(String args[]){
//         // for(int i=1;i<=10;i++){
//         //     System.out.println(i);
//         // }

//         // Print Square pattern
//         // for(int line=1;line<=4;line++){
//         //     System.out.println("****");
//         // }
//     }
// }


// do while loop
public class Javaloops {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        do{
            System.out.println("Enter a number");
            int n =sc.nextInt();
           if(n %10 ==0){
            break;
           }

            System.out.println(n);
        }while(true);
    }
}