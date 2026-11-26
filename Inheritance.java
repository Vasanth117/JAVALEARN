// Parent class (superclass)
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class (subclass) — single inheritance: only one parent (Animal)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno");

        dog.eat();  // inherited from Animal
        dog.bark(); // defined in Dog
    }
}