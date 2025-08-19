/*6.2 Write a program in Java to enter a String/Sentence and display the longest word and the length of
the longest word present in the String.
Sample Input: “TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN”
Sample Output: The longest word: FOOTBALL: The length of the word: 8 */
import java.util.*;
class solution{
    void  check(String str){
        int maxlength=0;
        String longestString="";
        String words[]=str.split(" ");
        for(String word:words){
            if(word.length()>maxlength){
                longestString=word;
                maxlength=word.length();
            }
        }
        System.err.println("Longest String: "+longestString+"\n"+"MaxLength: "+maxlength);
    }
}
public class q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        solution obj=new solution();
        obj.check(s);
    }
}