public class ContohAccessModifier {
    public int angkaPublik = 10;      // siapa saja bisa akses
    private int angkaPrivat = 20;     // hanya kelas ini yang bisa akses
    protected int angkaProtected = 30; // kelas ini, subclass, dan satu paket
    int angkaDefault = 40;            // hanya satu paket
}
