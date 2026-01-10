package main.java.com.conceptcoding.interviewquestions.splitwise.Expense;

import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.ExpenseSplitType;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.EqualExpenseSplit;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.ExpenseSplit;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.PercentageExpenseSplit;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType expenseSplitType)
    {
        switch (expenseSplitType){
            case EQUAL :
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
