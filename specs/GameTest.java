import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class GameTest{

  Game testGame;
  Dealer testDealer;
  ArrayList<Player> players;
  Player testPlayer1;
  Player testPlayer2;
  CardCollection testDeck;
  CardCollection testPlayer1Hand;
  CardCollection testPlayer2Hand;
  Card testCard1;
  Card testCard2;
  Card testCard3;
  Card testCard4;
  Card testCard5;

  @Before
  public void before(){
    testDeck = new Deck();
    testPlayer1Hand = new Hand();
    testPlayer2Hand = new Hand();
    testDealer = new Dealer(testDeck);
    testPlayer1 = new Player("Player 1",testPlayer1Hand);
    testPlayer2 = new Player("Player 2",testPlayer2Hand);
    testGame = new Game(testDealer);
  }

  @Test
  public void canCountPlayers(){
    assertEquals(0,testGame.countPlayers());
  }


}