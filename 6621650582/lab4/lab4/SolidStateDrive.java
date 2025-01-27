

public class SolidStateDrive {
    String brand;
    String capacity;
    String interfaceType;
    int DRAM;
    String model;

    public SolidStateDrive(){

    }

    public void setInformation(String brand, String capacity, String interfaceType, int dram, String model) {
        this.brand = brand;
        this.capacity = capacity;
        this.model = model;
        this.DRAM = dram;
        this.interfaceType = interfaceType;

    }

    public static void main(String[] args) {
        SolidStateDrive ss01 = new SolidStateDrive();
        ss01.setInformation("Samsung ", "1 TB", "PCIe 4x8", 1024, "Samsung 980 PRO");
        System.out.println("SSD Brand" + ss01.brand);
    }


}

