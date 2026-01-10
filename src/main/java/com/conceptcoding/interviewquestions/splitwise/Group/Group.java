package main.java.com.conceptcoding.interviewquestions.splitwise.Group;

import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Expense;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.ExpenseController;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.ExpenseSplitType;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.Split;
import main.java.com.conceptcoding.interviewquestions.splitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {

    String groupId;
    String groupName;
    List<User> groupMembers;

    List<Expense> expenseList;

    ExpenseController expenseController;

    Group(){
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void addMember(User member){
        groupMembers.add(member);
    }

    public String getGroupId(){
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount, List<Split> splitDetails,
                                 ExpenseSplitType expenseSplitType, User paidByUser) {
        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, expenseSplitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }

}

