package week4;

public class Ex72 {
    public static void main(String[] args) {
        /*Account bartosAccount = new Account("Barto's account", 100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
         */
        Account mattAccount = new Account("Matt's account ", 1000);
        Account myAccount = new Account("My account", 0);

        System.out.println(mattAccount);
        System.out.println(myAccount);

        mattAccount.withdrawal(100.00);
        System.out.println(mattAccount);

        myAccount.deposit(100.0);
        System.out.println(myAccount);
    }
}
