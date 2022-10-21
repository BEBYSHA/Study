public class selectionSort {
    static void selectionSort(double[] data){
        for(int i = 0; i < data.length - 1; i++){
            int nilaiTerkecil = i;
            for(int j = i + 1; j < data.length; j++){
                if(data[j] < data[nilaiTerkecil]){
                    nilaiTerkecil = j;
                }
            }
            double temp = data[nilaiTerkecil];
            data[nilaiTerkecil] = data[i];
            data[i] = temp;
        }
    }
    static void cetakArr(double[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public static void main(String[] args){
        double[] arr = {1,0.5,5,3,2.6,10.3,1.7,4.1};
        System.out.print("Data array belum diurutkan SelectionSort = ");
        cetakArr(arr);
        System.out.print("\nData array sudah diurutkan SelectionSort = ");
        selectionSort(arr);
        cetakArr(arr);
    }
}