package OOP;

import org.testng.annotations.Test;

public class DynamicPolymorphism_OOP {
    class Animal {
        public void eat() {
            System.out.println("This animal eats insects.");
        }
    }

    class Bird extends Animal {

        public void eat() {
            System.out.println("This bird eats seeds.");
        }

    }
        @Test
        public void TestAnimal() {
            Animal myAnimal = new Animal();
            myAnimal.eat();

            Bird myBird = new Bird();
            myBird.eat();

    }
}
