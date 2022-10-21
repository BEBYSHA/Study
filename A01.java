import java.util.*;
public class A01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total;
        int diskon;
        System.out.println("-----Toko Mataheri-----");
        System.out.print("Masukkan Harga Barang = ");
        total = input.nextInt();
        System.out.println("Total Harga = "+ total);
        if(total >= 500000){
            diskon = total*5/100;
            total = total - diskon;
            System.out.println("Mendapatkan Diskon 5% = "+ total);
            diskon = total*10/100;
            total = total - diskon;
            System.out.println("Mendapatkan Diskon 5% = "+ total);
        }
    }
}