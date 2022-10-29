public class quicksort{
    static int partisi(int[]data, int start, int end){
        int pivot = data[end];
        int i = (start - 1);
        for (int j = start;j<= end-1;j++){
            if (data[j]< pivot){
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;

            }
        }
        int temp = data[i+1];
        data[i+1] = data[end];
        data[end] = temp;
        return (i + 1);
    }
    static void quicksort(int[]data, int start, int end){
        if (start<end){
            int pivot = partisi(data, start, end);
            quicksort(data, start, pivot -1);
            quicksort(data, pivot+1, end);
        }
    }
    static void print(int data[]){
        for (int a : data){
            System.out.print(a+" ");
        }
    }
    public static void main(String[]args){
        System.out.println();
        System.out.print("Hasil sesudah di Quicksort = ");
        int data[] = {3, 7, 11, 5, 12, 6, 16, 9};
        quicksort(data,0, data.length -1);
        print(data);
        System.out.println();
    }
}