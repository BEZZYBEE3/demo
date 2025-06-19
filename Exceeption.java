public class Exceeption {
    // public static void main(String[] args) {
    //     try {
    //         int a = 100 / 0;

    //         int[] values = { 9, 0, 4 };
    //         int answer = values[6];

    //     } catch (ArithmeticException e) {
    //         System.out.println("ivalid number: " + e.getMessage());
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
    //     } catch (Throwable e) {
    //         System.out.println("Throwable Exception: " + e.getMessage());
            public static void main(String[] args) {
            int age = 19;
            try {    
            if (age < 18) {
            throw new NullPointerException("Access denied");
            } else {
            System.out.println("Access granted");
            }
            } catch (Throwable e) {
            System.out.println(e.toString());
            }
        
}
}
// try{
// int a = 0;

// int b = 100;

// int answer = b / a;

// System.out.println(answer);
// } catch (Throwable a) {
// throw new RuntimeException("tell me the error");
// }
// }

// try {
// int[] numbers = {1, 5, 8};
// System.out.println(numbers[3]); // Accessing a valid index
// } catch (Throwable a) {
// System.out.println("Index is out of bounds");
// }
// }
