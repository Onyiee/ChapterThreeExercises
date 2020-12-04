package numberthreepointonetwo;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    private double invoiceAmount;

    public Invoice(String myPartNumber, String myPartDescription, int myQuantity, double myPrice){
        partNumber = myPartNumber;
        partDescription = myPartDescription;
        quantity = myQuantity;
        price = myPrice;
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public String getPartNumber(){
        return partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public String getPartDescription(){
        return partDescription;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public double getInvoiceAmount(){

        if(this.getQuantity() < 0){
            quantity = 0;
        }
        if(this.getPrice() < 0){
            price = 0;
        }
         return invoiceAmount = this.getQuantity() * this.getPrice();
    }
}
