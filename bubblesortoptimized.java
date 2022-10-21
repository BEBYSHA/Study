public class bubblesortoptimized {
    static void bubbleSort(int[] data) {
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length - 1; j++){
                if(data[j] > data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    static void cetakArray (int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] dataArray = {3,7,11,5,12,6,16,9};
        System.out.print("Data array belum diurutkan BubbleSort = ");
        cetakArray(dataArray);
        System.out.print("\nData array sudah diurutkan BubbleSort = ");
        bubbleSort(dataArray);
        cetakArray(dataArray);
    }
}