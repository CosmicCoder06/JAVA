public class SimpleOOP {
    
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            setAge(age); 
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = "Unknown" ;}

        public int getAge() { return age; }
        public void setAge(int age) { this.age = Math.max(0, age); }

        @Override
        public String toString() { return name + " (" + age + ")"; }
    }

   
    static abstract class Vehicle {
        protected String brand;
        public Vehicle(String brand) { this.brand = brand; }
        public abstract void startEngine();
        public void honk() { System.out.println(brand + " says: Beep!"); }
    }

    
    static class Car extends Vehicle {
        public Car(String brand) { super(brand); }
        @Override
        public void startEngine() { System.out.println(brand + " car engine starts."); }

      
        public void startEngine(boolean warmUp) {
            if (warmUp) System.out.println(brand + " car warms up then starts.");
            else startEngine();
        }
    }

    public static void main(String[] args) {
        System.out.println("-- Encapsulation --");
        Person p = new Person("Alice", 20);
        System.out.println(p);
        p.setName(""); 
        p.setAge(5);    
        System.out.println("After updates: " + p);

        System.out.println();
        System.out.println("-- Abstraction & Inheritance --");
        Vehicle v = new Car("Toyota"); 
        v.startEngine(); 
        v.honk();

        System.out.println();
        System.out.println("-- Polymorphism --");
        Vehicle v2 = new Car("Honda");
        v2.startEngine(); 
    }
}
