public class Main {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("192837465", 7000);
        myAccount.displayBalance();

        myAccount.Deposit(6000);
        myAccount.displayBalance();

        myAccount.Withdraw(1500);
        myAccount.displayBalance();
    }
}
class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount +" DH déposés avec succés. ");
        } else {
            System.out.println("Le montant doit étre positive ! ");
        }
    }

    public void Withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(amount +" DH retirés avec succés. ");
            } else {
                System.out.println("Solde insuffisant ! ");
            }
        } else {
            System.out.println("Le montant doit étre positive ! ");
        }
    }

    public void displayBalance() {
        System.out.println("Numero de compte : "+ accountNumber);
        System.out.println("Solde acteul : "+ balance +" DH");
        System.out.println("----------------------------");
    }
}