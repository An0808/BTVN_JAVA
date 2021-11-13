package Bai1;

public class main {
    public static void main(String[] args) {
        Person a = new Person("An", 3, "Nữ", "Code");
        System.out.println(a);
        Person b = new Person();
        b.setname("An");
        b.setage(3);
        b.setgender("Nữ");
        b.sethobby("Code");

        System.out.println(b);
    }
}
