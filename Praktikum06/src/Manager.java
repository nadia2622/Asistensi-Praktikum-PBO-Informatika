class Manager extends Employee {
    private String alamat;

    public Manager(String nama, String s) {
        super(nama);  // kirim isi 'nama' ke konstruktor Employee
        // WAJIB di baris pertama!
        alamat = s;
    }

    public void tampilAlamat() {
        super.departemen = "Personalia";  // [2] akses atribut parent
        super.tampilNama();  // [3] panggil method parent
        System.out.println("alamat : " + alamat);
        System.out.println("departemen : " + super.departemen);
    }

    public static void main(String[] args) {
        Manager adi = new Manager("adi", "sukabirus");
        adi.tampilAlamat();
    }
}