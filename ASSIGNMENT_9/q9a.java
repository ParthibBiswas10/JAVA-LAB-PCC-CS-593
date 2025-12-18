//a) Demonstrating the member inner class.

class outer{
    void show(){
        System.out.println("I'm Outer Class !! ");
    }
    class Inner{
        void display(){
            System.out.println("I'm Inner class");
        }
    }

}
public class q9a{
    public static void main(String[] args) {
        outer obj=new outer();
        outer.Inner in = obj.new Inner();
        obj.show();
        in.display();
    }

}