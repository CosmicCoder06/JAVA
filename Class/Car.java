public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

   
    @Override
    public void startEngine() {
        System.out.println(brand + " car engine starts (smoothly).");
    }
    
    public void startEngine(boolean warmUp) {
        if (warmUp) {
            System.out.println(brand + " car warming up then starting.");
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = Math.max(0, doors);
    }

    public void openTrunk() {
        System.out.println(brand + " trunk opened.");
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', doors=" + doors + "}";
    }
}
// leetcode ques no 168
