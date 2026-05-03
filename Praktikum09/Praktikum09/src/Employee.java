import java.util.*;                    // untuk List, ArrayList, Collections, Comparator
import java.util.stream.Collectors;    // untuk .collect(Collectors.toList())

public class Employee implements Comparable<Employee> {
    // "Kelas Employee yang bisa dibanding-bandingkan dengan Employee lain"
    // implements Comparable<Employee> = kelas ini berjanji akan punya
    // method compareTo(). Gunanya nanti untuk sorting.

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() { // utk ngubah obj jadi teks
        return "name=" + name + ", salary=" + salary;
    }

    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name); // sort by name A-Z
    }        //this = employee yg sedang "bicara"
                                //e = employee yang dibandingkan

    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        //ngisi list
        listEmp.add(new Employee("bobby", 3000));
        listEmp.add(new Employee("erick", 1600));
        listEmp.add(new Employee("rey", 2500));
        listEmp.add(new Employee("anna", 3500));

        // Sort by name (pakai Comparable)
        Collections.sort(listEmp); // manggil compareTo()
        System.out.println("=== Sorted by Name ===");
        listEmp.forEach(System.out::println);

        // Sort by salary (pakai Comparator)
        // ngambil dari bawah
        Collections.sort(listEmp, new SalaryComparator());
        System.out.println("=== Sorted by Salary ===");
        listEmp.forEach(System.out::println);

//================================================================================

        // Filter: gaji >= 3000 (konvensional. cek 1 1 secara manual)
        // apkh e
        System.out.println("=== Salary >= 3000 (konvensional) ===");
        for (Employee e : listEmp) { //"Ambil satu per satu isi dari listEmp,
            // simpan sementara di variabel e, lalu lakukan sesuatu."

            //Variabel e di sini adalah wadah sementara —
            // setiap putaran loop, e berganti isi mengikuti urutan list.
            if (e.getSalary() >= 3000) System.out.println(e);
        }

        // Filter: gaji >= 3000 (Filter lambda (Stream)) — PERHATIKAN stream() lowercase!
        System.out.println("=== Salary >= 3000 (lambda) ===");
        // jadi ini Dibaca dari atas ke bawah
        List<Employee> filtered = listEmp.stream() // → ubah list jadi "aliran data" yang bisa diproses
                .filter(e -> e.getSalary() >= 3000) // → saring! hanya loloskan yang gajinya >= 3000
                .collect(Collectors.toList()); // → tampung hasilnya ke dalam List baru
        filtered.forEach(System.out::println); // → cetak semua yang lolos

        // Cari satu Employee by name
        System.out.println("=== Cari 'erick' ===");
        System.out.println(listEmp.stream()
                .filter(e -> e.getName().equals("erick")) // → saring yang namanya persis "erick"
                .findFirst()
                //  → ambil yang PERTAMA ketemu saja (bukan semua)
                //  → hasilnya bukan Employee langsung, tapi "Optional<Employee>"
                //  → Optional = "mungkin ada, mungkin tidak"
                .orElse(null));
                // → "kalau ketemu, return Employee-nya"
                // → "kalau tidak ketemu, return null"
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary() - e2.getSalary(); // ascending salary
    }
}