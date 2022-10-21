import java.util.Scanner;
public class sp2 {
    public static void main(String[] args){
        String[] huruf = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        System.out.println("W berada di "+ (binarySearch(huruf, "w") +1));
    }
    static int binarySearch(String[] arr, String key) {
        int first = 0, last = arr.length - 1;
        while(first <= last){
            int mid = first + (last - first) / 2;
            int result = key.compareTo(arr[mid]);

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