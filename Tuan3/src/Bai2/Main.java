package Bai2;

public class Main {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        arr1.InputData();
        arr2.InputData();

        float tbc1 = (float)arr1.Sum()/arr1.getn();
        float tbc2 = (float)arr2.Sum()/arr2.getn();
        if(tbc1 > tbc2 )
            System.out.println("TBC arr1 > TBC arr2");
        else if(tbc2 > tbc1)
            System.out.println("TBC arr2 > TBC arr1");
        else
            System.out.println("Bye");
    }
}
