package InterviewQuestion.InventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class User {
    int userId;
    String userName;
    Addrees addrees;
    Cart userCartDetails;
    List<Integer> orderIds;

    public User(){
        userCartDetails = new Cart();
        orderIds = new ArrayList<>();
    }
    //get UserCart

    public Cart getUserCart()
    {
        return userCartDetails;
    }
}
