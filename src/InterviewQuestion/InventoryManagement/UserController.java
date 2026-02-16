package InterviewQuestion.InventoryManagement;

import java.util.List;

public class UserController {
    List<User> userList;

    UserController( List userList)
    {
        this.userList = userList;
    }

    // add user
    public void addUser(User user)
    {
        userList.add(user);
    }

    //get particular user
    public User getUser(int userId)
    {
        for(User user : userList)
        {
            if(user.userId == userId)
            {
                return user;
            }
        }
        return null;
    }
}
