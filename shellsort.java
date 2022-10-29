public class shellsort {
    static void shellSort(char[] arr, int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i++) {
                char temp = arr[i];
                int j;
                for (j = i; j >= interval && arr[j - interval] > temp; j
                        -= interval) {
                    arr[j] = arr[j - interval];
                }
                arr[j]=temp;

            }
        }
    }
    public static void main(String[] args) {
        char[] arr = "nusantara".toCharArray();
        shellSort(arr, arr.length);
        for (char i : arr) {
            System.out.print(i + ",");
        }
    }
}