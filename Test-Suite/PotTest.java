import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import poker.ui.Pot;

public class PotTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testGetPotTotal() {
		Pot p=new Pot();
		int bet=10;
		p.setCurrentPotTotal(bet);
		assertEquals(bet,p.getCurrentPotTotal());
		//fail("Not yet implemented");
	}
	@Test
	public void testSetPotTotal(){
		Pot p=new Pot();
		int bet=10;
	    p.setCurrentPotTotal(bet);
	    assertEquals(bet,p.currentPotTotal);
	}
    @Test
    public void testClearPot(){
    	Pot p=new Pot();
    	p.clearPot();
    	assertEquals(p.currentPotTotal,0);
    	
    }
}
