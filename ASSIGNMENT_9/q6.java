/*9.6 Write a java program to implement multiple inheritance using interface*/
interface humanity{
    void human();
}
interface footballer{
    void GOAT();
}
class LeoMessi implements humanity,footballer{
    public void human(){
        System.out.println("As a human, Leo Messi is too good");
    }
    public void GOAT(){
        System.out.println("Leo is the GOAT of football");
    }

}
public class q6{
    public static void main(String[] args) {
        LeoMessi lm =new LeoMessi();
        lm.GOAT();
        lm.human();
    }
}