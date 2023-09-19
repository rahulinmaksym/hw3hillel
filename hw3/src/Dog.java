
public class Dog extends Animal {

    static int numberOfDogs = 0;
    {
        numberOfDogs++;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if(length > 500) {
            System.out.println("That's too much for " + super.getName() + ", it's a dog!");
        }
        else if(length <= 0) {
            System.out.println("Invalid number!");
        }
        else {
            System.out.println(super.getName() + " has ran " + length + " meters!");
        }
    }

    @Override
    public void swim(int length) {
        if(length > 10) {
            System.out.println("That's too much for " + super.getName() + ", it's a dog!");
        }
        else if(length <= 0) {
            System.out.println("Invalid number!");
        }
        else {
            System.out.println(super.getName() + " has swam " + length + " meters!");
        }
    }

}
