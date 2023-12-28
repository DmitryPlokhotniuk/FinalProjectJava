import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP", 16, 512, "Windows 10", 20000));
        laptops.add(new Laptop("Dell", 16, 256, "Linux", 25000));
        laptops.add(new Laptop("Lenovo", 8, 256, "Windows 10", 18000));
        laptops.add(new Laptop("MSI", 16, 1024, "Windows 11", 28000));
        laptops.add(new Laptop("HP", 32, 1024, "Windows 11", 32000));

        printSet(laptops);
    }

    static void printSet(Set<Laptop> laptops){
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    
}
