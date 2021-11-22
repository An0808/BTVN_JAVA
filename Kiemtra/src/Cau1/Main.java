package Cau1;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        System.out.println("Nhập một chuỗi: ");
        str = sc.nextLine();
        int dem = 0;
        int sum = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                dem++;
                sum += (str.charAt(i) - '0');
            }
            if(dem!=0) {
                System.out.println("Có " + dem + "ký tự số.");
                System.out.println("Tích: " + (float)sum/dem);
            }
            else{
                System.out.println("Không có ký tự số.");
            }
        }
    }
}
