import java.util.*;
public class A02 {
    public static void main(String[] args){
        int harga, banyak, diskon, total;

        Scanner input = new Scanner(System.in);

        System.out.println("-----Toko Romayana-----");
        System.out.print("Masukkan Harga Barang = ");
        harga = input.nextInt();
        System.out.print("Masukkan Banyak Barang = ");
        banyak = input.nextInt();
        total = harga*banyak;
        System.out.println("Total Harga = "+ total);

        diskon = total*25/100;
        total = total - diskon;
        System.out.println("Total Harga Setelah di Diskon 25% = "+ total);

        diskon = total*10/100;
        total = total - diskon;
        System.out.println("Total Harga Setelah di Diskon 10% = "+ total);
    }
}