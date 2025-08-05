import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);       
        rates.put("INR", 83.0);
        rates.put("EUR", 0.91);
        rates.put("JPY", 142.0);
        rates.put("GBP", 0.78);

        System.out.println("Available Currencies: USD, INR, EUR, JPY, GBP");

        System.out.print("From Currency: ");
        String from = sc.next().toUpperCase();
        System.out.print("To Currency: ");
        String to = sc.next().toUpperCase();
        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        if (rates.containsKey(from) && rates.containsKey(to)) {
            double converted = amount * (rates.get(to) / rates.get(from));
            System.out.printf("Converted Amount: %.2f %s\n", converted, to);
        } else {
            System.out.println("Unsupported currency.");
        }

        sc.close();
    }
}