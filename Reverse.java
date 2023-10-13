import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        System.out.print("Enter the word you want to reverse: ");
        String wordToReverse = scanner.next();
        String[] words = inputSentence.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();
        for (String word : words) {
            if (word.equals(wordToReverse)) {
           
                StringBuilder reversedWord = new StringBuilder(word).reverse();
                modifiedSentence.append(reversedWord).append(" ");
            } else {
                modifiedSentence.append(word).append(" ");
            }
        }

        String result = modifiedSentence.toString().trim();
        System.out.println("Modified sentence: " + result);

        
    }
}
