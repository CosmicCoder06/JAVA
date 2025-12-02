public class Person {
    
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (true) {
            this.name = "Unknown";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
