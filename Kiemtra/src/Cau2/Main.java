package Cau2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<Book> books= new ArrayList<>();
    private static int n;
    private static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        Addbook();

    }
    private static void Addbook(){
        System.out.println("Nhập số sách: ");
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("Nhập thông tin quyển sách thứ "+(i+1));
            Book book = new Book();
            book.Input();
            books.add(book);
        }
    }
    private static void Sortbooksbyprice(Book book){
        for(int i=0; i<n; i++) {
            for(int j=n; j>i; j--) {
                if(book.get().get(j-1).getKhoaHoc() > lopHoc.getX().get(j).getKhoaHoc()) {
                    SinhVien temp = lopHoc.getX().get(j-1);
                    lopHoc.getX().set(j-1, lopHoc.getX().get(j));
                    lopHoc.getX().set(j, temp);
                }
            }
        }
    }
}
}
