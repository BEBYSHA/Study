public class mergesort{
    static void MergeSort(double[] arr) {
        int n = arr.length;
        if (n < 2) return;
        int midIndex = n / 2;
        double[] leftHalf = new double[midIndex];
        double[] rightHalf = new double[n - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }
        for (int i = midIndex; i < n; i++) {
            rightHalf[i - midIndex] = arr[i];
        }
        MergeSort(leftHalf);
        MergeSort(rightHalf);
        merge(arr, leftHalf, rightHalf);
    }
    static void merge(double[] arr, double[] leftHalf, double[]
            rightHalf) {
        int leftsize = leftHalf.length;
        int rightsize = rightHalf.length;
        int i = 0, j = 0, k = 0;
        while (i < leftsize && j < rightsize) {
            if (leftHalf[i] < rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (j < rightsize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        double[] arr = {1, 0.5, 5, 3, 2.6, 10.3, 1.7, 4.1};
        MergeSort(arr);
        for (double i : arr) {
            System.out.print(i + ", ");
        }
    }
}