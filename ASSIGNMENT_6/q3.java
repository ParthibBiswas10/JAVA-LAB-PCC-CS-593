/*6.3 Write a program in Java to enter a sentence. Display the words which are only palindrome.
Sample Input: MOM AND DAD ARE NOT AT HOME
Sample Output: MOM
 DAD* */

 
import java.util.*;
class solution{
    void  check(String str){
       
        String words[]=str.split(" ");
        for(String word:words){
           int l=0;
           int r=word.length()-1;
            if(word.charAt(l)!=word.charAt(r));
            else{
                System.out.println(word);
            }
           
        }
        
    }
}
public class q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        solution obj=new solution();
        obj.check(s);
    }
}