package paymentSchedule;

public class PaymentScheduleMain {

    public static void main(String[] args) {
        final double principal = Console.readInput("Principal", 1000, 1_000_000);
        final double annualInterest = Console.readInput("annualInterest", 1, 12);
        final byte years = (byte) Console.readInput("years", 5, 30);

        MortageCalculator mortageCalculator = new MortageCalculator(principal, annualInterest, years);
        double mortage = mortageCalculator.mortage();
        MortageReport mortageReport = new MortageReport("Mortage", (mortage));

        double[] paymentSchedule = mortageCalculator.paymentSchedule();
        MortageReport anotherMortageReport = new MortageReport("Payment Schedule", paymentSchedule);

    }

}
