public class LimitException extends Exception {
   private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
