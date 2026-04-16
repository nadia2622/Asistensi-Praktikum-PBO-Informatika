class Employee {
    private String name;  // private! tidak bisa diakses langsung dari child
    String departemen;  // default access, bisa diakses dari child

    public Employee(String s) {  // konstruktor dengan 1 parameter
        name = s;
    }

    public void tampilNama() {
        System.out.println("nama : " + name);
    }
}