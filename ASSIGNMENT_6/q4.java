
import java.util.*;
class solution{
    void  check(String str){
        String words[]=str.split(" ");
      for(int i=words.length-1;i>=0;i--){
        System.out.print(words[i]+" ");
        }
        
    }
}
public class q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        solution obj=new solution();
        obj.check(s);
    }
}