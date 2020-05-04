package paymentSchedule;

import java.text.NumberFormat;

public class Formatter {

    public static String getFormattedValue(double value) {
        return NumberFormat.getCurrencyInstance().format(value);
    }
}
