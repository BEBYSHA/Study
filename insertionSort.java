public class insertionSort {
    static void insertionSort(char[] data){
        for(int i = 1; i < data.length; ++i){
            char temp = data[i];
            int j = i - 1;
            while(j >= 0 && data[j] > temp){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }
    static void cetakArr (char[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
    }
    public static void main(String[] args){
        char[] arr = {'n','u','s','a','n','t','a','r','a' };
        System.out.print("Data array belum diurutkan InsertionSort = ");
        cetakArr(arr);
        System.out.print("\nData array sudah diurutkan InsertionSort = ");
        insertionSort(arr);
        cetakArr(arr);
    }
}
