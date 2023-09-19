
public class Animal {

    static int numberOfAnimals = 0;
    {
        numberOfAnimals++;
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int length) {
        System.out.println(name + "'s ran " + length + " meters!");
    }

    public void swim(int length) {
        System.out.println(name + "'s swam " + length + " meters!");
    }

    public String getName() {
        return name;
    }

}
