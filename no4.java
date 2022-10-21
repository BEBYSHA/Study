public class no4 {
    public static void main(String[] args) {
        String[] data = {"Badrun", "Evan", "Triandi", "Cahyo", "Zaki", "Wendy",
                "Susanto", "Nanda", "Imron", "Adhim", "Rizki", "Dimas", "Gilang", "Indra",
                "Abid", "Hamkim", "Andika", "Rendy","Hadi","Fandi","Mamad","Yusron","Jeje","Febri"};

        System.out.print("Data sebagai berikut =\n");
        tampilkan_arr(data);
        daribelakang(data);
        System.out.print("Setelah di urutkan dari belakang =\n");
        tampilkan_arr(data);
        int cari = cariBinerstring(data,"Mamad",0, data.length-1);
        System.out.println("Jadi mamad berada pada urutan ke-"+(cari+1));
    }
    public static void daribelakang(String[] barisan) {

        boolean ganti;
        String cadang;
        for (int i = 0; i < barisan.length - 1; i++) {
            ganti = false;
            for (int j = 0; j < barisan.length - i - 1; j++) {
                int compare = barisan[j].compareTo(barisan[j + 1]);
                if (compare < 0) {
                    cadang = (barisan[j]);
                    barisan[j] = barisan[j + 1];
                    barisan[j + 1] = cadang;
                    ganti = true;
                }
            }
            if (!ganti) {
                break;
            }
        }
    }
    static int cariBinerstring (String[] datanya,String kunci,int awal,int
            akhir){
        int tengah;
        int hasil;
        while (awal<=akhir){
            tengah=(awal+akhir)/2;
            hasil = kunci.compareToIgnoreCase(datanya[tengah]);
            if (hasil==0){
                return tengah;
            }
            if (hasil>0){
                akhir=tengah-1;
            }else {
                awal=tengah+1;
            }
        }
        return -1;
    }
    static void tampilkan_arr(String[] arr) {
        for (int i = 0; i < arr.length; ++i){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}