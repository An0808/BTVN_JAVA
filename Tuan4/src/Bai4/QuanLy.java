package Bai4;
import java.util.Scanner;
public class QuanLy {
    private String Maql, Hoten;
    Scanner sc = new Scanner(System.in);
    public QuanLy(){
    }
    public QuanLy(String Maql, String Hoten){
        Maql= Maql;
        Hoten = Hoten;
    }
    public void NHAP(){
        System.out.println("Nhập mã quản lý: ");
        Maql= sc.nextLine();
        System.out.println("Nhập họ tên: ");
        Hoten= sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Mã quản lý: "+Maql+ " Họ tên: " + Hoten);
    }

}
