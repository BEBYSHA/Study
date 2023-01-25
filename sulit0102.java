import java.util.Scanner;

public class sulit0102 {
    public static void main(String[] args){
        int[][] a = {{2,4,3},{1,2,8},{3,4,7}}, b = {{1,5,2},{8,12,4},{11,6,6}}, kali = new int [3][3];
        System.out.println("---------------------------------------------");
        System.out.println("Matrix 1 ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(a [i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        System.out.println("Matrix 2 ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(b [i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Perkalian Matrix 3x3");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                kali[i][j] = 0;
                for(int k = 0; k < 3; k++){
                    kali[i][j] = kali[i][j] + a[i][k]*b[k][j];
                }
                System.out.print(kali[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        Scanner input = new Scanner(System.in);
        int[][] angka = {{1,4,3},{7,5,8},{9,2,3}};
        System.out.println("Matrix");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                System.out.print(angka [i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan Nilai Array Yang Akan Dicari = ");
        int cari = input.nextInt();
        for(int k = 0; k < angka.length; k++){
            for(int l = 0; l < angka.length; l++){
                if(angka[k][l]==cari){
                    System.out.println("Nilai Yang Anda Cari = "+ cari);
                    System.out.println("Indeks ke- "+(l+1));
                    System.out.println("Baris ke- "+ (k+1));
                    System.out.println("---------------------------------------------");
                }
            }
        }
    }
}
