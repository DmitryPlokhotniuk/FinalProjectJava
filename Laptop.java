public class Laptop {
    private String name;
    private int totalRAM;
    private int totalHDD;
    private String operSys;
    private int price;

   
    public Laptop(String name, int totalRAM, int totalHDD, String operSys, int price) {
        this.name = name;
        this.totalRAM = totalRAM;
        this.totalHDD = totalHDD;
        this.operSys = operSys;
        this.price = price;
    }

    // public void addLaptop (String name, int totalRAM, int totalHDD, String operSys, String color, int price) {
    //     this.name = name;
    //     this.totalRAM = totalRAM;
    //     this.totalHDD = totalHDD;
    //     this.operSys = operSys;
    //     this.color = color;
    //     this.price = price;
    // }

    @Override
    public String toString() {
        return "name: " + name + ", RAM: " + totalRAM + ", Hard: " + totalHDD + ", System: " + operSys + ", price: " + price;
    }

    public int getRam(){
        return this.totalRAM;
    }

    


}
