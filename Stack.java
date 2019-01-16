import java.util.*;
 

class Stack
{
    protected int arr[];
    protected int top, size, len;
   
    public arraystack(int n)
    {
        size = n;
        len = 0;
        arr = new int[size];
        top = -1;
    }
  
  public void push(int i)
    {
        if(top + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top + 1 < size )
            arr[++top] = i;
        len++ ;
    }
    
  
   public int pop()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        len-- ;
        return arr[top--]; 
    }    
    
  
    public boolean isEmpty()
    {
        return top == -1;
    }
 
    public boolean isFull()
    {
        return top == size -1 ;        
    }
  
    public int getSize()
    {
        return len ;
    }
  
   
    
   
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }    
}
 

public class Stacktest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        System.out.print("Enter stack size=");
        int n = scan.nextInt();
        arraystack st= new arraystack(n);
        
        char ch;
        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. isEmpty");
            System.out.println("4. isFull");
            System.out.println("5. SpaceLeft");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter  element In Stack");
                try 
                {
                    st.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = " + st.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
                                   
            case 3 : 
                System.out.println("Empty status = " + st.isEmpty());
                break;                
            case 4 :
                System.out.println("Full status = " + st.isFull());
                break;                 
            case 5 : 
                System.out.println("Size = " + st.getSize());
                break;                         
            default : 
                System.out.println("Wrong Entry  ");
                break;
            }
           
            st.display();            
            System.out.println("\nDo you want to continue (Y/N) ");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                 
    }
}