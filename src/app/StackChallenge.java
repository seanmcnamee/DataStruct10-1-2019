package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * StackChallenge
 */
public class StackChallenge {

    public static void main(String[] args) throws IOException {
        //How we take input
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //Get Annual Principle
        System.out.print("Enter the annual principle: ");
        String strYearlyPrinciple = userInput.readLine();
        double yearlyPrinciple = Double.parseDouble(strYearlyPrinciple);
        System.out.println(yearlyPrinciple);

        //Get Yearly Interest Rate
        System.out.print("Enter the yearly interest rate: ");
        String strRate = userInput.readLine();
        double rate = Double.parseDouble(strRate);
        System.out.println(rate);

        //Instantiate accumulator and Stack
        int years = 30;
        double annualTotal = 0;
        double overallTotal = 0.0;
        Stack<Double> balances = new Stack<Double>();
        balances.push(0.0); //This is for the 0 year (before you add $$)

        for (int i = 0; i < years; i++) {
            double lastYear = balances.peek();

            System.out.println("\tLast year: " + lastYear);
            double lastandPrinciple = lastYear+yearlyPrinciple;
            System.out.println("\tLast year + yearlyPrinciple: " + lastandPrinciple);
            annualTotal = (lastandPrinciple)*rate;
            System.out.println("\tYear " + (i+1) + " intrest: " + annualTotal);

            overallTotal = lastandPrinciple+annualTotal;

            System.out.println("Overall Total: " + overallTotal);

            balances.push(overallTotal);
        }

        System.out.println("Total balance is: " + balances.peek());
        


         
    }
}