public class bubblesort {
    static void BubbleSort(int[] data){
        for (int e1 = 0; e1 < data.length; e1++){
            for (int e2 = e1 + 1; e2 < data.length; e2++){
                if (data[e1] > data[e2]){
                    int tampung = data[e1];
                    data[e1] = data[e2];
                    data[e2] = tampung;

                }
            }
        }
    }
    static void cetakArray (int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public static void main(String[] args){
        int [] dataArray = {13, 32, 26, 35, 10};
        System.out.print("data array belum diurutkan= ");
        cetakArray(dataArray);
        System.out.print("\ndata array sudah diurutkan= ");
        BubbleSort(dataArray);
        cetakArray(dataArray);
    }
}