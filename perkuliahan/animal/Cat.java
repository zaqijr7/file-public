public class Cat extends Animal {
  public Cat(String name) {
    super(name);  // memanggil konstruktor Animal
  }

  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}
