public class Main {
    public static void main(String[] args) {

        // membuat objek SalariedEmployee
        SalariedEmployee emp1 = new SalariedEmployee("John", "Doe", "123-45-6789", 1500.0);

        // menampilkan data emp1
        System.out.println(emp1);
        System.out.printf("earnings: $%,.2f\n", emp1.earnings());
    }
}