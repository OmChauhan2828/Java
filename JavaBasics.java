// import java.util.Scanner;

// public class JavaBasics {
//     public static void main(String args[]) {
//         try (Scanner scanner = new Scanner(System.in)) {
//             String input = scanner.next();
//             System.out.println(input);

//             // variables in java
//         // int a = 10;
//         // int b = 20;
//         // System.out.println(a);
//         // System.out.println(b);
//         // String name = "Virat";
//         // System.out.println(name);


//         // data types in java
//         // byte a = 10;
//         // System.out.println(a);
//         // char ch ='A';
//         // System.out.println(ch);
//         // boolean var = true;
//         // System.out.println(var);
//         // int num = 100;
//         // System.out.println(num);
//         // float decimal =8.9;
//         // short s = 1000;
//         // System.out.println(decimal);
//         // System.out.println(s);

//         // Sum of two numbers
//             // int a=10;
//             // int b=40;
//             // int sum =a+b;
//             // System.out.println("The sum of a and b is: " + sum);
//         }
//     }
// }

// Sum of a & b by using user input
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c =sc.nextInt();

//         float avg = (a + b + c) / 3.0f;
//         System.out.println("The average of a, b, and c is: " + avg);

//     }
// }

// Area of square
import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area of the square is: " + area);

    }
}