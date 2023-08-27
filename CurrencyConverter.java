import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Select base and target currencies
        System.out.print("Enter base currency: ");
        String baseCurrency = scanner.nextLine();

        System.out.print("Enter target currency: ");
        String targetCurrency = scanner.nextLine();

        // Step 2: Fetch exchange rate (You'll need to use an API for this)
        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

        // Step 3: Input amount
        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        // Step 4: Perform currency conversion
        double convertedAmount = amount * exchangeRate;

        // Step 5: Display result
        System.out.printf("%.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }


    }
