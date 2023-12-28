import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("HP", 16, 512, "Windows 10", 20000));
        laptops.add(new Laptop("Dell", 16, 256, "Linux", 25000));
        laptops.add(new Laptop("Lenovo", 8, 256, "Windows 10", 18000));
        laptops.add(new Laptop("MSI", 16, 1024, "Windows 11", 28000));
        laptops.add(new Laptop("HP", 32, 1024, "Windows 11", 32000));

        filterForLaptop(laptops);
    }

    static void printSet(Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

   
    static void filterForLaptop(Set<Laptop> laptops) {
        Map<String, String> criteria = new HashMap<>();
        // criteria.put("1", "name");
        // criteria.put("2", "RAM");
        // criteria.put("3", "HDD");
        // criteria.put("4", "OS");
        // criteria.put("5", "price");

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Выберите нужное действие, введите нужную цифру:");
            System.out.println("1 - Указать производителя");
            System.out.println("2 - Указать минимальный обем RAM");
            System.out.println("3 - Указать минимальный объем HDD");
            System.out.println("4 - Указать OS");
            System.out.println("5 - Указать минимальную цену");
            System.out.println("6 - Поиск");
            System.out.println("7 - Выход");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    System.out.println("Напишите производителя: ");
                    String userInput1 = scanner.nextLine();
                    criteria.put("1", userInput1);
                    break;
                case "2":
                    System.out.println("Укажите минимальный объем RAM: ");
                    String userInput2 = scanner.nextLine();
                    criteria.put("2", userInput2);
                    break;
                case "3":
                    System.out.println("Укажите минимальный объем HDD: ");
                    String userInput3 = scanner.nextLine();
                    criteria.put("3", userInput3);
                    break;
                case "4":
                    System.out.println("Укажите OS: ");
                    String userInput4 = scanner.nextLine();
                    criteria.put("4", userInput4);
                    break;
                case "5":
                    System.out.println("Укажите минимальную цену: ");
                    String userInput5 = scanner.nextLine();
                    criteria.put("5", userInput5);
                    break;
                case "6":
                    findByCriteries(laptops, criteria);
                    flag = false;
                    break;
                case "7":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
        System.out.println(criteria);

    }
    
    public static void findByCriteries(Set<Laptop> laptops, Map<String, String> criteria){
        Set<Laptop> result = new HashSet<>();
        // if (!criteria.isEmpty()){
        //     System.out.println("Вы не ввели ни одного критерия поиска!");
        //     printSet(laptops);
        // }else{
            for (Laptop laptop : laptops) {
                if (criteria.containsKey("2")){
                    if (laptop.getRam() >= Integer.parseInt(criteria.get("2"))){
                        result.add(laptop);
                    }
                }
            }
        // }
        printSet(result);
        
    }
}
