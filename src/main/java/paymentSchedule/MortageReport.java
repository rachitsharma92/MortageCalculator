package paymentSchedule;

public class MortageReport {
    private String header;
    private double value;
    private double[] values;


    public MortageReport(String header, double value) {
        this.header = header;
        this.value = value;
        displayReport();
    }

    public MortageReport(String header, double[] values) {
        this.header = header;
        this.values = values;
        displayAnotherReport();
    }


    private void displayReport() {
        getHeader();
        System.out.println(Formatter.getFormattedValue(value));
    }

    private void displayAnotherReport(){
        getHeader();
        for (int i = 0; i < values.length; i++) {
            System.out.println(Formatter.getFormattedValue(values[i]));
        }
    }

    private void getHeader() {
        System.out.println(this.header);
        System.out.println("-----------");
    }
}
