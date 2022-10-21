import java.util.*;
public class sp3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan versi tahun = ");
        String input = scan.next();

        String[] split = new String[2];
        ArrayList<String> splits = new ArrayList<>();
        String[][] datas = {
                {"JDK 1.0", "23 Januari 1996"},
                {"JDK 1.1", "19 Febuari 1997"},
                {"J2SE 1.2", "8 Desember 1998"},
                {"JSE 1.3", "8 Mei 2000"},
                {"JSE 1.4", "6 Febuari 2001"},
                {"J2SE 5.0", "30 September 2004"},
                {"Java SE 6", "11 Desember 2006"}
        };

        for(String[] data : datas){
            for(int i = 0; i < (data.length-1); i++){
                split = data[1].split(" ");
            }
            splits.add(split[2]);
        }
        System.out.println(Arrays.toString(datas[binarySearch(splits, input)]));
        System.out.println("Banyak versi = "+ datas.length);
    }
    static int binarySearch(ArrayList<String> arr, String key) {
        int first = 0, last = arr.size();
        while(first <= last){
            int mid = first + (last - first) / 2;
            int result = key.compareTo(arr.get(mid));

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