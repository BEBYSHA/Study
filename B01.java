import java.util.*;
public class B01 {
    Scanner input = new Scanner (System.in);
    String [] namabarang = {"sepatu niken","Tas Punggung Altos",
            "Celana Jeans Lepis","teh ember",
            "rexina","nipea",
            "garmier","pepsident",
            "sampierna","kendir joy"};
    int [] hargabarang = {200000,150000,25000,2000,7000,34000,24000,12000,28000,10000};
    int [] stokbarang = {10,10};

    private String getNamaBarang(int i) {

        return namabarang[i];
    }
    private int getHargaBarang(int i) {

        return hargabarang[i];
    }
    private int getStokBarang(int i) {

        return stokbarang[i];
    }
    private void ubahStokBarang(int i) {

        stokbarang[i]--;
    }
    private void showinfoBarang(int i) {
        System.out.println("Nama    : "+getNamaBarang(i));
        System.out.println("Harga   : "+getHargaBarang(i));
        System.out.println("Stok    : "+getStokBarang(i));
    }
    private int showmenu() {
        for (int i=0; i<namabarang.length; i++){
            System.out.println((i+1)+"."+getNamaBarang(i));
        }
        System.out.print("Pilihan Anda : ");
        return input.nextInt();
    }
    private void jualan(int i) {
        int banyak,total,uang;

        System.out.print("Beli berapa = ");
        banyak = input.nextInt();
        total = (banyak*getHargaBarang(i));
        System.out.println("Total = "+total);
        System.out.print("Uang yang Di Bayarkan Rp.");
        uang = input.nextInt();
        System.out.println("Uang Kembalian Rp. " + (uang-total));
        ubahStokBarang(i);
    }
    public B01(){
        int pil = 0;
        do {
            pil = showmenu();
            if (pil > 0 && pil < 4){
                pil--;
                showinfoBarang(pil);
                jualan(pil);
            }else{
                System.out.println("Toko Tutup");
            }
        }
        while (pil > 0 && pil < 4);
    }
    public static void main(String[] args) {
        new B01();
    }
}
