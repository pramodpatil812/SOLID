package solid.srp;

/*
https://github.com/kanmaytacker/fundamentals/blob/master/oop/code/oop/src/main/java/com/scaler/lld/questions/Invoice.java
Code in this class on the above repository violates SRP as it contains logic to print invoice details as well as it has method
to save invoice to file.
Here in this class I have fixed the SRP violations by moving some functionalities in other classes.
*/
public class Invoice {
    private Book book;
    private Integer quantity;
    private Double discountRate;
    private Double taxRate;
    //private double total;

    public Double getTotal() {
        double price = ((book.getPrice() - book.getPrice() * discountRate) * this.quantity);
        return price * (1 + taxRate);
    }

    public Invoice(Book book, Integer quantity, Double discountRate, Double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    public Book getBook() {
        return book;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public Double getTaxRate() {
        return taxRate;
    }
}
