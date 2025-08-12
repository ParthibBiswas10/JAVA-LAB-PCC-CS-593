import java.util.*;
class baller{
    static int playerid=1000;
    static String team= "Argentina";
    String name;
    int kitnumber=10;
    baller(String name,int kitnumber){
        this.name=name;
        playerid+=1;
        this.kitnumber=kitnumber;
    }
    void display(){
        System.out.println("Player Name: " + name);
        System.out.println("Player ID: " + playerid);
        System.out.println("Kit Number: " + kitnumber);
        System.out.println("Team: " + team);
        System.out.println();
    }
}
    public class q1{
       
       
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
             int kit;
            String playerName;
            System.out.println("Enter Player 1 Name: ");
            
            playerName = sc.nextLine();
            System.out.println("Enter Player 1 Kit Number: ");
            kit=sc.nextInt();
            baller player1 = new baller(playerName,kit);
             sc.nextLine();
            System.out.println("Enter Player 2 Name: ");
            playerName = sc.nextLine();
            System.out.println("Enter Player 2 Kit Number: ");
            kit=sc.nextInt();
            baller player2 = new baller(playerName,kit);

            player1.display();
            player2.display();
            sc.close();
         }
    }
