import static org.junit.Assert.*;
import org.junit.*;

public class CardCollectionTest{

  Hand testHand;
  Deck testDeck;
  Discard testDiscard;
  InPlay testInPlay;

  @Before
  public void before(){
    testHand = new Hand();
    testDeck = new Deck();
    testDiscard = new Discard();
    testInPlay = new InPlay();
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


}