/*8.4 Write a java program to create a package named mathcal, include a class named FactGCD under this
package. Define two methods calFactorial() and calGCD() under the FactGCD class. Now, create a subpackage of mathcal named mathcheck, include a class named Prime. Define a method isPrime() under
the Prime class. Now, import mathcal and mathcheck packages from another class named Calculations
and call the respective method by providing appropriate data.*/

package mathcal;
public class FactGCD{
    public int calFactorial(int a){
        int x=a;
        int num=1;
        while(x>0){
            num=num*x;
            x--;
        }
        return num;
        

    }
    public int calGCD(int a, int b){
        if(b==0) return a;
        return calGCD(b,a%b);
    }
}