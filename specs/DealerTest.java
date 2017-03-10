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

  @Before
  public void before(){
    testDeck = new Deck();
    dealer = new Dealer(testDeck);
    playerHand = new Hand();
    testPlayer = new Player("Colin",playerHand);
    testCard1 = new Card(CardSuit.HEARTS,5);
    testCard2 = new Card(CardSuit.CLUBS,13);
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


}