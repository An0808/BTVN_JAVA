package Bai2;
import java.util.Scanner;
import java.util.Date;
public class NhanSu {
    private String Manhansu;
    private String Hoten;
    private Date  DateNS = new Date();
    public NhanSu(){
    }
    public NhanSu(String manhansu, String hoten, Date NS) {
        Manhansu = manhansu;
        Hoten = hoten;
        this.DateNS = NS;
    }
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân sự: ");
        Manhansu = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        Hoten= sc.nextLine();
        System.out.println("Nhập ngày tháng năm: ");
        DateNS.NHAP();

    }
    public void XUAT(){
        System.out.println("Mã nhân sự: " + Manhansu);
        System.out.println("Họ tên: "+ Hoten);
        System.out.print("DATE NS: ");
        DateNS.XUAT();
    }

}
