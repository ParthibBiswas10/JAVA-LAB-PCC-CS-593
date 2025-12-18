import java.util.*;

class HappyWord {
    
    // Method to check Happy Number
    static boolean isHappy(int num) {
        while (num != 1 && num != 4) {
            int sum = 0;
            while (num > 0) {
                int d = num % 10;
                sum = sum + d * d;
                num = num / 10;
            }
            num = sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next().toUpperCase();

        String value = "";

        // Convert letters to alphabet positions
        for (int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 64;
            value = value + pos;
        }

        int number = Integer.parseInt(value);

        if (isHappy(number)) {
            System.out.println("A Happy Word");
        } else {
            System.out.println("Not a Happy Word");
        }
    }
}
