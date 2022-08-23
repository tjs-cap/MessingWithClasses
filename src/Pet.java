public abstract class Pet {
    private String owner;
    private String colour;
    private int age;
    private String name;

    public Pet (){
        owner = "none";
        colour = "white or black";
        age = 0;
        name = "no name";
    }

    public Pet(String owner, String colour, int age, String name) {
        this.owner = owner;
        this.colour = colour;
        this.age = age;
        this.name = name;
    }

    public void eat(){
        System.out.println("Nom Nom!");
    }

    public void sleep(){
        System.out.println("zzzz!");
    }
}
