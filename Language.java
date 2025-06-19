import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Language {
    public static String translateToEnglish(String spanishWord) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hola", "hello");
        dictionary.put("adiós", "goodbye");
        dictionary.put("gracias", "thank you");
        dictionary.put("por favor", "please");
        dictionary.put("perro", "dog");
        dictionary.put("gato", "cat");
        dictionary.put("libro", "book");
        dictionary.put("escuela", "school");
        dictionary.put("agua", "water");
        dictionary.put("comida", "food");

        String translation = dictionary.get(spanishWord.toLowerCase());
        if (translation != null) {
            return translation;
        } else {
            return "Translation not found.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Spanish word: ");
        String spanishWord = scanner.nextLine();
        System.out.println("English translation: " + translateToEnglish(spanishWord));
        scanner.close();
    }
}
