package main.java.com.conceptcoding.interviewquestions.splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {
    Map<String, Balance> userVsValance;
    double totalYourExpense;
    double totalPayment;
    double totalYouOwe;
    double totalYouGetBack;


    public UserExpenseBalanceSheet() {
        userVsValance = new HashMap<>();
        totalYourExpense =0;
        totalPayment = 0;
        totalYouOwe = 0;
        totalYouGetBack = 0;
    }

    public Map<String, Balance> getUserVsValance() {
        return userVsValance;
    }

    public double getTotalYourExpense() {
        return totalYourExpense;
    }

    public void setTotalYourExpense(double totalYourExpense) {
        this.totalYourExpense = totalYourExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }
}
