

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import poker.ui.PlayCard;
import poker.ui.Pot;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
    @Test
    public void testGetCurrentPotTotal(){
    	Pot p=new Pot();
    	int value=10;
    	p.setCurrentPotTotal(value);
        assertTrue(p.getCurrentPotTotal()==value);
        
    }

   
	
	
}
