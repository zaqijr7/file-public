public class Main {
  public static void main(String[] args) {
    Animal[] animals = {
      new Dog("Buddy"),
      new Cat("Misty"),
      new Dog("Rocky"),
      new Cat("Luna")
    };

    for (Animal a : animals) {
      System.out.print(a.getName() + " says: ");
      a.makeSound();
    }
  }
}
