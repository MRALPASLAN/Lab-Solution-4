
package lab5;

public class Package {
    String recipientName,recipientAddress,recipientCity,recipientState,recipientZipCode;
    String senderName,senderAddress,senderCity,senderState,senderZipCode;
    double packageWeight,costPerOunce;

    public Package(String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZipCode,
                   String senderName, String senderAddress, String senderCity, String senderState, String senderZipCode,
                   double packageWeight, double costPerOunce) {
        
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZipCode = recipientZipCode;
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZipCode = senderZipCode;
        this.packageWeight = packageWeight;
        this.costPerOunce = costPerOunce;
        
    }
    
    public double calculateCost(){
        return packageWeight*costPerOunce;
    }
    
    public void displayInfo(){
        System.out.println("Sender Information-----------------------");
        System.out.println(senderName+"--"+senderAddress+"--"+
                "\n"+senderCity+"--"+senderState+"--"+senderZipCode);
        System.out.println("Package Weight:"+packageWeight);
        System.out.println("Cost Per Ounce:"+costPerOunce);
        System.out.println("Recipient Information--------------------");
        System.out.println(recipientName+"--"+recipientAddress+"--"+
                "\n"+recipientCity+"--"+recipientState+"--"+recipientZipCode);
        System.out.println("*****************************************");
        System.out.println("Package Information----------------------");
        System.out.println("Package Weight:"+packageWeight);
        System.out.println("Cost Per Ounce:"+costPerOunce);
        System.out.println("Total Cost:"+calculateCost());
        
        
        
    }
    
    
    
}
