package day31_Constructors;

public class _04_CapitalOne {
    public static void main(String[] args) {

        _03_BankAccount account1 = new _03_BankAccount();
        account1.setInfo("Ahmet Ozkok",123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);

        account1.checkBalance();

        account1.deposit(900);

        account1.checkBalance();

        System.out.println("--------------------------------------");

        _03_BankAccount account2 = new _03_BankAccount();
        account2.setInfo("Aygun", 987456123);

        account2.deposit(10000);

        account2.checkBalance();




    }

}
