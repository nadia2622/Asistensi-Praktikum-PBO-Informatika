import java.util.*;

public class JavaApplication1 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(); 
        list.add(200); // index 0
        list.add("Hello"); // 1
        list.add(235); // 2
        list.add("Donny");

        // normal loop
        System.out.println("=====Normal loop=====");
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }

        // For-each loop
        for (Object o : list) { //"Untuk setiap item o yang ada di list, lakukan ini..."
            System.out.println(o);
        } // java ambil 1 1 dari awal - akhir. kita gausah urusin index

        // Iterator
        // Analoginya seperti pembaca buku dengan penanda halaman:
        Iterator<Object> itr = list.iterator();
        while (itr.hasNext()) { // .hasNext() -> "Masih ada halaman berikutnya?"
            Object o = itr.next(); // .next -> "balik ke halaman berikutnya, ambil isinya"
            System.out.println(o);
        }

        // Lambda Expression
        list.forEach(o -> System.out.println(o));
        // "Untuk setiap o di dalam list, lakukan System.out.println(o)"
        // Bagian o -> System.out.println(o) disebut lambda —
        // anggap saja ini "fungsi mini" tanpa nama yang langsung dieksekusi.

        // Method reference (versi ringkas cara Lambda)
        list.forEach(System.out::println);
    }
}