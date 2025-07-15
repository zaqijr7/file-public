public class Animal {
  // Atribut
  private String name;

  // Konstruktor
  public Animal(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  // Method untuk menampilkan suara
  public void makeSound() {
      System.out.println("This animal makes a sound");
  }
}
