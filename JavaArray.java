import java.util.*;

// public class JavaArray {
//     public static void main(String[] args){
//         int[] marks = new int[5];

//         Scanner sc = new Scanner(System.in);

//         // int phy =sc.nextInt();
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();

//         System.out.println("phy :" + marks[0]);
//         System.out.println("phy :" + marks[0]);
//         System.out.println("phy :" + marks[0]);

//     }



// linear Search

// public class JavaArray {
//     public static int linearsearch(int number[], int key) {
//         for (int i = 0; i < number.length; i++) {
//             if (number[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 14;

//         int index = linearsearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("element at index " + index);
//         }

//         System.out.println();
//     }



// Largest Number in the array

// public class JavaArray {

//     public static int getlargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;

//         for(int i=0;i<numbers.length;i++){
//             if(largest<numbers[i]){
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]) {
//         int numbers[]={1,2,3,6,7};
//         System.out.println("the largest number in the array is"+ getlargest(numbers));
//     }



// Binary Search

// public class JavaArray {
//     public static int binarysearch(int numbers[],int key){
//         int start=0; int end = numbers.length-1;

//         while(start<=end){
//          int mid = (start+end)/2;

//         if(numbers[mid]==key) {
//             return mid;
//         }
//         if(numbers[mid]<key) {
//             start=mid+1;
//         }else {
//             end=mid-1;
//         }
//         }
//         return -1;
//     }

//     public static void main(String[] args){
//     int numbers[]={2,4,6,8,10,12,14};
//     int key=10;

//     System.out.println("index for key is:" + binarysearch(numbers, key));
//     }
// }



// Reversed an array
// public class JavaArray{

//      public static void reverse(int numbers[]){
//           int first = 0  , last =numbers.length-1;

//           while(first<last){
//             int temp=numbers[last];
//             numbers[last]=numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;

//           }
//      }
//     public static void main(String args[]) {
//         int numbers[]={2,4,6,8,10,13,14};
         
//         reverse(numbers);
//         for(int i=0;i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }
//        System.out.print(numbers);
//     }
// }


// Buy and Sell the stocks

public class JavaArray{

 public static int BuyandSellStocks(int prices[]) {
    int buyprice = Integer.MAX_VALUE;
    int maxProfit =0;

    for(int i=0;i<prices.length;i++){
        if (buyprice<prices[i]){
            int profit=prices[i]-buyprice;
        }
    }
 }   
public static void main(String args[]){
    int prices[]= {7,1,4,6,3};
}
}
