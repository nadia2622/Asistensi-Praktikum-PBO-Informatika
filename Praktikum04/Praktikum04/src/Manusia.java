public class Manusia {
    private String nama;
    private int umur;

    // Constructor 1: default, tanpa parameter
    // Dipakai kalau mau buat objek kosong dulu
    public Manusia() { }

    // Constructor 2: langsung isi nama saja
    public Manusia(String a) {
        nama = a;
    }

    // Constructor 3: langsung isi nama DAN umur
    public Manusia(String a, int b) {
        nama = a;
        umur = b;
    }

    // getter & setter
    public void setNama(String a) { nama = a; }
    public String getNama() { return nama; }
    public void setUmur(int a) { umur = a; }
    public int getUmur() { return umur; }
}