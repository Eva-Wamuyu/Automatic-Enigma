import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("dict.txt");
        Scanner scanner = new Scanner(System.in);

        String sentence;
        while (true) {
            System.out.print("Enter a sentence to translate (enter 'quit' to exit): ");
            sentence = scanner.nextLine().trim().toLowerCase();
            if (sentence.equals("quit")) {
                break;
            }
            String translation = dictionary.translateSentence(sentence);
            System.out.println("Note:: --not--found shows a word is not in the dictionary \n");
            System.out.println("Translation: " + translation);
        }

        scanner.close();
    }
}
