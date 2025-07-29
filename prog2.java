import java.util.*;
class stock{
    String title;
    String author;
    String Publisher;
    int copies;
    void getdata(Scanner sc){
        System.out.println("Enter Book Name: ");
        title=sc.nextLine();
        System.out.println("Enter Author: ");
        author=sc.nextLine();
        System.out.println("Enter Publisher: ");
        Publisher=sc.nextLine();
        System.out.println("Enter No of Total Copies: ");
        copies=sc.nextInt();
        sc.nextLine(); // consume leftover newline
    }
    void purchase(String t,String a,String p,int n){
        if(title.equals(t) && author.equals(a) && Publisher.equals(p)){
            if(copies>n){
                System.out.println("Book Purchased Done !!");
                System.out.println("Number of Books Left in Stock: "+(copies-n));

            }
            else System.out.println("Not Enough Copies available");

        }
        else System.out.println("Not availbale");
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stock book=new stock();
        book.getdata(sc);
        System.out.println("\nEnter details to purchase:");
        System.out.print("Enter Title: ");
        String pt = sc.nextLine();

        System.out.print("Enter Author: ");
        String pa = sc.nextLine();

        System.out.print("Enter Publisher: ");
        String pp = sc.nextLine();

        System.out.print("Enter number of copies to purchase: ");
        int pn = sc.nextInt();
        sc.close();
       
        book.purchase(pt, pa, pp, pn);
        
    }
}
