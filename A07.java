public class A07 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double diameter, tinggi, beli, height, sisa;
        double minyak = 0.001, senti = 2.54;

        System.out.print("Masukan diameter tabung = ");
        diameter = input.nextInt();

        System.out.print("Masukan tinggi tabung = ");
        tinggi = input.nextInt();

        System.out.print("Harga per liter = ");
        beli = input.nextInt();

        double jari=diameter/2;
        double tabung = 3.14*jari*jari*tinggi;//dalam inch
        double converincm = tabung*senti;//converter dari inch kubik ke senti kubik
        double converliter = converincm*minyak;//comverter dari cm kubik ke liter
        double fulltank = converliter/beli;//harga full tank

        System.out.println("Jadi harga jika beli full adalah = " + fulltank);

        System.out.print("Masukan ketinggian beli = ");
        height = input.nextInt();

        double tabungbeli = 3.14*jari*jari*height;
        double converliter2 = tabungbeli*minyak;
        double halftank = converliter2/beli;

        System.out.print("Masukan sisa = ");
        sisa = input.nextInt();

        double tabungsisa = 3.14*jari*jari*sisa;
        double converliter3 = tabungsisa*minyak;
        double sitik = converliter3/beli;
        System.out.println(halftank);
        System.out.println(sitik);

        double hargaakhir = halftank-sitik;
        double dilaba = hargaakhir+(hargaakhir*5/100);
        double laba = dilaba-hargaakhir;

        System.out.println("Pendapatan yang diperoleh adalah = "+dilaba);
        System.out.println("Laba yang didapat adalah = "+laba);
    }
}