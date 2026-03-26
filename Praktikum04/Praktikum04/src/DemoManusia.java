public class DemoManusia {
    public static void main(String[] args) {
        // Pakai constructor 1 (kosong), lalu isi manual
        Manusia objMns1 = new Manusia();
        objMns1.setNama("Markonah");
        objMns1.setUmur(76);

        // Pakai constructor 2 (isi nama langsung)
        Manusia objMns2 = new Manusia("Mat Conan");
        // umur TIDAK diisi → default nilai int = 0

        // Pakai constructor 3 (isi nama + umur langsung)
        Manusia objMns3 = new Manusia("Bajuri", 13);

        // Simpan semua objek dalam array
        Manusia[] arrMns = {objMns1, objMns2, objMns3};

        for (int i = 0; i < 3; i++) {
            System.out.println("Nama : " + arrMns[i].getNama());
            System.out.println("Umur : " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}