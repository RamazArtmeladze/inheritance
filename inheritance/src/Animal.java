public  class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String speak () {
        return ("I am an animal");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
