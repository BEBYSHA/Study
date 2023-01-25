import java.util.Scanner;

public class mudah0101 {
    public static void main(String[] args){
        String nama, kelas, npm, alamat, univ;

        Scanner input_bio = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        nama    = input_bio.nextLine();
        kelas   = input_bio.nextLine();
        npm     = input_bio.nextLine();
        alamat  = input_bio.nextLine();
        univ    = input_bio.nextLine();

        System.out.println("---------------------------------------------");
        System.out.println("Nama    = "+ nama);
        System.out.println("Kelas   = "+ kelas);
        System.out.println("NPM     = "+ npm);
        System.out.println("Alamat  = "+ alamat);
        System.out.println("Univ    = "+ univ);
        System.out.println("---------------------------------------------");
    }
}
