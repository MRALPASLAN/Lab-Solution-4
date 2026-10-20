
package lab5;


public class Main {
    
    public static void main(String[] args){
        
        Package package1 = new Package(
    "Ahmet Yılmaz", "Çankaya Mah. No:15", "Ankara", "İç Anadolu", "06500",   
    "Mehmet Kaya", "Kadıköy Cad. No:8", "İstanbul", "Marmara", "34710",     
    12.5, 3.50                                                              
);

        TwoDayPackage package2 = new TwoDayPackage(
    5.0,            
    "Raşit Alpaslan", "Nilüfer Sok. No:4", "Kayseri", "Marmara", "16110",          
    "Fedva Ashour", "Alsancak Bulv. No:22", "Kayseri", "Ege", "35220",       
    8.0, 4.25                                                                
);

        OverNightPackage package3 = new OverNightPackage(
    1.0,            
    "Burak Şahin", "Muratpaşa Cad. No:10", "Antalya", "Akdeniz", "07100",    
    "Emre Çelik", "Ortahisar Mah. No:3", "Trabzon", "Karadeniz", "61030",     
    15.0, 2.75                                                               
);
        
        
        package1.displayInfo();
        System.out.println("");
        package2.displayInfo();
        package3.displayInfo();
        
        
        
        
    }
    
    
    
}
