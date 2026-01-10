package main.java.com.conceptcoding.interviewquestions.splitwise;

import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.Split;
import main.java.com.conceptcoding.interviewquestions.splitwise.User.User;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public void updateuserExpenseBalanceSheet(User expensePaidBy, List<Split> splits, double totalExpenseAmount){

        UserExpenseBalanceSheet paidByUserExpenseSheet = expensePaidBy.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment() + totalExpenseAmount);

        for (Split split : splits){
            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweExpenseSheet = userOwe.getUserExpenseBalanceSheet();
            double oweAmount = split.getAmountOwe();

            if(expensePaidBy.getUserId().equals(userOwe.getUserId())){
                paidByUserExpenseSheet.setTotalYourExpense(paidByUserExpenseSheet.getTotalYourExpense() + oweAmount);
            } else {
                paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.getTotalYouGetBack() + oweAmount);

                Balance userOwnBalance;
                if(paidByUserExpenseSheet.getUserVsValance().containsKey(userOwe.getUserId())){
                    userOwnBalance = paidByUserExpenseSheet.getUserVsValance().get(userOwe.getUserId());
                }
                else {
                    userOwnBalance = new Balance();
                    paidByUserExpenseSheet.getUserVsValance().put(userOwe.getUserId(), userOwnBalance);
                }

                userOwnBalance.setAmountGetBack(userOwnBalance.getAmountGetBack() + oweAmount);

                oweExpenseSheet.setTotalYouOwe(oweExpenseSheet.getTotalYouOwe()+ oweAmount);

                Balance userPaidBalance;
                if(oweExpenseSheet.getUserVsValance().containsKey(expensePaidBy.getUserId())){
                    userPaidBalance = oweExpenseSheet.getUserVsValance().get(expensePaidBy.getUserId());
                }
                else{
                    userPaidBalance = new Balance();
                    oweExpenseSheet.getUserVsValance().put(expensePaidBy.getUserId(), userPaidBalance);
                }
                userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe() + oweAmount);
            }
        }
    }

    public void showBalanceSheetOfUser(User user){

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user" + user.getUserId());

        UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();
        System.out.println("TotalYourExpense:"+userExpenseBalanceSheet.getTotalYourExpense());
        System.out.println("TotalGetBack:"+userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("TotalYouOwe:"+userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("TotalPaymentMade:"+userExpenseBalanceSheet.getTotalPayment());

        for(Map.Entry<String, Balance> entry : userExpenseBalanceSheet.getUserVsValance().entrySet()){
            String userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userId" + userID + "YouGetBack"+ balance.getAmountGetBack() + "You Owe:" + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");
    }
}
