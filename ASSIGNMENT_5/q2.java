/*5.2 Write a program by using class with the following specifications:
Class name — Sale
Data members/ Instance variables:
1. String title, author, publication
2. double price
Member methods:
1. void input() — to accept title, author name and publication name and price of a book
2. void display() — to display title, author name and publication name and price of a book
Now, create another class 'Purchase' that inherits class 'Sale' having the following specifications:
Class name — Purchase
Data members/ Instance variables:
1. int noc
2. int amount;
Member methods:
1. void accept() — to enter the number of copies purchased
2. void calculate( ) — to find the amount by multiplying number of copies ordered and price (i.e.,
noc * price)
3. void show() — to display the elements describes in base class along with the number of copies
purchased and amount to be paid to the shopkeeper */

import java.util.*;
class Sale{
    String title,author,publication;
    double price;
  void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
        System.out.print("Enter Publication Name: ");
        publication = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("publication: " + publication);
        System.out.println("Price: " + price);
    }

}
class Purchase extends Sale {
    Scanner sc=new Scanner(System.in);
    int noc;
    double amt;
    void accept(){
        System.out.println("Number of Copies Ordered: ");
        noc=sc.nextInt();

    }
    void cal(){
        amt=noc*price;
      
    }
    void show(){
        display();
        System.out.println("Copies: "+noc);
        System.out.println("Total Amount: "+amt);
    }
}
public class q2{
    public static void main(String[] args) {
        Purchase obj=new Purchase();
        obj.input();
        obj.accept();
        obj.cal(); 
        obj.show();



    }
}

