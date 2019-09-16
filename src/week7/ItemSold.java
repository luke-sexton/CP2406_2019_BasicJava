package week7;

public class ItemSold {
    int invoiceNumber;
    String itemDescription;
    double itemPrice;

    public ItemSold(int invoiceNumber, String itemDescription, double itemPrice) {
        setInvoiceNumber(invoiceNumber);
        setItemDescription(itemDescription);
        setItemPrice(itemPrice);
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

}
