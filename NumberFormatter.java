import java.util.*;
import java.text.*;

public class NumberFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a double precisin number: ");
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        String us="", india="", china="", france="";
        NumberFormat formatterUs  = NumberFormat.getCurrencyInstance(); 
        us = formatterUs.format(payment);

        NumberFormat formatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = formatterFrance.format(payment); 
        
        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = formatterChina.format(payment);

        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 
        india = formatterIndia.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}