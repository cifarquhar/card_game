import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardCollectionTest{

  Hand testHand;
  Deck testDeck;
  Discard testDiscard;
  InPlay testInPlay;
  Card testCard1;
  Card testCard2;

  @Before
  public void before(){
    testHand = new Hand();
    testDeck = new Deck();
    testDiscard = new Discard();
    testInPlay = new InPlay();
    testCard1 = new Card(CardSuit.HEARTS,5);
    testCard2 = new Card(CardSuit.CLUBS,13);
  }

  @Test
  public void handCanCountCards(){
    assertEquals(0,testHand.countCards());
  } 

  @Test
  public void deckCanCountCards(){
    assertEquals(0,testDeck.countCards());
  } 

  @Test
  public void discardCanCountCards(){
    assertEquals(0,testDiscard.countCards());
  } 

  @Test
  public void inPlayCanCountCards(){
    assertEquals(0,testInPlay.countCards());
  }

  @Test
  public void handCanAddCards(){
    testHand.addCard(testCard1);
    assertEquals(1,testHand.countCards());
  }


}