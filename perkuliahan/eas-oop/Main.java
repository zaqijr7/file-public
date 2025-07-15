public class Main {
  public static void main(String[] args) {
    BankAccount akunSaya = new BankAccount("123456", "Andi", 1000.0);

    akunSaya.displayBalance();    // Tampilkan saldo awal
    akunSaya.deposit(500);        // Tambah saldo
    akunSaya.withdraw(200);       // Tarik saldo
    akunSaya.withdraw(2000);      // Coba tarik melebihi saldo
  }
}
