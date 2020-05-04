package paymentSchedule;

public class MortageCalculator {
    private double principal;
    private double annualInterest;
    private byte years;

    public MortageCalculator(double principal, double annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double mortage(){
        double monthlyInterest = getMonthlyInterest();
        double mortage = principal * (monthlyInterest * Math.pow(1+monthlyInterest,years)
                / (Math.pow(1+monthlyInterest,years) -1));
        return mortage;
    }

    public double [] paymentSchedule() {
        double monthlyInterest = getMonthlyInterest();
        int numberOfPayments = years* constants.NUMBER_OF_MONTHS;
        double balance[] = new double[numberOfPayments];
        for (int i = numberOfPayments; i > 0; i--){
            double payment = principal * (Math.pow(1 + monthlyInterest, numberOfPayments)
                    - Math.pow(1 + monthlyInterest, i - 1)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
            balance[numberOfPayments-i] = principal - payment;
        }

        return balance;
    }

    private double getMonthlyInterest() {
        return annualInterest / constants.NUMBER_OF_MONTHS / constants.PERCENT;
    }
}
