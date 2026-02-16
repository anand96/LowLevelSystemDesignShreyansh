package InterviewQuestion.InventoryManagement;

public class Invoice {
    int totalItemPrice;
    int totaltax;
    int totalFinalPrice;

    public void generateInvoice(Order order)
    {
        totalItemPrice = 200;
        totaltax = 20;
        totalFinalPrice = 220;
    }
}
