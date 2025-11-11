
public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    
    public abstract void startEngine();
    public void honk() {
        System.out.println(brand + " honks: Beep!");
    }

    @Override
    public String toString() {
        return "Vehicle{brand='" + brand + "'}";
    }
}
