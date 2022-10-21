import java.util.Scanner;
public class SP5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] angka = {{1,4,3},{7,5,8},{9,2,3}};
        int mencari;
        System.out.println("Matrix");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                System.out.print(angka [i][j]+ " ");
            }
            System.out.println();
        }
        System.out.print("Masukkan Nilai Array Yang Akan Dicari = ");
        int cari = input.nextInt();
        for(int k = 0; k < angka.length; k++){
            for(int l = 0; l < angka.length; l++){
                if(angka[k][l]==cari){
                    System.out.println("Nilai Yang Anda Cari = "+ cari);
                    System.out.println("Indeks ke- "+(l+1));
                    System.out.println("Baris ke- "+ (k+1));
                }
            }
        }
    }
}
