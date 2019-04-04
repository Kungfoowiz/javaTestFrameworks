package edwardTest.JUnit;

import edwardTest.App;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;


public class ExampleUnitTest 
{
    
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
    }

    @Test
    public void isItFriday()
    {    
        Assert.assertFalse( new App().getIsDay(Calendar.FRIDAY) );
        // Assert.assertTrue( new App().getIsDay(Calendar.FRIDAY) );
    }
}
