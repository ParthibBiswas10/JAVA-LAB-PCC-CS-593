/*b) Demonstrating static nested class with instance method and static method.*/

class Outer {

    static int x = 10;   
    static class Inner {
        void show() {
            System.out.println(x);
        }
    }
}

public class q9b{
    public static void main(String[] args) {

       
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}

//note: Instantiation doesn’t require an outer class object: Outer.StaticInner inner = new Outer.StaticInner();
