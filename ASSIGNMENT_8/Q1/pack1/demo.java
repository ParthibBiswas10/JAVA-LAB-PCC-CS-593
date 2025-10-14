package pack1;
public class demo{
    public int publicval=10;
    private int privateval=20;
    protected int protectedval=30;
    int defaultval=40;

    public void display() {
        System.out.println("Inside class demo :");
        System.out.println("privateval = " + privateval);
        System.out.println("defaultval = " + defaultval);
        System.out.println("protectedval = " + protectedval);
        System.out.println("publicval = " + publicval);
        System.out.println("\n \n");
    }

}


 