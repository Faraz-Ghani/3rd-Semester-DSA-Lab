package dsa_lab2;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private float pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, float pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = Math.max(0, quantity);
        this.pricePerItem = Math.max(0, pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPricePerItem() {
        return pricePerItem;
    }

    public float getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}



public class Q3 {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("1234", "Screwdriver", 5, 10.0f);
		System.out.println("The Total amount is "+invoice.getInvoiceAmount());

	}

}
