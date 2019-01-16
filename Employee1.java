public class Employee1 {

   
    public static void main(String[] args) {
        
        Address emp1 = new Address("22 C Dwarka", "Delhi", 110056);
        Address emp2 = new Address("56 K Lajapt Nagae", "Rohini", 110085);
        
       
        System.out.println("First Line       Second Line        Pin Code");
        System.out.printf("%s               %s          %.0f\n",emp1.getfirstLine(), emp1.getSecondLine(), emp1.getPincode() );
        System.out.printf("%s           %s      %.0f\n",emp2.getfirstLine(), emp2.getSecondLine(), emp2.getPincode() );
        
      
        
        
    }
    
}


class Address {
    private String firstLine;
    private String SecondLine ;
    private double Pincode; 
    

    public Address(String firstLine, String SecondLine, double Pincode) {
        this.firstLine = firstLine;
        this.SecondLine = SecondLine;
        this.Pincode = Pincode;
    }

    public String getfirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return SecondLine;
    }
 
    public double getPincode() {
        return Pincode;
    }
 
    public void setfirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public void setSecondLine(String SecondLine) {
        this.SecondLine = SecondLine;
    }

    public void setPincode(double Pincode) {
        this.Pincode = Pincode;
    }
            
}