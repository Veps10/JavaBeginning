public class Cat {
    String name;
    int age;

    static int count = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Cat() {
        count++;
        this.name = "Street cat number" + count;
    }

    public void SayMeow() {
        System.out.println("Meow!");

    }

    public static void main(String[] args) {
        Cat Meily = new Cat("Barsik", 12);
        System.out.println(Meily.name + "\n" + Meily.age);
        Meily.SayMeow();

        Cat streetCat1 = new Cat();
        Cat streetCat2 = new Cat();
        Cat streetCat3 = new Cat();
        System.out.println(Cat.count);

    }
}