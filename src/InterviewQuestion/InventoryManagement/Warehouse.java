package InterviewQuestion.InventoryManagement;

import java.util.Map;

public class Warehouse {
    Inventory inventory;
    Addrees addrees;

    //Update inventory
    public void removeItemFromInventory(Map<Integer, Integer> productCategoryAndCountMap)
    {
        inventory.removeItems(productCategoryAndCountMap);
    }

    public void addItemToInventory(Map<Integer, Integer> prodcutCategoryAndCountMap)
    {

    }

}
