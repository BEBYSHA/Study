import java.util.Scanner;
public class A04 {
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        System.out.println("-------TOKO ROMAYANA-------");

        System.out.print("Banyak Kemeja yang dibeli = "); int banyak = masuk.nextInt();
        System.out.print("Jumlah pembayaran         = "); int bayar = masuk.nextInt();

        int diskon1,diskon2;
        diskon2 = bayar*100/90;
        diskon1 = diskon2*100/75;
        int satuan = diskon1/banyak;
        System.out.println("Harga satuan kemeja Arisan = " + satuan);
    }
}