class DemoOver2 {
    public static void main(String[] args) {
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();

        // kirim 1 argumen → Java pilih VERSI 1
        d.IsiParam("Lagu 1");

        // kirim 2 argumen → Java pilih VERSI 2
        e.IsiParam("kepastian yang kutunggu", "GiGi");


        d.CetakKeLayar();
        e.CetakKeLayar();
    }
}