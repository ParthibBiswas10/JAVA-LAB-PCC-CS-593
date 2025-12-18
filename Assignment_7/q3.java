import java.util.Scanner;

public class WordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        word = word.toUpperCase(); // uniform comparison

        // Easy palindrome check using StringBuilder
        String reversed = new StringBuilder(word).reverse().toString();
        boolean isPalindrome = word.equals(reversed);

        // Special word check
        boolean isSpecial = word.charAt(0) == word.charAt(word.length() - 1);

        
        if (isPalindrome) {
            System.out.println("The word is a Palindrome.");
        } else if (isSpecial) {
            System.out.println("The word is a Special word.");
        } else {
            System.out.println("The word is neither Palindrome nor Special.");
        }

        sc.close();
    }
}
