package mathcal.mathcheck;

public class prime {
    public int isPrime(int a){
    for(int i=2;i<=Math.sqrt(a);i++){
        if(a%i==0) return 0;
    }
    return 1;

}
}