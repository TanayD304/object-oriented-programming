import java.util.*;

abstract class Animal {
    public String name;

    Animal(String name) {
        this.name = name;
    }

    abstract public void makeSound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("The dog " + name + " says : Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat " + name + " says : Meow!");
    }

}

class abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input names for dog and cat

        String dName = scanner.nextLine();
        String cName = scanner.nextLine();


        // Create Dog objects
        Animal dog = new Dog(dName);
        dog.makeSound();

        // Create Cat objects
        Animal cat = new Cat(cName);
        cat.makeSound();

    }
}