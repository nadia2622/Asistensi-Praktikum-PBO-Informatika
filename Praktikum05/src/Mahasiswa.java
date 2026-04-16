public class Mahasiswa {
    private String NIM, Nama;
    public Mahasiswa(String no, String nm) {
        this.NIM = no;
        this.Nama = nm;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
}
