package PP;


/*
 * Given List of trades with status(Open, Closed) and amount. Write a Java program to sum 
  up all trade values that should not exceed 1M
  ['$10.50', '$2.00', '$100.00', '$5.00']  this is a string value can u print in order.
 
 */

import java.util.Arrays;
import java.util.List;

public class TradeSum {
    public static void main(String[] args) {
    	
    	 List<String> trades = Arrays.asList(
                 "$10.50",
                 "$2.00",
                 "$100.00",
                 "$5.00"
         );

         double limit = 1_000_000.00;
         double sum = 0.0;

         System.out.println("Trades added in order:");

         for (String trade : trades) {
             // Remove '$' and convert to double
             double value = Double.parseDouble(trade.replace("$", ""));

             // Check if adding exceeds 1M
             if (sum + value <= limit) {
                 sum += value;
                 System.out.println(trade);
             } else {
                 break;
             }
         }

         System.out.println("Total Sum: $" + sum);
    }
}
