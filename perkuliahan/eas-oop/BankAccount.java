public class BankAccount {

  // Atribut
  private String accountNumber;
  private String accountHolderName;
  private double balance;

  // Konstruktor
  public BankAccount(String accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
  } 

  // Method deposit untuk menambahkan saldo
  public void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
      System.out.println("Deposit berhasil. Saldo saat ini: " + balance);
    } else {
      System.out.println("Jumlah deposit harus lebih dari 0.");
    }
  }

  // Method withdraw untuk menarik saldo jika cukup
  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Saldo tidak cukup untuk penarikan.");
    } else if (amount <= 0) {
      System.out.println("Jumlah penarikan harus lebih dari 0.");
    } else {
      this.balance -= amount;
      System.out.println("Penarikan berhasil. Saldo saat ini: " + balance);
    }
  }

  // Method untuk menampilkan saldo
  public void displayBalance() {
    System.out.println("Saldo saat ini: " + balance);
  }
}



