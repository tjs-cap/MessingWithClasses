public class Cat extends Pet{
    String breed;

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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void sleep(){
        System.out.println("Touch me and die!");
    }
}
