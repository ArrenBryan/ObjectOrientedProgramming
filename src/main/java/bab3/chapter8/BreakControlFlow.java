package bab3.chapter8;

import java.util.*;

public class BreakControlFlow {

    public static void main(String[] args) {

        // read inputs
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;
        
        while (years < 100) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            if (balance >= goal) {
                break;
            }
            years++;
        }
        
        System.out.println("You can retire in " + years + " years.");
        System.out.println("Balance: " + balance);
    }
}
