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

public class JavaFunctions {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 9;
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}