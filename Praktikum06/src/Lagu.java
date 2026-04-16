class Lagu {
    String pencipta;
    String judul;

    // === VERSI 1: hanya 1 parameter ===
    void IsiParam(String param1) {
        judul = param1;
        pencipta = "Tidak dikenal";  // pencipta diisi otomatis
    }

    // === VERSI 2: 2 parameter (nama sama, tapi param beda!) ===
    void IsiParam(String param1, String param2) {
        judul = param1;
        pencipta = param2;  // pencipta diisi dari parameter
    }

    void CetakKeLayar() {
        System.out.println("Judul: "+judul+", pencipta: "+pencipta);
    }
}