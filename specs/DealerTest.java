import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DealerTest{

  CardCollection testDeck;
  Dealer dealer;
  CardCollection playerHand;
  Player testPlayer;
  Card testCard1;
  Card testCard2;
  Card testCard3;
  Card testCard4;
  Card testCard5;
  Card testCard6;

  @Before
  public void before(){
    testDeck = new CardCollection();
    dealer = new Dealer(testDeck);
    playerHand = new CardCollection();
    testPlayer = new Player("Colin",playerHand);
    testCard1 = new Card(CardSuit.HEARTS,5);
    testCard2 = new Card(CardSuit.CLUBS,13);
    testCard3 = new Card(CardSuit.SPADES,2);
    testCard4 = new Card(CardSuit.DIAMONDS,1);
    testCard5 = new Card(CardSuit.CLUBS,9);
    testCard6 = new Card(CardSuit.DIAMONDS,11);
  }

  @Test
  public void dealerHasDeck(){
    assertNotNull(dealer.deck);
  }

  @Test
  public void canAddCardToDealerDeck(){
    dealer.deck.addCard(testCard1);
    assertEquals(1,dealer.deck.countCards());
  }

  @Test
  public void canRemoveCardFromDealerDeck(){
    dealer.deck.addCard(testCard1);
    dealer.deck.removeCard();
    assertEquals(0,dealer.deck.countCards());
  }

  @Test
  public void canDealCardToPlayer(){
    dealer.deck.addCard(testCard1);
    dealer.deck.addCard(testCard2);
    dealer.dealToPlayer(testPlayer);
    assertEquals(1,dealer.deck.countCards());
    assertEquals(1,testPlayer.cardsHeld.countCards());
  }

  // @Test
  // public void canDealRandomCardToPlayer(){
  //   dealer.deck.addCard(testCard1);
  //   dealer.deck.addCard(testCard2);
  //   dealer.deck.addCard(testCard3);
  //   dealer.deck.addCard(testCard4);
  //   dealer.deck.addCard(testCard5);
  //   dealer.deck.addCard(testCard6);
  //   dealer.dealRandomToPlayer(testPlayer);
  //   assertFalse(dealer.deck.contain(testPlayer.cardsHeld(0)));
  // }



}