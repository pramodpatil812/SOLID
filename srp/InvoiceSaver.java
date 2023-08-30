package solid.srp;

//This interface can be used by various classes who want to save invoice to different databases including file
public interface InvoiceSaver {
    void save();
}
