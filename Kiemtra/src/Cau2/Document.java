package Cau2;
import java.util.Scanner;
public class Document {
    protected String id;
    protected String name;
    protected String publisher;
    protected Integer price;
    private ArrayList<Book> x;
    private int n;
    public Document(){}

    public Document(String id, String name, String publisher, Integer price, ArrayList<Book> x, int n) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
        this.x = x;
        this.n = n;
    }
    public void Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập id: ");
        this.id= sc.nextLine();
        System.out.println("Nhập tên: ");
        this.name= sc.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        this.publisher= sc.nextLine();
        System.out.println("Nhập giá: ");
        this.price= sc.nextInt();
    }
    public void Output(){
        System.out.printf("%20s %20 %20s %20d", id, name, publisher, price);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ArrayList<Book> getX() {
        return x;
    }

    public void setX(ArrayList<Book> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
