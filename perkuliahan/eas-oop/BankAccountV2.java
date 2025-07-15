public class BankAccountV2 {
    // Atribut dienkapsulasi dengan access specifier 'private'
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Konstruktor untuk inisialisasi
    public BankAccountV2(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter dan Setter untuk accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter dan Setter untuk accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter dan Setter untuk balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method untuk menambah saldo
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil. Saldo saat ini: " + balance);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    // Method untuk menarik saldo
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Saldo tidak cukup untuk penarikan.");
        } else if (amount <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0.");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + balance);
        }
    }

    // Method untuk menampilkan saldo
    public void displayBalance() {
        System.out.println("Saldo saat ini: " + balance);
    }
}
