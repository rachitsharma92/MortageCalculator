package paymentSchedule;

import java.util.Scanner;

public class Console {
    public static double readInput(String prompt, int min, int max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true) {
            System.out.println(prompt + " : ");
            value = scanner.nextDouble();
            if (value >=min && value<=max)
                break;
            System.out.println("Kindly enter a value between "+ min +"and "+ max);
        }
        return value;
    }
}
