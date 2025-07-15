public class Dog extends Animal {
  public Dog(String name) {
    super(name);  // memanggil konstruktor Animal
  }

  @Override
  public void makeSound() {
    System.out.println("Woof");
  }
}
