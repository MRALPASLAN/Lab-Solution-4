package lab5;

public class OverNightPackage extends Package{
    double additionalFeePerOunce;

    public OverNightPackage(double additionalFeePerOunce, String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode, String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode, double packageWeight, double costPerOunce) {
        super(recipientName, recipientAddress, recipientCity, recipientState, recipientZipCode, senderName, senderAddress, senderCity, senderState, senderZipCode, packageWeight, costPerOunce);
        this.additionalFeePerOunce = additionalFeePerOunce;
    }

  
    @Override
    public double calculateCost() {
        return super.calculateCost()+ additionalFeePerOunce*packageWeight; 
    }
    
    @Override
    public void displayInfo() {
        System.out.println("[OVER-NIGHT-PACKAGE]---------------------");
        super.displayInfo(); 
        System.out.println("Additional Fee:"+additionalFeePerOunce);
        System.out.println("");
    }

    
    
    
    
    
    
    
}
