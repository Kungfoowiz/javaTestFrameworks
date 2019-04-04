package edwardTest;

import java.util.Calendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    public boolean getIsDay(int day)
    {
        var today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        
        return today == day;
    }
}
