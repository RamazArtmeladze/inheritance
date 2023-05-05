public class Cat extends Animal{
    private String color;
    public String getColor() {
        return color;
    }
    public Cat (String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    @Override
    public String speak() {
        return("Meow! Meow!");
    }
}
