import java.util.*;

public class EncryptWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next().toUpperCase(); // read input word and convert to uppercase
        StringBuilder encryptedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'A') {
                encryptedWord.append('E');
            } else if (ch == 'E') {
                encryptedWord.append('A');
            } else {
                encryptedWord.append(ch);
            }
        }
        System.out.println("Encrypted word: " + encryptedWord.toString().toLowerCase());
    }
}
