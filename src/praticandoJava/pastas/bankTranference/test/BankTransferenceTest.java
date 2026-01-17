package praticandoJava.pastas.bankTranference.test;

import praticandoJava.pastas.bankTranference.domain.User;

public class BankTransferenceTest {
    public static void main(String[] args) {
        User user1 = new User("Adrian", "Goulart", 18, 3150);
        User user2 = new User("Kauã", "Senna", 18, 4620);

        user1.deposit();
        user2.withdraw();
    }
}
