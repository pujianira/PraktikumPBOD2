/*Nama      : Pujiani Rahayu Agustin
  NIM       : 24060122130067
  Tanggal   : 9 Februari 2023
  File      : BankApp.java
  Deskripsi : Kelas main untuk menjalankan aplikasi
*/

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            account.deposit(100);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            // skenario bila saldo mencukupi
            account.withdraw(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            // skenario bila saldo tidak mencukupi
            account.withdraw(350.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}