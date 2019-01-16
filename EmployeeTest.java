public class EmployeeTest {

   
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Ajay", "Mishra", 40000.0000);
        Employee emp2 = new Employee("Vijay", "Mishra", 60000.0000);
        
       
        System.out.println("First Name      Last Name       Salary");
        System.out.printf("%s               %s          %.4f\n",emp1.getFirstName(), emp1.getLastName(), emp1.getSalery() );
        System.out.printf("%s           %s      %.4f\n",emp2.getFirstName(), emp2.getLastName(), emp2.getSalery() );
        
      
        emp1.setSalary(emp1.getSalery() + (emp1.getSalery() /10));
        emp2.setSalary(emp2.getSalery() + (emp2.getSalery() /10));
        System.out.println("\nYou just got a ten percent raise!\n");
        
        System.out.println("First Name      Last Name       Salary");
        System.out.printf("%s               %s          %.4f\n",emp1.getFirstName(), emp1.getLastName(), emp1.getSalery() );
        System.out.printf("%s           %s      %.4f\n",emp2.getFirstName(), emp2.getLastName(), emp2.getSalery() );
        
        
    }
    
}


 