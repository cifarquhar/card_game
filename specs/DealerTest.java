import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DealerTest{

  CardCollection testDeck;
  Dealer dealer;
  Card testCard1;
  Card testCard2;

  @Before
  public void before(){
    testDeck = new Deck();
    dealer = new Dealer(testDeck);
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


}