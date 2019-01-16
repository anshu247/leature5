import java.util.ArrayList;
import java.io.*;

public class Employeename {
int id;
String name;
String desig;
static ArrayList al = new ArrayList();
static int count = 0; 

Employee()
{ 
}



Employee(int id, String name, String desig)
{
this.id = id;
this.name = name;
this.desig = desig;
count++;
}



public void putDetails(Employee e)
{
al.add(e);
}



public Employee getDetails(int id)
{
Employee es = (Employee)al.get(id);
return es;
}


public static void main(String[] args) throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Employee e = new Employee();
Employee e1 = new Employee(1, "SaiRam", "Project Owner");
Employee e2 = new Employee(2, "Anu", "GL");
Employee e3 = new Employee(3, "Vasu", "PM");
Employee e4 = new Employee(4, "Shillu", "PL");
Employee e5 = new Employee(5, "Madhu", "TL");
Employee e6 = new Employee(6, "Volga", "TM");


e.putDetails(e1);	
e.putDetails(e2);
e.putDetails(e3);
e.putDetails(e4);
e.putDetails(e5);
e.putDetails(e6);

System.out.println("The total number of employees are: " +count);
System.out.println(" ");

while(true)
{
System.out.println("Enter employee id to get the employee details: ");
int id = Integer.parseInt(br.readLine());
boolean flag = false;

for(int i=0;i<=id;i++) 	{
Employee es = e1.getDetails(i);
if(id == es.id)
{
System.out.println("The details of the employee with id " +id +" is: ");
System.out.print(es.id +" " +es.name+" " +es.desig);
flag = true;
break;
}
}

System.out.println(" ");

if(!flag)
{
System.out.println("Sorry, no data exists with the id " +id);
}
System.out.println(" ");
String ch = null;

while(true)
{
System.out.println("Want to Continue(y/n)?)");
System.out.println(" ");
ch = br.readLine();
if(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")) break;
if(!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")))
{
System.out.println("Invalid option : please type y/n");
System.out.println(" ");
}
}

if(ch.equalsIgnoreCase("n"))
{
System.out.println(" ");
System.out.println("Thank you");
break;
} 
}
}
}