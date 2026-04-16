public class Buku {
    private String pengarang;
    private String judul;

    private Buku() {
        this("Rumah Kita", "GoodBles");   // this ini digunakan untuk
                                                        // memanggil konstruktor yang
                                                        // menerima dua parameter
    }

    private Buku(String judul,String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    private void cetakKeLayar() {
        System.out.println("Judul : " + judul + " Pengarang : " + pengarang);
    }

    public static void main(String[] args){
        Buku a,b;
        a = new Buku("Jurassic Park", "Michael Chricton");
        b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}

/* Lha trus buat apa sih Constructor Memanggil Constructor?
* Tujuannya biasanya:
    -menghindari penulisan kode berulang
    -memberi nilai default

Dalam contoh ini, jika kita membuat buku tanpa memberikan data, program akan otomatis memberi nilai default.
* */

/*
Kenapa Constructor Dibuat private?
Di contoh ini:
private Buku()
private Buku(String judul,String pengarang)

Artinya constructor hanya bisa dipanggil di dalam class itu sendiri.
Jadi objek Buku tidak bisa dibuat dari class lain.

Ini biasanya digunakan untuk:

-membatasi pembuatan objek
-membuat desain program tertentu
 */