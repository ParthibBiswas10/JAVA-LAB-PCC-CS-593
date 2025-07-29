import java.util.*;
class library{
    String name;
    int price;
    int day;
    double fine;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        name=sc.nextLine();
        System.out.println("Enter Book Price: ");
        price=sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        System.out.println("Enter no of days delayed to return the book: ");
        day=sc.nextInt();

        sc.close();
    }
    void cal(){
        fine=0.0;
        if(day<=7) fine =day*25;
        if(day>7 && day<=15) fine=(7*25)+(day-7)*40;
        if(day>15 && day<=30) fine=(7*25)+(8*40)+(day-15)*60;
        if(day>30) fine=(7*25)+(8*40)+(15*60)+(day-30)*80;
    }
    void display(){
        System.out.println("Books name: "+name);
        System.out.printf("Fine: %.2f Paise\n",fine);
    }
    public static void main(String[] args) {
        library lib=new library();
        lib.input();
        lib.cal();
        lib.display();    
    }
}