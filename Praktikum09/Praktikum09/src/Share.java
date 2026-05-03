public class Share {
    private int privateInt;
    private static int staticInt; // ← SATU nilai, dibagi semua object!

    public Share(int pr, int si) {
        privateInt = pr;
        staticInt = si; // ← tiap object baru akan MENIMPA nilai ini
    }

    public String toString() {
        return privateInt + " " + staticInt; // ← FIX: pakai spasi
    }
}