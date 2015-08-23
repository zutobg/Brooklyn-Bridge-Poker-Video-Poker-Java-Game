import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import poker.ui.PlayCard;
import poker.ui.Player;

public class PlayerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testGetPlayerName() {
		Player pl=new Player();
	    String name="name";
		pl.setPlayerName(name);
		if(pl.getPlayerName()!=name){
		fail("Passed! ");
		}else{
			System.out.println("Passed");
		}
	}
	@Test
	public void testGetPlayerCash(){
		Player pl2=new Player();
		int cash=150;
		pl2.setPlayerCash(cash);
		if(pl2.getPlayerCash()==cash){
			System.out.println("Passed");
		}else{
			fail("Fail!");
			
		}
	}
	
	@Test
	public void testGetPlayerBet(){
		Player test3=new Player();
		final int bet=50;
		test3.setPlayerBet(bet);
		if(test3.getPlayerBet()==bet){
			System.out.println("Passed");
		}else{
			fail("Fail!");
			
		}
	}
		@Test
		public void testGetPlayerCurrentCards(){
		     Player test4 =new Player();
		     ArrayList<PlayCard>cards=new ArrayList<PlayCard>();
		     test4.setPlayerCards(cards);
		     try{
		    	 assertEquals(test4.getPlayerCurrentCards(), cards);
		    	 System.out.println("Passed");
		     }catch(Exception e){
		    	 System.out.println("Bug");
		     }
		}
		@Test
		public void testClearCards(){
			Player test5=new Player();
			
			test5.clearCards();
			
			assertEquals(test5.currentCards,0);
		}
		@Test
		public void testClearBet(){
			Player test6 =new Player();
			test6.clearBet();
			assertEquals(test6.bet,0);
		}
		@Test
		public void testClearCommRank(){
			Player test7=new Player();
			
			test7.clearCombRank();
			
			assertEquals(test7.combRank,0);
			
		}
	}


