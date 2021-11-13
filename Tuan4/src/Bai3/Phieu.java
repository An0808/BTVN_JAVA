package Bai3;
import java.util.Scanner;
public class Phieu {
    private String Maphieu;
    private int n;
    private Hang[] x;
    Scanner sc= new Scanner(System.in);
    public Phieu(){

    }
    public PHIEU(String maphieu, int n, Hang[] x){
        Maphieu= maphieu;
        this.n= n;
        this.x= x;
    }
    public void NHAP(){
        System.out.println("Nhập mã phiếu: ");
        Maphieu= sc.nextLine();
        System.out.print("Nhập số mặt hàng: ");
        n = sc.nextInt();
        System.out.println("Nhập thông tin các mặt hàng: ");
        x = new Hang[n];
        for(int i = 0; i< n; i++){
            x[i] = new Hang();
            System.out.println("Nhập thông tin mặt hàng thứ "+ (i+1) + " :");
            x[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println("Mã phiếu: " + Maphieu);
        double sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("Thông tin mặt hàng: " + (i+1));
            x[i].XUAT();
            sum += x[i].getDongia();
        }
        System.out.println("Tổng tiền của phiếu là: : " + sum);
    }

}
