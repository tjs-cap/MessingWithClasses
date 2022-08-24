// Please note that the Dog class extends from the Pet class
// An error within this class will happen if you remove or comment out the eat method.
// This is required as it is an abstract method in the superclass.
public class Dog extends Pet{
    private String breed;

    // Default constructor
    public Dog() {
        this.breed = "Mongrel";
    }

    // Constructor
    public Dog(String owner, String colour, int age, String name, String breed) {
        // taken from the superclass
        super(owner, colour, age, name);
        // local to this class
        this.breed = breed;
    }


    public void play(){
        System.out.println("Fetch!");
    }

    // @Override => this is not necessary with newer versions of Java because it is implied.
    // It can still be used.
    // There are other areas of Java similar to this.
    public void eat() {
        System.out.println("Slurp! Burp!");
    }
}
