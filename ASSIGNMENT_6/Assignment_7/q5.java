import java.util.Scanner;

public class q5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        String city[] = new String[10];
        int std[] = new int[10];

      
        System.out.println("Enter names of 10 cities and their STD codes:");
        for (int i = 0; i < 10; i++) {
            System.out.print("City " + (i + 1) + " name: ");
            city[i] = sc.nextLine();

            System.out.print("STD code: ");
            std[i] = sc.nextInt();
            sc.nextLine(); // clear buffer
        }

        // Input city to search
        System.out.print("\nEnter city name to search: ");
        String searchCity = sc.nextLine();

        boolean found = false;

        // Linear search
        for (int i = 0; i < 10; i++) {
            if (city[i].equalsIgnoreCase(searchCity)) {
                System.out.println("\nSearch Successful");
                System.out.println("City Name: " + city[i]);
                System.out.println("STD Code: " + std[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nSearch unsuccessful, no such city in the list");
        }

        sc.close();
    }
}
