/*8.3 Write a java program to create a package named calculation, include a class named Operations under
this package. Define two methods sum() and multiply() under the Operations class and overload the
sum() and multiply() to calculate sum and product of different data types in the same class. Now, import
the calculation package from another class named TwoOperations and call the respective method to
calculate sum and product by providing appropriate data.
*/

package calculation;
public class operations{
    public int sum(int a, int b){
        return a+b;
    }
    public int mul(int a, int b){
        return a*b;
    }

    public double sum(double a, double b){
        return a+b;
    }
    public double mul(double a, double b){
        return a*b;
    }

}
