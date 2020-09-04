package employeemanagementsystem;

/**
 *
 * @author Hillol Talukdar
 * ID    : 181-115-029
 * Batch : CSE(44th) 
 * 
 */

public class Date
{
    
    
    private int month;
    private int year;
    private int days;
    
    private final int[] daysPerMonth ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Date(int month, int year)
    {
        
        setDays(month,year);
            
    }
    
    private  void setDays(int month, int year)
    {   
         this.month = month;
         this.year = year;
    }
    
    public boolean  checkLeapYear()
    {
        
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
     /*   if( (year%400 == 0) || ( (year%4 == 0) && (year%100 != 0) ) )
            return true;
        else
           return false;*/
    }
    
    public int getDays(int month)
    {
        if(daysPerMonth[month]==31)
           return 31;
        else if(daysPerMonth[month]==28)
            return 28;
        else
            return 30; 
    }
}
