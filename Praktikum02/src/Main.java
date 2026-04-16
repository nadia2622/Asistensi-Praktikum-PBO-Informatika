//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Manusia {
    private String nama;
    private int tinggi;

    void setInfo(String nama, int tinggi){
        this.nama = nama;
        this.tinggi = tinggi;
    }
    void info(){
        System.out.println(this.nama+ " Memiliki Tinggi " + this.tinggi +"cm");
    }
}

public class Main {
    public static void main(String[] args) {
        //Tipe data
        // tipedata namaVar = isi;
        byte a = 10;
        short b = 5;
        int c = 20;
        long f = 500;
        float v = 10.5f;
        double dou = 1000.3;
        char z = 'x';
        String k = "nama";

        //konstanta
        final int varKonstanta = 10;

        /* Variabel Array
        bentuk umum:
        * tipedata[] namaArray = new tipedata[jumlah elemen];
        **/
        /*Cara pendeklarasian variabel array :
        1) Mendeklarasikan variabel array tanpa menyebutkan berapa jumlah elemen yang diperlukan.
        */
        int[] variabelArray1;
        variabelArray1 = new int[5];
//
//        // 2) Mendeklarasikan variabel array dengan menyebutkan jumlah elemen yang diperlukan
//        int[] variabelArray2 = new int[5];
//
//        // 3) Mendeklarasikan variabel array secara otomatis
//        int[] variabelArray3 = {1, 2, 3, 4, 5};
//        // atau
//        int[] variabelArray4 = new int[]{1, 2, 3, 4, 5};
//
//
//        //Mengakses variabel array
//        //ngisi nilai ke dalam array
        variabelArray1[0] = 10;
        variabelArray1[1] = 15;
//
//        //langsung menyebutkan indeksnya
//        System.out.println("Elemen pertama dari variabelArray3: " + variabelArray3[0]);
//
//        //ditampung di variabel lain
        int hasil = variabelArray1[0] + variabelArray1[1];
//        variabelArray1[0] =

        System.out.println("hasil penjumlahan = " + hasil);

//        //penjumlahan elemen array
//        variabelArray3[3] = variabelArray3[0] + variabelArray3[1];
//        System.out.println("Hasil penjumlahan: " + variabelArray3[3]);
//
//        // Array Multidimensi
//        int[][] array2D = new int[3][4]; // Array 2D [baris][kolom]
//        int array2D2[][] = new int[3][4]; // Array 2D dengan deklarasi alternatif
//
//        double m[][];
//        m = new double[4][4];
//        m[0][0] = 1;
//        m[1][1] = 1;
//        m[2][2] = 1;
//        m[3][3] = 1;
//        System.out.println(m[0][0]+" "+m[0][1]+" "+m[0][2]+" "+m[0][3]);
//        System.out.println(m[1][0]+" "+m[1][1]+" "+m[1][2]+" "+m[1][3]);
//        System.out.println(m[2][0]+" "+m[2][1]+" "+m[2][2]+" "+m[2][3]);
//        System.out.println(m[3][0]+" "+m[3][1]+" "+m[3][2]+" "+m[3][3]);
//
//        int twoDim [][] = new int[2][];
//        twoDim[0] = new int[2];
//        twoDim[1] = new int[3];
//        twoDim[0][0] = 1 ;
//        twoDim[0][1] = 4 ;
//        twoDim[1][0] = 1 ;
//        twoDim[1][1] = 4 ;
//        twoDim[1][2] = 4 ;
//        System.out.println(twoDim[0][0]);
//        System.out.println(twoDim[0][1]);
//        System.out.println(twoDim[1][0]);
//        System.out.println(twoDim[1][1]);
//        System.out.println(twoDim[1][2]);

//        // Array bertipe objek
//        Manusia[] manusia = new Manusia[4];
//        for (int i = 0; i < manusia.length; i++) {
//            manusia[i] = new Manusia();
//        }
//        manusia[0].setInfo("Hermawan", 180);
//        manusia[1].setInfo("Suciati", 160);
//        manusia[2].setInfo("Boy", 170);
//        manusia[3].setInfo("Neneng", 165);
//
//        manusia[0].info();
//        manusia[1].info();
//        manusia[2].info();
//        manusia[3].info();

//        Manusia[] manusia2 = new Manusia[4];
//        for (int i = 0; i < manusia.length; i++) {
//            manusia[i] = new Manusia();
//        }
//        manusia2[0].setInfo("Hermawan", 180);
//        manusia2[1].setInfo("Suciati", 160);
//        manusia2[2].setInfo("Boy", 170);
//        manusia2[3].setInfo("Neneng", 165);
//
//        manusia2[0].info();
//        manusia2[1].info();
//        manusia2[2].info();
//        manusia2[3].info();
//
//        // Operator, Pernyataan Kondisional, dan Perulangan
//        // Artimatika
//        int jml = angka2 + angka1;
//        int krg = angka2 - angka1;
//        int kali = angka2 * angka1;
//        int bagi = angka2 / angka1;
//        int mod = angka2 % angka1;
//        System.out.println("Hasil penjumlahan = " + jml);
//        System.out.println("Hasil pengurangan = " + krg);
//        System.out.println("Hasil perkalian = " + kali);
//        System.out.println("Hasil pembagian = " + bagi);
//        System.out.println("Hasil modulus = " + mod);
//        //Penjumlahan
//        int jml = 10 + 5;
//
//        //Pengurangan
//        int krg = 10 - 5;
//
//        //Perkalian
//        int kl = 10 * 5;
//
//        //Pembagian
//        int bagi = 10 / 5;
//
//        //Modulus
//        int mod = 10 % 3;
//
//        // ++ (increment)
//        int inc = 10;
//        inc++; // inc = inc + 1
//
//        // -- (decrement)
//        int dec = 10;
//        dec--; // dec = dec - 1
//
//        // Relasional
//        int x = 10;
//        int y = 20;
//        boolean hasil;
//
//        //Lebih besar dari
//        hasil = x > y; // false
//
//        //Lebih kecil dari
//        hasil = x < y; // true
//
//        //Sama dengan
//        hasil = x == y; // false
//
//        //Tidak sama dengan
//        hasil = x != y; // true
//
//        //Kondisional
//        // && (AND)
//        boolean a1 = true;
//        boolean b1 = false;
//        boolean hasilAnd = a1 && b1; // false
//
//        // || (OR)
//        boolean hasilOr = a1 || b1; // true
//
//        // ! (NOT/negasi)
//        boolean hasilNot = !a1; // false
//
//        //Assignment
//        int nilai = 10;
//        nilai += 5; // nilai = nilai + 5; -> nilai sekarang 15
//        nilai -= 3; // nilai = nilai - 3; -> nilai sekarang 12
//        nilai *= 2; // nilai = nilai * 2; -> nilai sekarang 24
//        nilai /= 4; // nilai = nilai / 4; -> nilai sekarang 6
//        nilai %= 4; // nilai = nilai % 4; -> nilai sekarang 2
//
//        // Pernyataan Kondisional (if else)
        int angka = 5;
        if (angka == 10) {
            System.out.println("bilangannya bernilai " + angka);
        } else if (angka < 10) {
            System.out.println("bilangannya lebih kecil dari " + angka);
        }else {
            System.out.println("angka bukan 10");
        }

//        // Perulangan
//        // For loop
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Perulangan ke-" + i);
//        }
//
//        // While loop
//        int j = 0;
//        while (j < 5) {
//            System.out.println("Perulangan ke-" + j);
//            j++;
//        }
//
//        // Do-while loop
//        int k = 0;
//        do {
//            System.out.println("Perulangan ke-" + k);
//            k++;
//        } while (k < 5);
    }
}


//2.5 Compile, Run, dan Jar File