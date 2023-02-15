public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car("Toyota", "Aygo", 2016, "blauw", 1.2);
        Car auto2 = new Car("Fiat", "500", 2019, "groen", 1.4);
        Car auto3 = new Car("Volvo", "CX90", 2022, "zwart", 2.0);
        auto1.stringSystemWant();
        auto2.stringSystemWant();
        auto3.stringSystemWant();
    }
}
