public class Sekolah {
    static int jumlahSiswa = 0; // milik kelas Sekolah
    String namaSiswa;

    public Sekolah(String nama) {
        this.namaSiswa = nama;
        jumlahSiswa++; // setiap kali objek dibuat, counter naik
    }

    public static void main(String[] args) {
        Sekolah s1 = new Sekolah("Budi");
        Sekolah s2 = new Sekolah("Andi");
        Sekolah s3 = new Sekolah("Rudi");

        System.out.println("Total siswa: " + Sekolah.jumlahSiswa);
        System.out.println("Nama siswa: " + s1.namaSiswa);
    }
}
