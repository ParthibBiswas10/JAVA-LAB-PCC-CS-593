import java.util.Scanner;

public class ConsecutiveWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

       
        sentence = sentence.toUpperCase();

     
        String words[] = sentence.split(" ");

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            boolean hasConsecutive = false;

            // Check consecutive letters
            for (int j = 0; j < w.length() - 1; j++) {
                char ch1 = w.charAt(j);
                char ch2 = w.charAt(j + 1);

                if (ch2 == ch1 + 1) {
                    hasConsecutive = true;
                    break;
                }
            }

            if (hasConsecutive) {
                System.out.println(w);
                count++;
            }
        }

        System.out.println("Number of words containing consecutive letters: " + count);

        sc.close();
    }
}
