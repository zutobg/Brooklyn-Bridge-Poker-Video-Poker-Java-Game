import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import poker.ui.Main;
import poker.ui.Poker;

public class MainMethodTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Main m=new Main();
		assertSame(m.game,new Poker());
		
		//fail("Not yet implemented");
	}

}
