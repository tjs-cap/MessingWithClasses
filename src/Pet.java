public abstract class Pet {
    private String owner;
    private String colour;
    private int age;
    private String name;

    // Default constructor, but not required as this is an abstract class.
    public Pet (){
        owner = "none";
        colour = "white or black";
        age = 0;
        name = "no name";
    }

    // Constructor
    public Pet(String owner, String colour, int age, String name) {
        this.owner = owner;
        this.colour = colour;
        this.age = age;
        this.name = name;
    }

    // Selection of getters and setters for the attributes within this class.
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // This is a weird one, this is an abstract method.
    // We use abstract methods to ensure that the child classes include this method in their creation
    // without implementing it in the superclass.
    // This ensures that all child-classes must have this method included when the child-class is being
    // constructed.  You may notice that there are no braces included in this method, this is the correct
    // way to create an abstract method.
    public abstract void eat();

    public void sleep(){
        System.out.println("zzzz!");
    }
}
