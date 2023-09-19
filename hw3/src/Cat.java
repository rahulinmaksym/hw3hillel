
public class Cat extends Animal {

    static int numberOfCats = 0;
    {
        numberOfCats++;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if(length > 200) {
            System.out.println("That's too much for " + super.getName() + ", it's a cat!");
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
        System.out.println("Cats don't swim!");
    }

}
