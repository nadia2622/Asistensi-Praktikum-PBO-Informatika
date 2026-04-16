class B extends A { // B mewarisi semua milik A
    int z; // atribut TAMBAHAN milik B sendiri
    void jumlahXY() {
        // x dan y bisa dipakai walau bukan milik B!
        System.out.println("jumlah: " + (x+y+z));
    }
    public void tampilkanKeLayar() {
//        super.tampilkanKeLayar(); // Method milik superclas dipanggil
        System.out.println("Method milik class B dipanggil...");
    }
}