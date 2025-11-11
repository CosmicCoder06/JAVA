public class Main {
    public static void main(String[] args) {
        System.out.println(" Encapsulation ");
        Person p = new Person("Alice", 20);
        System.out.println(p);
        p.setAge(25);
        p.setName(""); 
        System.out.println("After updates: " + p);

        System.out.println();
        System.out.println(" Abstraction & Inheritance ");
        Vehicle car = new Car("Toyota", 4);
        Vehicle truck = new Truck("Volvo", 12.5);
        car.startEngine();
        truck.startEngine();

        
        car.honk();
        truck.honk();

        System.out.println();
        System.out.println(" Polymorphism ");

        
        Vehicle v1 = new Car("Honda", 2);
        Vehicle v2 = new Truck("Hero", 8.0);

        v1.startEngine(); 
        v2.startEngine();

        
    }
}
