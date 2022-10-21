/*
TUGAS PERTEMUAN KE-03
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM     : 2113020201
Nama    : Shalaisha Amelia Putri Gemini
Kelas   : 2A
 */

import java.io.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CRUD {
    public static void main(String[] args) throws IOException {

        Scanner terminalinput = new Scanner(System.in);
        String pilihanUser;
        boolean lanjut = true;


        while(lanjut) {
            System.out.println("1.\tCari");
            System.out.println("2.\tBaca");
            System.out.println("3.\tTambah");
            System.out.println("4.\tHapus");
            System.out.println("5.\tUpdate");
            System.out.println("6.\tExit");

            System.out.print("\nMasukan pilihan anda : ");
            pilihanUser = terminalinput.next();


            switch (pilihanUser) {
                case "1":
                    System.out.println("\n");
//                    System.out.println("anda memilih 1");
                    System.out.println("===============================");
                    System.out.println("= Mencari Data Barang di Toko =");
                    System.out.println("===============================");
                    System.out.println("\n");

                    cariData();
                    break;
                case "2":
                    System.out.println("\n");
//                    System.out.println("anda memilih 2");
                    System.out.println("============================");
                    System.out.println("= List Data Barang di Toko =");
                    System.out.println("============================");
                    System.out.println("\n");

                    tampilkandata();
                    break;
                case "3":
                    System.out.println("\n");
//                    System.out.println("anda memilih 3");
                    System.out.println("=========================");
                    System.out.println("= Tambah Barang di Toko =");
                    System.out.println("=========================");
                    System.out.println("\n");

                    tambahData();
                    break;
                case "4":
                    System.out.println("\n");
//                    System.out.println("anda memilih 4");
                    System.out.println("=============================");
                    System.out.println("= Hapus Data Barang di Toko =");
                    System.out.println("=============================");
                    System.out.println("\n");

                    hapusData();
                    break;
                case "5":
                    System.out.println("\n");
//                    System.out.println("anda memilih 5");
                    System.out.println("==============================");
                    System.out.println("= Update Data Barang di Toko =");
                    System.out.println("==============================");
                    System.out.println("\n");
                    updateData();

                    break;
                case "6":
                    System.out.println("\n");
                    System.out.println("=========================");
                    System.out.println("= Program Telah Berhenti =");
                    System.out.println("=========================");
                    System.out.println("\n");

                    break;
                default:
                    System.err.println("\nInputan yang anda masukan salah...");
                    break;
            }
            if(pilihanUser.equalsIgnoreCase("6")){
                lanjut = false;
            }else {
                lanjut = getYesorNo("Apakah anda ingin memilih lagi?");
            }
        }

    }

    private static boolean getYesorNo(String message){
        System.out.print("\n" + message + " (y/n)");
        Scanner terminalinput = new Scanner(System.in);
        String pilihanUser = terminalinput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Input yang anda masukan salah...");
            System.out.print("\n" + message + " (y/n)");
            pilihanUser = terminalinput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void tampilkandata()throws IOException{
        FileReader fileinput;
        BufferedReader bufferinput;

        try{
            fileinput = new FileReader("Database.txt");
            bufferinput = new BufferedReader(fileinput);
        }catch(Exception e){
            System.out.println("Database tidak ditemukan...");
            return;
        }

        String data = bufferinput.readLine();
//        System.out.println(data);
        System.out.println("\n| No |\tCode Barang  |\tNama Barang       |\tSpesifikasi Barang     | Harga Barang    ");
        System.out.println("===========================================================================");
        int nomer =0;
        while(data != null) {

            nomer++;
            StringTokenizer stringtoken = new StringTokenizer(data, ",");
            System.out.printf("| %2d ", nomer);
            System.out.printf("|\t%4s  ", stringtoken.nextToken());
            System.out.printf("|\t%-20s ", stringtoken.nextToken());
            System.out.printf("|\t%-20s ", stringtoken.nextToken());
            System.out.printf("|\t%s ", stringtoken.nextToken());
            System.out.print("\n");

            data = bufferinput.readLine();
        }
        System.out.println("=======================================================================================");
    }

    private static void cariData()throws IOException{
//        baca databse ada atau tidak
        try{
            File file = new File("database.txt");
        }catch (Exception e){
            System.out.println("Database tidak ditemukan...");
            return;
        }

//        ambil keywoard dari User
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan 4 digit terakhir code barang : ");
        String cariString = terminalInput.nextLine();

//        .split dan diisi whiteSpace maka akan jadi array

//        System.out.println(cariString.split("\\s+"));
        String[] keywords = cariString.split("\\s+");


        cariDiDatabase(keywords, true);
    }


    //    void tipe data kosong makanya harus pakai boolean
    private static boolean cariDiDatabase(String[] keywords, boolean isDisplay)throws IOException{
        FileReader fileInput = new FileReader("Database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine();
//        membuat boolean untuk mencari yang didatabse ada atau tidak
        boolean isExist = false;
        int nomerData = 0;

        if (isDisplay) {
            System.out.println("\n| No |\tCode Barang  |\tNama Barang       |\tSpesifikasi Barang     | Harga Barang    ");
            System.out.println("===========================================================================");
        };
        while(data != null){
//            cek keywords didalam baris
//            buat boolean true agar saat isExist di and akan nyambung
            isExist = true;

//            System.out.println(data);
//            System.out.println(Arrays.toString(keywords));

//            memnglooping array keywords dengan forEach
            for(String keyword:keywords){
//                jika tidak dikalikan maka false dan true akan menjadi true ...yang dibutuhkan adalah true dengan true
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());

            }
//            System.out.println(isExist);

//            cetak data yang true
            if (isExist){

                if(isDisplay){
//                    System.out.println(data);


                    StringTokenizer token = new StringTokenizer(data, ",");
                    System.out.printf("|\t%4s  ", token.nextToken());
                    System.out.printf("| %-20s ",token.nextToken());
                    System.out.printf("| %-10s  ",token.nextToken());
                    System.out.printf("| %s ",token.nextToken(),"\n");
                    System.out.print("\n");
                }else {
                    break;
                }
            }
            data = bufferInput.readLine();
        }
        return isExist;
    }

    private static void tambahData()throws  IOException{
        FileWriter fileOutput = new FileWriter("Database.txt", true);
        BufferedWriter bufferoutput = new BufferedWriter(fileOutput);

        Scanner terminalinput = new Scanner(System.in);
        String code,nama,spesifikasi,harga;

        System.out.print("Masukan code (4 digit terakhir) : ");
        code = codedigit4();
        System.out.print("Masukan Nama Barang         : ");
        nama = terminalinput.nextLine();
        System.out.print("Masukan Spesifikasi Barang  : ");
        spesifikasi = terminalinput.nextLine();
        System.out.print("Masukan Harga Barang        : ");
        harga = terminalinput.nextLine();

        String[] keywords = {code+","+nama+","+spesifikasi+","+"harga"};

        boolean isExist = cariDiDatabase(keywords, false);

        System.out.println("Data Berhasil Dimasukan ");
        System.out.println("___________________________________");
        System.out.println("| Code Barang               : "+code);
        System.out.println("| Nama Barang               : "+nama);
        System.out.println("| Spesifikasi Barang        : "+spesifikasi);
        System.out.println("| Harga Barang              : "+harga);
        System.out.println("___________________________________");

        if(!isExist){

            bufferoutput.write(code+","+nama+","+spesifikasi+","+harga);
//            newline agar data sesudahnya bisa ditambahkan
            bufferoutput.newLine();
//            flush untuk menulis ke database
            bufferoutput.flush();

        }else{
            System.out.println("Data Barang sudah ada... ");
        }

        bufferoutput.close();
    }

    private static String codedigit4()throws IOException{
        boolean codevalid = false;
        System.out.print("Masukan 4 digit terakhir code ");
        Scanner terminalinput = new Scanner(System.in);
        String codebase = terminalinput.nextLine();

        while(!codevalid){
            try{
//               agar membuat input benar ketika 4 digit saja
                Year.parse(codebase);
                codevalid = true;
            }catch (Exception e){
                System.err.println("NPM yang anda masukan salah");
                System.out.print("\nMasukan 4 digit terakhir Code ");
                codevalid = false;
                codebase = terminalinput.nextLine();
            }
        }
        return codebase;
    }

    private static void hapusData()throws IOException{
//        database ori
        File database = new File("Database.txt");
        FileReader fileinput = new FileReader(database);
        BufferedReader bufferedinput = new BufferedReader(fileinput);

//        database sementara
        File DBsementara = new File("tempDB.txt");
        FileWriter fileoutput = new FileWriter(DBsementara);
        BufferedWriter bufferedoutput = new BufferedWriter(fileoutput);

//        tampilkan data
        tampilkandata();

//        delete user
        Scanner terminalinput = new Scanner(System.in);
        System.out.print("Masukan nomer yang ingin dihapus : ");
        int isdelete = terminalinput.nextInt();

//        looping mencari data

        String data = bufferedinput.readLine();
        boolean found = false;
        int numberr = 0;
        while(data != null){
            numberr++;
            boolean delet = false;
            if (isdelete == numberr){
//                System.out.println(data);
                System.out.println("\n");

                StringTokenizer st = new StringTokenizer(data,",");

                System.out.println("\nData yang ingin anda hapus adalah : ");
                System.out.println("-----------------------------------");
                System.out.println("Code Barang             : " + st.nextToken());
                System.out.println("Nama Barang             : " + st.nextToken());
                System.out.println("Spesifikasi Barang      : " + st.nextToken());
                System.out.println("Harga Barang            : " + st.nextToken());
                System.out.println("\n");


                delet = getYesorNo("Apakah anda yakin ingin menghapus?");
                found = true;
            }


            if (delet){
                System.out.println("\n");
                System.out.println("=========================");
                System.out.println("= Data berhasil dihapus =");
                System.out.println("=========================");
            }else{
                bufferedoutput.write(data);
                bufferedoutput.newLine();
            }
            data = bufferedinput.readLine();
        }

        if(!found){
            System.err.println("Data tidak ada... ");
        }

//         menulis ke file sementara
        bufferedoutput.flush();


        bufferedoutput.close();
        fileinput.close();
        bufferedinput.close();
        fileinput.close();

//        kurang tau method ini
        System.gc();


//        hapus databse ori dan rename tempDB jadi databse

        database.delete();
        DBsementara.renameTo(database);

    }

    private static void updateData()throws IOException{
//        buat database original
        File database = new File("Database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

//        buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

//        tampilkan data
        tampilkandata();

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan nomer code yang ingin diupdate : ");
        int num = terminalInput.nextInt();

        String data = bufferedInput.readLine();
        int countNum = 0;

        while(data != null){
            countNum++;
            if (countNum == num){
                System.out.println("\n");

                StringTokenizer st = new StringTokenizer(data,",");

                System.out.println("\nData yang ingin anda Update adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Code Barang             : " + st.nextToken());
                System.out.println("Nama Barang             : " + st.nextToken());
                System.out.println("Spesifikasi Barang      : " + st.nextToken());
                System.out.println("Harga Barang            : " + st.nextToken());
                System.out.println("\n");

                String[] fieldData = {"Code Barang","Nama Barang","Type Barang","Harga Barang"};
                String[] tempdata = new String[4];

//               refresh token(kurang paham)
                st = new StringTokenizer(data,",");

                for(int i = 0; i < fieldData.length; i++) {
                    boolean hehe = getYesorNo("\nApakah anda ingin mengUpdate " + fieldData[i]);
                    String dataOri = st.nextToken();
                    if(hehe){

                        if (fieldData[i].equalsIgnoreCase("code")){
                            tempdata[0] = codedigit4();
                        }else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("Masukan " + fieldData[i] + " baru ");
                            tempdata[i] = terminalInput.nextLine();
                        }
                    }else{
                        tempdata[i] = dataOri;
                    }
                }

//                tampilkan data baru

                st = new StringTokenizer(data,",");

                System.out.println("\nData anda telah di Update");
                System.out.println("-----------------------------------");
                System.out.println("Code Barang             : " + st.nextToken() +" ===> "+tempdata[0]);
                System.out.println("Nama Barang             : " + st.nextToken() +" ===> "+tempdata[1]);
                System.out.println("Spesifikasi Barang      : " + st.nextToken() +" ===> "+tempdata[2]);
                System.out.println("Harga Barang            : " + st.nextToken() +" ===> "+tempdata[3]);

                boolean isUpdate = getYesorNo("Apakah anda yakin untuk mengUpdate");

                if(isUpdate){

                    boolean isExist = cariDiDatabase(tempdata,false);

                    if (isExist){
                        System.err.println("Data sudah ada didalam Database");
                        bufferedOutput.write(data);
                    }else{
//                        rubah ke format database
                        String code = tempdata[0];
                        String nama = tempdata[1];
                        String spesifikasi = tempdata[2];
                        String harga = tempdata[3];


                        bufferedOutput.write(code+","+nama+","+spesifikasi+","+harga);
//                      newline agar data sesudahnya bisa ditambahkan
                    }
                }else{
                    bufferedOutput.write(data);
                }
            }else{
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();
            data = bufferedInput.readLine();
        }
//        menambah data ke file
        bufferedOutput.flush();

        bufferedInput.close();
        fileInput.close();
        fileOutput.close();
        bufferedOutput.close();

        System.gc();


//        mendelete database original
        database.delete();
//        merubah tempDB jadi database utama
        tempDB.renameTo(database);
    }
}