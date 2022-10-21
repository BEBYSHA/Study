import java.util.*;
public class A05 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int panjang, lebar, harga, total;

        System.out.print("Masukan Panjang Tanah = ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar Tanah = ");
        lebar = input.nextInt();
        System.out.print("Berapa Harga Tanah = ");
        harga = input.nextInt();

        total =( panjang * lebar / 14) *harga;
        System.out.println("Harga tanah yang anda harus bayar Rp. " + total);
    }
}