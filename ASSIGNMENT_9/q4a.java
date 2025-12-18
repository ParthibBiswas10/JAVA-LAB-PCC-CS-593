//a) To check age of valid voter (only 18 years or above can caste the vote). 
import java.util.*;
class AgeException extends Exception{
    public AgeException(String s){
        super(s);
    }
}
class validityCheck{
     void check(int age){
        try{
   
        if(age<18){
            throw new AgeException("Cant cast vote rn !");
        }
        else{
            System.out.println("Vote Done");
        }
    }
   
    catch(AgeException e){
        System.out.println("ERROR: "+e.getMessage());

    }
     }
}
public class q4a{
    public static void main(String[] args) {
        System.out.println("Enter Age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        validityCheck obj=new validityCheck();
        obj.check(age);

    }
}