public class SP2 {
    public static void main(String[] args) {
        int[] angka = {12,8,100,-45,3,-1};
        int max = angka.length;
        int min = angka.length;
        for(int i = 0; i < angka.length; i++) {
            if(max < angka [i]){
                max = angka [i];
            }
            if(min > angka [i]){
                min = angka [i];
            }
        }
        System.out.println("Nilai Terbesar = "+ max);
        System.out.println("Nilai Terkecil = "+ min);
    }
}