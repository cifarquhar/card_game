import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class CardCollectionTest{

  CardCollection testHand;
  CardCollection testDeck;
  CardCollection testDiscard;
  CardCollection testInPlay;
  Card testCard1;
  Card testCard2;
  Card testCard3;
  Card testCard4;
  Card testCard5;
  Card testCard6;

  @Before
  public void before(){
    testHand = new CardCollection();
    testDeck = new CardCollection();
    testDiscard = new CardCollection();
    testInPlay = new CardCollection();
    testCard1 = new Card(CardSuit.HEARTS,5);
    testCard2 = new Card(CardSuit.CLUBS,13);
    testCard3 = new Card(CardSuit.SPADES,2);
    testCard4 = new Card(CardSuit.DIAMONDS,1);
    testCard5 = new Card(CardSuit.CLUBS,9);
    testCard6 = new Card(CardSuit.DIAMONDS,11);
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

  // @Test
  // public void canShuffle(){
  //   testDeck.addCard(testCard1);
  //   testDeck.addCard(testCard2);
  //   testDeck.addCard(testCard3);
  //   testDeck.addCard(testCard4);
  //   testDeck.addCard(testCard5);
  //   testDeck.addCard(testCard6);
  //   CardCollection originalDeck = testDeck;
  //   testDeck.shuffle();
  //   System.out.println(originalDeck);
  //   System.out.println(testDeck);
  //   assertFalse(originalDeck == testDeck);
  // }




}