public class Dog extends Pet{
    private String breed;

    public Dog() {
        this.breed = "Mongrel";
    }

    public Dog(String owner, String colour, int age, String name, String breed) {
        super(owner, colour, age, name);
        this.breed = breed;
    }

    public void play(){
        System.out.println("Fetch!");
    }
}
