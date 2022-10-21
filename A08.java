import java.util.*;
public class A08 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("\nKredit Bank Rakyat Kediri\nTabungan investasi bunga 5%/tahun\n");

        System.out.println("Syarat: \n-tidak boleh ada transaksi penarikan\n-setoran awal minimal 10.000.000\n-diisi minimal 100.000/bulan");
        System.out.println("""
                Hadiah bagi pendaftar kesayangan
                 __________________________________________________________
                | Setoran Awal       | Hadiah                             |
                |---------------------------------------------------------|
                | Rp.10jt - Rp.20jt  | Samsang Galaksih S21 FE 5G 128GB   |
                | Rp.20jt - Rp.30jt  | Samsang Galaksih S22 Ultra 255GB   |
                | Rp.30jt - Rp.50jt  | ELG OLED 55G1PTA OLED EVO 55INCH   |
                | Lebih dari Rp.50jt | Sonny XR-77A80K 4K HDR OLED 77INCH |
                -----------------------------------------------------------""");

        System.out.print("\nSetoran awal= ");
        long awal= masuk.nextInt();
        System.out.print("Setoran perbulan= ");
        long setor= masuk.nextInt();

        if (awal>=10000000 & awal<20000000){
            System.out.println("Selamat anda mendapat hadiah Samsang Galaksih S21 FE 5G 128GB\n");
        }else if (awal>20000000 & awal<30000000){
            System.out.println("Selamat anda mendapat hadiah Samsang Galaksih S22 Ultra 255GBB\n");
        }else if (awal>30000000 & awal<50000000){
            System.out.println("Selamat anda mendapat hadiah ELG OLED 55G1PTA OLED EVO 55INCHB\n");
        }else if (awal>50000000){
            System.out.println("Selamat anda mendapat hadiah Sonny XR-77A80K 4K HDR OLED 77INCH\n");
        }

        System.out.print("Saldo tahun ke-");
        int n= masuk.nextInt();
        long setaun=setor* 12L,akhir=0;

        for (int j=0;j<n;j++){
            if (j==1){
                setaun=setor* 12L;
            }
            if (j==0){
                setaun = setaun+awal;
            }
            akhir = setaun+akhir+((setaun+akhir)*5L/100);
        }

        System.out.println("Setoran awal = Rp."+awal);
        System.out.println("Mendapat bunga 5% setiap tahunnya.\nSaldo akhir setelah "+n+" tahun adalah= Rp."+ (akhir));
    }
}