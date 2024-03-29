package Bai4;
import java.util.Scanner;
public class PhongMay {
    private String Maphong, Tenphong;
    private double Dientich;
    private int n;
    private QuanLy x;
    private May[] y;

    Scanner sc = new Scanner(System.in);
    public PhongMay() {

    }

    public PhongMay(String maphong, String tenphong, int dientich, QUANLY x, MAY[] y, int n) {
        Maphong =maphong;
        Tenphong =tenphong;
        Dientich = dientich;
        this.x = x;
        this.y = y;
        this.n = n;
    }
    public void NHAP(){
        System.out.println("Nhập mã phòng: ");
        Maphong= sc.nextLine();
        System.out.println("NHập tên phòng: ");
        Tenphong = sc.nextLine();
        System.out.println("Nhập diện tích phòng: ");
        Dientich= sc.nextDouble();
        x= new QuanLy();
        x.NHAP();
        System.out.println("Nhập số máy: ");
        n= sc.nextInt();
        y= new May[n];
        for(int i =0; i< n; i++){
            y[i] = new May();
            System.out.println("Nhập thông tin máy " + (i+1)+ " : ");
            y[i].NHAP();
        }

    }
    public void XUAT(){
        System.out.println("Mã phòng: "+Maphong);
        System.out.println("Tên phòng: "+Tenphong);
        System.out.println("Diện tích phòng: "+Dientich);
        x.XUAT();
        System.out.println("THÔNG TIN VỀ MÁY");
        for(int i=0;i<n;i++) {
            y[i].XUAT();
        }
    }
}
