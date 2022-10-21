import java.util.*;
public class sp4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] persons = {
                "Agus",
                "Budi",
                "Bukhori",
                "Cahyo",
                "Mat Solar",
                "Mesii",
                "Poniran",
                "Ronaldo",
                "Sholihin",
                "Supri",
                "Suraji",
                "Taehyung",
                "Waluyo"
        };
        System.out.print("Masukkan Nama = ");
        String nama = scan.next();
        System.out.println("Berada di "+ (binarySearch(persons,nama.toLowerCase()) +1));
    }
    static int binarySearch(String[] arr, String key) {
        int first = 0, last = arr.length - 1;
        while(first <= last){
            System.out.println(first + " " + last);
            int mid = first + (last - first) / 2;
            System.out.println((last - first)+ " " + mid);

            int result = key.compareTo(arr[mid].toLowerCase());

            if(result == 0){
                return mid;
            }
            if(result > 0){
                first = mid + 1;
            } else{
                last = mid -1;
            }
        }
        return -1;
    }
}