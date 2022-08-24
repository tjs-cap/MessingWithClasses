public class Cat extends Pet{
    private String breed;

    public Cat(String breed) {
        this.breed = breed;
    }

    public Cat(String owner, String colour, int age, String name, String breed) {
        super(owner, colour, age, name);
        this.breed = breed;
    }

    public void play(){
        System.out.println("Pushes things off surfaces");
    }

    // Getter for the breed attribute. Allows the system to use <obj>.getBreed() to view the breed attribute
    public String getBreed() {
        return breed;
    }

    // Setter for the breed attribute. Allows the system to use <obj>.setBreed() to make changes to this attribute.
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void sleep(){
        System.out.println("Touch me and die!");
    }

    @Override
    public void eat() {
        System.out.println("Nom nom nom!");
    }
}
