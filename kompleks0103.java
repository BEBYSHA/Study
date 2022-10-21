/*
TUGAS PERTEMUAN KE-01
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM         : 2113020201
Nama        : Shalaisha Amelia Putri Gemini
Kelas       : 2A
Kategori    : kompleks
Soal        : 3
 */

public class kompleks0103 {
    static int linearSearch(int[] dataArray, int key){
        for(int i = 0; i < dataArray.length; i++){
            if(dataArray[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] dataArray = {2,4,5,7,8,10,9,11,6,13};
        int key = 5;

        int hasil = linearSearch(dataArray, key);
        if (hasil == -1){
            System.out.println("Angka yang anda cari tidak ada.....");
        } else {
            System.out.println("Angka " + key + " berada di indeks yang ke- "+ hasil);
        }
    }
}