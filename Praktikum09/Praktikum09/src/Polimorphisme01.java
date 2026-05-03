class A {
    void MethodDiA() {
        System.out.println("A.MethodDiA()");
    }
}

class B extends A {
    void MethodDiB() {
        System.out.println("B.MethodDiB()");
    }
}

class Polymorphisme01 {
    public static void main(String[] args) {
        // Upcasting
       A ref = new B();
    //    ref.MethodDiB(); // compile error! A tidak kenal method ini

       // Downcasting cara 1
       B b = (B) ref; // "Hei Java, aku tau ref ini tipe A, tapi percaya deh, 
       // isi di dalamnya sebenarnya adalah object B. Tolong perlakukan dia sebagai B ya!"
       b.MethodDiB();

       // Downcasting cara 2
       ((B) ref).MethodDiB(); // diringkas jadi 1 baris

        // tapi jangan smpe gini yagesya
//        A a = new A(); // ← object yang dibuat BENAR-BENAR A, bukan B!
//        B b = (B) a;   // ← compile berhasil... tapi...
//        //    saat dijalankan → ClassCastException
    }

//    class Test {
//        public void main(String[] args) {
//            Test t = new Test();
//            t.lakukanSesuatu();
//        }
//        void lakukanSesuatu() {
//            A a = new A();
//            B b = (B) a;
//            b.MethodDiB();
//        }
//    }
}