package Bai2;
import java.util.Scanner;
public class Date {
    private int D,M,Y;
    Scanner sc= new Scanner(System.in);
    public Date(){
    }
    public Date(int d, int m, int y) {
        D = d;
        M = m;
        Y = y;
    }
    public void NHAP(){
        do{
            System.out.print("Nhập vào ngày: ");
            D= sc.nextInt();
            System.out.print("Nhập vào tháng: ");
            M = sc.nextInt();
            System.out.println("Nhập vào năm: ");
            Y = sc.nextInt();
        }while(D<1 || D >31 || M <1 || M >12 || Y<= 0);

    }
    public void XUAT(){
        System.out.println(D +"/ " + M +"/ "+ Y);
    }
}
