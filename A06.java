import java.util.*;
public class A06 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("-----Bank Rakyat Kediri-----");
        double pinjaman, waktu, cicilan, bunga;
        System.out.print("Masukan yang ingin anda pinjam Rp.");
        pinjaman = input.nextDouble();
        System.out.print("Masukan jangka waktu yang anda inginkan = ");
        waktu = input.nextDouble();
        System.out.println("Anda memperolah bunga 2%");

        bunga = (pinjaman *0.02) /12;
        cicilan = (pinjaman / waktu);
        System.out.println("Cicilan yang anda bayar selama " + waktu +"\nyaitu Rp. " +(cicilan+bunga));
    }
}