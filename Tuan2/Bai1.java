package Tuan2;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a= sc.nextInt();
        System.out.print("Nhập b = ");
        int b= sc.nextInt();
        System.out.print("Nhập c = ");
        int c= sc.nextInt();
        System.out.println("Số lớn nhất là: " + max(a, b, c));
    }
    public static int max(int a,int b,int c){
        if(a>=b && a>=c){
            return a;
        }else if(b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }
}
