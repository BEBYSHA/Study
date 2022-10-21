import java.util.*;
public class A03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total;
        int diskon;

        System.out.print("Masukkan Harga Diskon = ");
        total = input.nextInt();
        diskon = total*100/95;

        System.out.println("Jadi Harga Sebelum di Diskon = "+ diskon);
    }
}