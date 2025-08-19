/**6.5 Write a program to input a sentence and display the word of the sentence that contains maximum
number of vowels. */


 
import java.util.*;
class solution{
      boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
    void  check(String str){
       int max=0;
       String maxVowel="";
        String words[]=str.split(" ");
        for(String word:words){
            int count=0;
        for(int i=0;i<word.length();i++){
            if(isVowel(word.charAt(i))){
                count++;
           }
        }
        if(count>max){
            max=count;
            maxVowel=word;
        }
     }
     System.out.println("Word With Max Vowels: "+maxVowel+", Vowels Presnet: "+max);
        
    }
}
public class q5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        solution obj=new solution();
        obj.check(s);
    }
}