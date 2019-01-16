
import java.util.*; 
import java.time.*; 

 class HeartRatesTest {


	public static void main( String[] args )
	{
	LocalDate date = LocalDate.of(1997,04,29);
        HeartRates heart = new HeartRates("", "", date);
	HeartRates thr = new HeartRates("Kuna", "Fomboh", date);

	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter your first name: ");
	String first = input.nextLine();
	thr.setFirstName(first);


	System.out.print("Enter your last name: ");
	String last = input.nextLine();
	thr.setLastName(last);


	thr.setDateOfBirth();

	
	System.out.printf("\nFirst Name: %s\n", thr.getFirstName());
	System.out.printf("Last Name: %s\n", thr.getLastName());
		

	System.out.printf("You are %d years old\n", thr.calcAge());
	
	System.out.printf("Your Maximum Heart Rate is %d beats per second\n", thr.maxHeartRate());
	
	System.out.printf("Your Target-Heart-Rate lies between %d - %d percent \n\n", thr.tarHeartRate1(), thr.tarHeartRate2());
		
	}
}



 class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    
   
     HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }
  
    public String getLastName() {
        return lastName;
    }
     public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
  
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
  
    public void setDateOfBirth() {
    
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your Year of birth and press the Enter key: ");
        int year = input.nextInt();


	System.out.print("Enter your month of birth and press the Enter key: ");
	int month = input.nextInt();
		

	System.out.print("Enter your Day of birth and press the Enter key: ");
	int day = input.nextInt();
        
        LocalDate birth = LocalDate.of(year, month, day);

	dateOfBirth = birth;

    }
   
    public int calcAge() {
	LocalDate today = LocalDate.now();
	Period p = Period.between(dateOfBirth, today);
	int age = p.getYears();
	return age;
	}
    
.
   public int maxHeartRate() {
	int maxHR = 220 - calcAge();
           return maxHR;
	}

    public int tarHeartRate1() {
	double tarHR1 = maxHeartRate() * 0.5;
	return (int)tarHR1;
	}

    public int tarHeartRate2() {
	double tarHR2 = maxHeartRate() * 0.58;
	return (int)tarHR2;
	
    }
    
}