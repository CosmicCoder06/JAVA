public class Truck extends Vehicle {
    private double capacityTons;

    public Truck(String brand, double capacityTons) {
        super(brand);
        this.capacityTons = Math.max(0, capacityTons);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " truck engine best hain.");
    }

    public double getCapacityTons() {
        return capacityTons;
    }

    public void setCapacityTons(double capacityTons) {
        this.capacityTons = Math.max(0, capacityTons);
    }

    
}
