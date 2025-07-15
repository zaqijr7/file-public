public class Main {
  public static void main(String[] args) {
    BankAccount akun = new BankAccount("123456", "Andi", 1000.0);

    akun.displayBalance();    // Tampilkan saldo awal
    akun.deposit(500);        // Tambah saldo
    akun.withdraw(200);       // Tarik saldo
    akun.withdraw(2000);      // Coba tarik melebihi saldo
  }
}
