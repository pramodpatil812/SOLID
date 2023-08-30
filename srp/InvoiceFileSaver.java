package solid.srp;

public class InvoiceFileSaver implements InvoiceSaver {
    private String filename;

    public InvoiceFileSaver(String filename) {
        this.filename = filename;
    }

    @Override
    public void save() {
        // Creates a file with given name and writes the invoice
    }
}
