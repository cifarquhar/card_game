import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest{

  Player player1;
  CardCollection player1Hand;
  Card testCard1;
  Card testCard2;
  Card testCard3;
  Card testCard4;
  


  @Before
  public void before(){
    player1Hand = new CardCollection();
    player1 = new Player("Player1",player1Hand);
    testCard1 = new Card(CardSuit.HEARTS,5);
    testCard2 = new Card(CardSuit.CLUBS,13);
    testCard3 = new Card(CardSuit.SPADES,2);
    testCard4 = new Card(CardSuit.DIAMONDS,1);
   
  }

  @Test
  public void playerHasName(){
    assertEquals("Player1",player1.getName());
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

  @Test
  public void canCheckInitialScoreZero(){
    assertEquals(0,player1.score);
  }

  public void canCheckTotalScore(){
    player1Hand.addCard(testCard1);
    player1Hand.addCard(testCard2);
    player1Hand.addCard(testCard3);
    player1Hand.addCard(testCard4);
    player1.totalScore();
    assertEquals(21,player1.score);
  }




}