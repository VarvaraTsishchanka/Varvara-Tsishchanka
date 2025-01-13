package lesson4;

public class ParkMain {
    public static void main(String[] args) {
        Park park = new Park();
        Park.Attractions attraction1 = new Park.Attractions("Карусель", "10:00 - 18:00", 10.99);
        Park.Attractions attraction2 = new Park.Attractions("Американские горки", "14:00 - 22:00", 20.99);
        System.out.print(attraction1.getName());
        System.out.print(", ");
        System.out.print(attraction1.getTime());
        System.out.print(", ");
        System.out.println(attraction1.getCost());
        System.out.print(attraction2.getName());
        System.out.print(", ");
        System.out.print(attraction2.getTime());
        System.out.print(", ");
        System.out.println(attraction2.getCost());
    }
}
