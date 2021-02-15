package com.oops.java;

import java.text.NumberFormat;

public class MortgageReport{

    private final NumberFormat currency;
    private  MortgageCalculation calculator;

    public MortgageReport(MortgageCalculation calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));

    }

    public void printMortgage() {
            double mortgage = calculator.calculateMortgage();
            String mortgageFormatted = currency.format(mortgage);
            System.out.println();
            System.out.println("MORTGAGE");
            System.out.println("--------");
            System.out.println("Monthly Payments: " + mortgageFormatted);
        }


}
