public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Trevor","Black",4,"Tiddles","Tabby");
        cat1.sleep();
        cat1.eat();
        System.out.println("Cat name is " + cat1.getName());
        Dog dog1 = new Dog();
        dog1.play();
        dog1.sleep();
        dog1.eat();
        System.out.println("Dog name is '" + dog1.getName() + "'!");
    }
}
