import java.lang.reflect.Array;
import java.util.Arrays;

public class SP1 {
    public static void main(String[] args) {
        int[] angka = {12,5,21,2,8,15};
        int total = 0, hasil = 0;
        System.out.println("Jumlah Array = " + Array.getLength(angka));
        for(int i = 0; i<6; i++){
            total = total + angka [i];
            hasil = total/Array.getLength(angka);
        }
        System.out.println("Urutan Array = "+ Arrays.toString(angka));
        System.out.println("Total Array =\s "+ total);
        System.out.println("Nilai Rata-rata Pada Array = "+ hasil);
    }
}