public class Komputer {
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;

    // KOMPOSISI: semua part dibuat DI DALAM constructor dengan new
    public Komputer(String merkCPU, int workerCPU,
                    String merkMonitor,
                    String merkMouse, String typeMouse) {
        this.cpu = new CPU(merkCPU, workerCPU);
        this.monitor = new Monitor(merkMonitor);
        this.mouse = new Mouse(merkMouse, typeMouse);
    }

    public void DisplaySpec() {
        System.out.println("=== Spesifikasi Komputer ===");
        System.out.print("CPU     : ");
        this.cpu.DisplaySpecCPU();
        System.out.print("Monitor : ");
        this.monitor.DisplaySpecMonitor();
        System.out.print("Mouse   : ");
        this.mouse.DisplaySpecMouse();
    }

    public static void main(String[] args) {
        Komputer k = new Komputer("Intel i7", 3600,
                "Samsung",
                "Logitech", "Wireless");
        k.DisplaySpec();
    }
}