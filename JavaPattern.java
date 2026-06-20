public  class JavaPattern {
   public static void main(String args[]){

    // for(int line=1;line<=4;line++){
    //     for(int star=1;star<=line;star++){
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }

// Inverted Star Pattern
//     for(int line=1;line<=4;line++){
//         for(int star=1;star<=4-line+1;star++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//    }
    
// Half Pyramid Pattern
// int n = 5;
// for(int line=1;line<=n;line++){
//     for(int star=1;star<=line;star++){
//         System.out.print(star);
//     }
//     System.out.println();
// }
// }


// character Pattern

int n=5;
char ch='A';
for(int line=1;line<=n;line++){
    for(int j=1;j<=line;j++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}
}
}



