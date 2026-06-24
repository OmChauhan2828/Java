// public class JavaFunctions {
//     public static void printhello(){
//         System.out.println("Hello, coders! ");
//         System.out.println("Hello, World");
//         System.out.println("Om Chauhan this side!");

//     }
//     public static void main(String[] args) {
//         printhello();
//     }

// product of two numbers using functions
//  public class JavaFunctions {
//     public static void multiply(int a, int b){
//         int product = a*b;
//         return;
//     }

//     public static void main(String[]args){
//         int a = 10;
//         int b=20;
//         int prod = multiply (a,b);
//         System.out.println("The product of a and b is: " + prod);

//     }
//  }

// To find the factorial of a number using fucntion

// public class JavaFunctions {
//     public static int factorial(int n){
//         int fact = 1;
//         for(int i=1; i<=n; i++){
//             fact = fact * i;
//         }
//         return fact;
//     }

//     public static void main(String[] args) {
//         int num = 9;
//         int result = factorial(num);
//         System.out.println("The factorial of " + num + " is: " + result);
//     }
// }

// Convert a number from binary to decimal using function

public class JavaFunctions{
    public static void bintodec(int binum){
        int pow=0;
        int decnum=0;

        while(binum>0){
            int lastdigit = binum%10;
            decnum = decnum + lastdigit*(int)Math.pow(2,pow);
            pow++;
            binum = binum/10;
        }
        System.out.println("The decimal number is: " + decnum);

    }

    public static void main(String[] args) {
        int binum = 1000101;
        bintodec(binum);
    }
}

// decimal to binary using function
public class JavaFunctions{
    public static void dectobin(int decnum){
        int binum=0;
        int pow=0;

        while(decnum>0){
            int rem = decnum%2;
            binum = binum + rem*(int)Math.pow(10,pow);
            pow++;
            decnum = decnum/2;
        }
        System.out.println("The binary number is: " + binum);
    }

    public static void main(String[] args) {
        int decnum = 69;
        dectobin(decnum);
    }
}