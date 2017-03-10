import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardCollectionTest{

  CardCollection testHand;
  CardCollection testDeck;
  CardCollection testDiscard;
  CardCollection testInPlay;
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

  @Test
  public void deckCanAddCards(){
    testDeck.addCard(testCard1);
    assertEquals(1,testDeck.countCards());
  }

  @Test
  public void discardCanAddCards(){
    testDiscard.addCard(testCard1);
    assertEquals(1,testDiscard.countCards());
  }
  
  @Test
  public void inPlayCanAddCards(){
    testInPlay.addCard(testCard1);
    assertEquals(1,testInPlay.countCards());
  }

  @Test
  public void handCanRemoveCard(){
    testHand.addCard(testCard1);
    testHand.removeCard();
    assertEquals(0,testHand.countCards());
  }  

  @Test
  public void deckCanRemoveCard(){
    testDeck.addCard(testCard1);
    testDeck.removeCard();
    assertEquals(0,testDeck.countCards());
  }  

  @Test
  public void discardCanRemoveCard(){
    testDiscard.addCard(testCard1);
    testDiscard.removeCard();
    assertEquals(0,testDiscard.countCards());
  }  

  @Test
  public void inPlayCanRemoveCard(){
    testInPlay.addCard(testCard1);
    testInPlay.removeCard();
    assertEquals(0,testInPlay.countCards());
  }




}