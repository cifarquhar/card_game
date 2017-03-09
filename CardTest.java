import static org.junit.Assert.*;
import org.junit.*;

public class CardTest{

  Card card1;
  Card card2;

  @Before
  public void before(){
    card1 = new Card(CardSuit.HEARTS,5);
    card2 = new Card(CardSuit.CLUBS,13);
  }

  @Test
  public void canFindSuit(){
    assertEquals(CardSuit.HEARTS,card1.getSuit());
  }

}