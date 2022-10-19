public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true){
            try {
                bankAccount.withDraw(Integer.parseInt("6000"));
            }
            catch (LimitException limitException){
                try {
                    bankAccount.withDraw((int) limitException.getRemainingAmount());
                } catch (LimitException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
}