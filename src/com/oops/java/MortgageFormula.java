package com.oops.java;

public class MortgageFormula {

    public double calculateMortgage(
            int principalAmount,
            float annualRateIntrest,
            byte period) {
        final  byte Months_in_Year = 12;
        final byte Percent = 100;
        float monthlyIntrest = annualRateIntrest/Percent / Months_in_Year;
        float numberOfPayments = period * Months_in_Year;

        double mortgage = principalAmount *(monthlyIntrest* Math.pow(1 +monthlyIntrest, numberOfPayments)/(Math.pow(1+ monthlyIntrest, numberOfPayments)-1));

        return mortgage;

    }
}

