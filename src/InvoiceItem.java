public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    private static int InvoiceCount = 0;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;

        InvoiceCount++;
    }

    public InvoiceItem(InvoiceItem copy) {
        this.id = copy.id; // Copy the id
        this.desc = copy.desc; // Copy the description
        this.qty = copy.qty; // Copy the quantity
        this.unitPrice = copy.unitPrice; // Copy the unit price

        // Increment the InvoiceCount since a new InvoiceItem is being created
        InvoiceCount++;
    }

    public static int getInvoiceCount() {
        return InvoiceCount;
    }

    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.qty * this.unitPrice;
    }

    public String toString() {
        return "InvoiceItem[ID=" + this.id + ", Description=" + this.desc + ", Quantity=" + this.qty + ", Unit Price=" + this.unitPrice + ", Total=" + this.getTotal() + "]";
    }
}
