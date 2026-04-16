public class ContohFinal {
    final double PI = 3.14159; // konstanta, nilainya tidak bisa diubah

    public static void main(String[] args) {
        ContohFinal obj = new ContohFinal();
        // obj.PI = 3.0; // ERROR! PI tidak bisa diubah
        System.out.println("Nilai PI: " + obj.PI); // ✅ Output: 3.14159
    }
}