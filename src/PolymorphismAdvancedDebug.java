package src;

//Co trzeba zmienic dodać aby kot miauczał a pies szczekał ?
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class PolymorphismAdvancedDebug {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
