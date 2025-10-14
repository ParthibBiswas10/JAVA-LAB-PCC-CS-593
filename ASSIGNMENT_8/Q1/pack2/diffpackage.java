package pack2;
import pack1.demo;

class extra extends demo{
    public void abc(){
        System.out.println("Protected Variable: "+protectedval);

    }
   
}
public class diffpackage{
    public static void main(String[] args) {
        demo obj=new demo();
        obj.display();

        System.out.println("From Different Package: ");
        // System.out.println(obj.privateVar);   //
        // System.out.println(obj.defaultVar);   //
        // System.out.println(obj.protectedVar); //
        System.out.println("publicVar = " + obj.publicval);
       
    }
}