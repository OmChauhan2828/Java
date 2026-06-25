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
public class JavaArray {
    public static int linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 14;

        int index = linearsearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("element at index " + index);
        }

        System.out.println();
    }
}
