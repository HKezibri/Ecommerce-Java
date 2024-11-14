package model;

//@Table(name = "e_Invoice")
import java.util.Date;


public class Invoice {
	private int idInvoice;  // Auto-generated by the database
    private double totalPrice;  // Use camelCase for consistency
    private Date invoiceDate;  // Date when the invoice was generated
    private int orderId;  // Reference to the Order object
 // private Date add_date private Date update_date
    
    //Constructors
    public Invoice(int orderid, double totalPrice, Date invoiceDate) {
        this.orderId = orderid;
        this.totalPrice = totalPrice;
        this.invoiceDate = invoiceDate;
    }
    // Getters & setters
    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public double getTotalprice() {
        return totalPrice;
    }

    public void setTotalprice(double totalprice) {
        if (totalprice < 0) {
            throw new IllegalArgumentException("Total price cannot be negative");
        }
        this.totalPrice = totalprice;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.invoiceDate = InvoiceDate;
    }
    
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
