import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

        public class LearnFileIO {
    public static void main(String[] args) {
        int[] numbers = {56, 81, 4, 7};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }  
        }
        System.out.println("The smallest number is: " + min);
    }
}

// public class LearnFileIO {
    
//     public static void main(String[] args) {
//         try {
//         FileWriter filewrite =  new FileWriter("name.txt");
//         filewrite.write("java is an interesting language");

//         filewrite.close();
//         } catch (IOException e){
//             throw new RuntimeException(e);
//         }
//     }
// }


// public class LearnFileIO {
    
//     public static void main(String[] args) {
//         String word = "serah";
//         String reversed = new StringBuilder(word).reverse().toString();
//         System.out.println("Backward: " + reversed);
//     }

// }



// public class LearnFileIO {
    
//     public static void main(String[] args) {
//         String word = "serah";
//         String reversed = new StringBuilder(word).reverse().toString();
//         System.out.println("Backward: " + reversed);
//     }
// }


// try {
//         File file = new File("name.txt");
//         file.createNewFile();
//          } catch (Throwable e) {
//             throw new RuntimeException("tell me the error");
//     }