package Bai5;

public class main {
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i =2; i*i<n; i++){
            if(n% i ==0)
                return false;
        }
        return true;
    }
    public static boolean isPrime(long n){
        if(n<=1)
            return false;
        for(int i =2; i*i<n; i++){
            if(n% i ==0)
                return false;
        }
        return true;
    }
    public static boolean isPrime(float n){
        return false;
    }
    public static boolean isPrime(double n){
        return false;
    }
    public static void main(String[] args){
        System.out.println(isPrime(11));
        System.out.println(isPrime(112l));
        System.out.println(isPrime(11.2f));
        System.out.println(isPrime(11.1234));
    }
}
