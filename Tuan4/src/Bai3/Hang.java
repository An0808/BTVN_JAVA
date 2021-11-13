package Bai3;
import java.util.Scanner;
import java.util.Date;
public class Hang {
    private String Mahang,Tenhang;
    private  double Dongia;
    Scanner sc = new Scanner(System.in);
    public Hang(){
    }
    public Hang(String mahang, String tenhang, Double dongia){
        Mahang = mahang;
        Tenhang=tenhang;
        Dongia = dongia;
    }
    public void NHAP(){
        System.out.println("Nhập mã hàng: ");
        Mahang= sc.nextLine();
        System.out.println("Nhập tên hàng: ");
        Tenhang= sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        Dongia= sc.nextDouble();
    }
    public void XUAT(){
        System.out.println("Mã hàng: " + Mahang +" Tên hàng: "+Tenhang+" Đơn giá: "+Dongia);

    }
    public double getDongia(){
        return Dongia;
    }

}
