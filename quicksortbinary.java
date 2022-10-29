public class quicksortbinary {
    public static void quickSort(String data[], int start, int end) {
        int i = start;
        int k = end;
        if (end - start >= 1) {
            String pivot = data[start];
            while (k > i) {
                while (data[i].compareTo(pivot) >= 0 && i <= end &&
                        k > i)
                    i++;
                while (data[k].compareTo(pivot) <= 0 && k >= start
                        && k >= i)
                    k--;
                if (k > i)
                    swap(data, i, k);
            }

            swap(data, start, k);

            quickSort(data, start, k - 1);
            quickSort(data, k + 1, end);
        } else {
            return;
        }
    }
    public static void swap(String data[], int index1, int index2) {
        String temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
    static int binarySearch(String[] data, String key){
        int Awal = 0;
        int Akhir = data.length - 1;
        while (Awal <= Akhir) {
            int Tengah = (Awal + Akhir) / 2;
            if (data[Tengah].compareTo(key) > 0 ) {
                Awal = Tengah + 1;
            }else if (data[Tengah].compareTo(key) < 0) {
                Akhir = Tengah -1;
            }else {
                return Tengah +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String[] data =
                {"Badrun","Evan","Imron","Adhim","Rendy","Andika","Triandi","Cahyo","Rizki",
                        "Dimas","Fandi","Hadi","Zaki","Wendy","Indra","Gilang","Yusron","Mamad",
                        "Susanto","Nanda","Hakim","Abid","Febri","Jeje"};
        String key = "Mamad";
        quickSort(data, 0, data.length-1);
        for(String i : data) {
            System.out.println("-"+i);
        }
        System.out.println(binarySearch(data, key));
    }
}