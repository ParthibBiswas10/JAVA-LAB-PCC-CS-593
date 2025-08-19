/*6.1 Write a program in Java to accept a String in upper case and replace all the vowels present in the String with
Asterisk (*) sign.
Sample Input: "TATA STEEL IS IN JAMSHEDPUR"
Sample output: T*T* ST**L *S *N J*MSH*DP*R*/

import java.util.*;
class solution{
     boolean isVowel(char c){
        return "AEIOU".indexOf(c)!=-1;
    }
    void check(String str){
    StringBuilder sb=new StringBuilder(str);
       for(int i=0;i<str.length();i++){
            if(isVowel(sb.charAt(i))){
                sb.setCharAt(i,'*');
            }
       }
       System.err.println(sb.toString());
    }
}
public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        String str=s.toUpperCase();
        solution obj=new solution();
        obj.check(str);
        
    }
}