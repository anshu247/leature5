

class DateTest {

  
    public static void main(String[] args) {
        Date date = new Date(5, 31, 2000);
        
        date.setYear(date.getYear());
        date.setMonth(date.getMonth());
        date.setDay(date.getDay());
        
        date.displayDate();
        System.out.printf("Date: %d/%d/%d\n", date.getDay(), date.getMonth(), date.getYear());
    }
    
}

class Date { 

    private int month;//instance variable 
    private int day;
    private int year;
    
    //constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
		
    }
    public Date() {
        this.month = 1;
        this.day = 1;
        this.year = 2000;
        
    }
 
    public int getMonth() {
        return month;
    }
 
    public int getDay() {
        return day;
    }
    
    public int getYear() {
        return year;
    } 
   
    public void setYear(int year) {
        this.year = year;
    }
   
    public void setMonth(int month) {
        if(month < 1 || month > 12) 
            month = 1;
        this.month = month;
    }
  
    public void setDay(int day) {
        
        if(month == 2 && year % 4 == 0 && (day < 1 || day > 29 )) 
              day = 1;
        
        else if(month == 2 && (day < 1 || day > 28))
            day = 1;
        
        else if( month == 8 || month == 4 || month == 6 || month == 11 && (day < 1 || day > 30))
            day = 1;
        
        else if(day < 1 || day > 31) day = 1;
        
        this.day = day;
    }
   
    public void displayDate() {
        System.out.printf("Date: %d/%d/%d\n", day, month, year);
    }
}


