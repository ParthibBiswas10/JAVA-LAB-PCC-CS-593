import java.util.*;

class UniqueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        boolean isUnique = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                isUnique = false;
                break;
            } else {
                map.put(ch, 1);
            }
        }

        if (isUnique)
            System.out.println("The string is UNIQUE");
        else
            System.out.println("The string is NOT UNIQUE");
    }
}
