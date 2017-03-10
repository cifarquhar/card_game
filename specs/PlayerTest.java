import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest{

  Player player1;
  Hand player1Hand;
  Card testCard1;

  @Before
  public void before(){
    player1Hand = new Hand();
    player1 = new Player("Colin",player1Hand);
    testCard1 = new Card(CardSuit.HEARTS,5);
  }

  @Test
  public void playerHasName(){
    assertEquals("Colin",player1.getName());
  }

  @Test
  public void canCountPlayersCards(){
    assertEquals(0,player1Hand.countCards());
  }

  @Test
  public void canAddPlayerCard(){
    player1Hand.addCard(testCard1);
    assertEquals(1,player1Hand.countCards());
  }

  // @Test
  // public void canPlayCard(){
    
  // }



}