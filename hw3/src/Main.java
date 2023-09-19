
public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Dog bobik = new Dog("Bobik");
        Cat felix = new Cat("Felix");
        Dog partos = new Dog("Partos");
        Cat katrusja = new Cat("Katrusja");

        barsik.run(150);
        felix.run(205);
        katrusja.run(-5);
        katrusja.swim(5);
        bobik.run(300);
        partos.run(600);
        bobik.run(0);
        partos.swim(9);
        bobik.swim(11);
        partos.swim(-10);

        System.out.println("\nNumber of cats: " + Cat.numberOfCats);
        System.out.println("Number of dogs: " + Dog.numberOfDogs);
        System.out.println("Total number of animals: " + Animal.numberOfAnimals);
    }

}
