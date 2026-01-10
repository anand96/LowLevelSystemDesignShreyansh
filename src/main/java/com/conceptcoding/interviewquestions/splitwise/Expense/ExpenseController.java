package main.java.com.conceptcoding.interviewquestions.splitwise.Expense;

import main.java.com.conceptcoding.interviewquestions.splitwise.BalanceSheetController;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.ExpenseSplitType;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.ExpenseSplit;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.Split;
import main.java.com.conceptcoding.interviewquestions.splitwise.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount, List<Split> splitDetails,
                                 ExpenseSplitType expenseSplitType, User paidByUser) {

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(expenseSplitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser, expenseSplitType, splitDetails);
        balanceSheetController.updateuserExpenseBalanceSheet(paidByUser,splitDetails,expenseAmount);

        return expense;
    }
}
