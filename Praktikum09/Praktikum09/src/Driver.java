public class Driver {
    public static void main(String args[]) {
        Share s1 = new Share(4, 4);
        System.out.println(s1); // 4 4

        Share s2 = new Share(8, 2); // staticInt jadi 2 untuk SEMUA
        System.out.println(s1);    // 4 2  ← privateInt s1 tetap 4, tapi staticInt berubah!
        System.out.println(s2);    // 8 2

        Share s3 = new Share(6, 22); // staticInt jadi 22 untuk SEMUA
        System.out.println(s1);     // 4 22
        System.out.println(s2);     // 8 22
        System.out.println(s3);     // 6 22

        // Poin utama buat praktikan: staticInt itu milik kelasnya,
        // bukan milik object-nya. Jadi kalau satu object ubah nilainya,
        // semua object ikut berubah.

        // ini contoh static method
       for (int i = 0; i < 10; i++) {
           if (i % 2 == 0) {         
               CounterMachine.count(); 
           }
       }
       System.out.println(CounterMachine.counter);
    }
}