/*8.2 Write a java program to create a package named mypack, include a class named Shape under this
package. Define a method getArea() under the Shape class and overload the getArea() to calculate area
of a rectangle, a square and a circle in the same class. Now, import the mypack package from another
class named Figure and call the respective method to calculate area of a rectangle, a square and a circle
by providing appropriate data.
*/

package mypack;
public class shape{
    public double getarea(double l, double w){
        return l*w;
    }
    public double getarea(double a){
        return a*a;
    }
    public double getarea(double r,char type){
        return 3.14*r*r;
    }

}
