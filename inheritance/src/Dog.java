public class Dog extends Animal{
    private String breed;
    public String getBreed() {
        return breed;
    }
    public Dog (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    public String speak() {
        return ("Woof! Woof!");
    }
}
