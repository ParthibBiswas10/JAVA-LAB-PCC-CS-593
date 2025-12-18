import java.util.*;

class CharFreqHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("\nCharacter Frequency:");
        for (char ch : map.keySet()) {
            System.out.println(ch + " : " + map.get(ch));
        }

        // Remove duplicates
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(String.valueOf(s.charAt(i)))) {
                result += s.charAt(i);
            }
        }

        System.out.println("\nString after removing duplicates:");
        System.out.println(result);
    }
}
