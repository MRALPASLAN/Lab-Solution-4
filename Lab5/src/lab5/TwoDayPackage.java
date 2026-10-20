package lab5;

public class TwoDayPackage extends Package {
    double flatFee;

    public TwoDayPackage(double flatFee, String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode, String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode, double packageWeight, double costPerOunce) {
        super(recipientName, recipientAddress, recipientCity, recipientState, recipientZipCode, senderName, senderAddress, senderCity, senderState, senderZipCode, packageWeight, costPerOunce);
        this.flatFee = flatFee;
    }

   

    @Override
    public double calculateCost() {
        return super.calculateCost()+flatFee; 
    }
    
    @Override
    public void displayInfo() {
        System.out.println("[TWO-DAY-PACKAGE]------------------------");
        super.displayInfo();
        System.out.println("Flat Fee:"+flatFee);
        System.out.println("");
    }
    
    
    
    
    
}
