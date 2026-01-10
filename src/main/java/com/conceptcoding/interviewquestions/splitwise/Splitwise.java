package main.java.com.conceptcoding.interviewquestions.splitwise;

import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.ExpenseSplitType;
import main.java.com.conceptcoding.interviewquestions.splitwise.Expense.Split.Split;
import main.java.com.conceptcoding.interviewquestions.splitwise.Group.Group;
import main.java.com.conceptcoding.interviewquestions.splitwise.Group.GroupController;
import main.java.com.conceptcoding.interviewquestions.splitwise.User.User;
import main.java.com.conceptcoding.interviewquestions.splitwise.User.UserController;

import java.util.ArrayList;
import java.util.List;

public class Splitwise {

    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;

    Splitwise()
    {
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }

    public void demo(){
        setupUserAndGroup();
        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUser("U201"));
        group.addMember(userController.getUser("U202"));

        List<Split> splits = new ArrayList<>();
        Split split1 = new Split(userController.getUser("U201"), 300);
        Split split2 = new Split(userController.getUser("U202"), 100);
        splits.add(split1);
        splits.add(split2);
        group.createExpense("Exp101", "Breakfast", 900, splits, ExpenseSplitType.EQUAL, userController.getUser("U201"));


        List<Split> splits2 = new ArrayList<>();
        Split split2_1 = new Split(userController.getUser("U101"), 400);
        Split split2_2 = new Split(userController.getUser("U202"), 500);
        splits.add(split2_1);
        splits.add(split2_2);
        group.createExpense("Exp102", "Lunch", 500, splits, ExpenseSplitType.UNEQUAL, userController.getUser("U201"));

        for (User user: userController.getAllUsers()){
            balanceSheetController.showBalanceSheetOfUser(user);
        }
    }

    public void setupUserAndGroup() {

        //onboard user to splitwise app
        addUsersToSplitwiseApp();

        //create a group by user1
        User user1 = userController.getUser("U1001");
        groupController.createNewGroup("G1001", "Outing with Friends", user1);
    }

    private void addUsersToSplitwiseApp() {

        //adding User1
        User user1 = new User("U1001", "User1");

        //adding User2
        User user2 = new User("U2001", "User2");

        //adding User3
        User user3 = new User("U3001", "User3");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
