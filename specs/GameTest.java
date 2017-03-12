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
  Card testCard6;
  // CardCollection testInPlay;

  @Before
  public void before(){
    testDeck = new CardCollection();
    testPlayer1Hand = new CardCollection();
    testPlayer2Hand = new CardCollection();
    testDealer = new Dealer(testDeck);
    testPlayer1 = new Player("Player 1",testPlayer1Hand);
    testPlayer2 = new Player("Player 2",testPlayer2Hand);
    // testInPlay = new InPlay();
    testGame = new Game(testDealer);
    testCard1 = new Card(CardSuit.HEARTS,5);
    testCard2 = new Card(CardSuit.CLUBS,13);
    testCard3 = new Card(CardSuit.SPADES,2);
    testCard4 = new Card(CardSuit.DIAMONDS,1);
    testCard5 = new Card(CardSuit.CLUBS,9);
    testCard6 = new Card(CardSuit.DIAMONDS,11);
  }

  @Test
  public void canCountPlayers(){
    assertEquals(0,testGame.countPlayers());
  }

  @Test
  public void canAddPlayerToGame(){
    testGame.addPlayer(testPlayer1);
    testGame.addPlayer(testPlayer2);
    assertEquals(2,testGame.countPlayers());
  }

  // @Test
  // public void canPlayTurn(){
  //   testDeck.addCard(testCard1);
  //   testDeck.addCard(testCard2);
  //   testGame.addPlayer(testPlayer1);
  //   testDealer.dealToPlayer(testPlayer1);
  //   testGame.playTurn(testPlayer1);
  //   assertEquals(1,testInPlay.countCards());
  // }

  @Test
  public void canCheckSimpleWinner(){
    testDeck.addCard(testCard1);
    testDeck.addCard(testCard2);
    testGame.addPlayer(testPlayer1);
    testGame.addPlayer(testPlayer2);
    testDealer.dealToPlayer(testPlayer1);
    testDealer.dealToPlayer(testPlayer2);
    // testGame.playTurn(testPlayer1);
    // testGame.playTurn(testPlayer2);
    // System.out.println(testPlayer1.cardsHeld);
    assertEquals("Player 2 wins!",testGame.checkSimpleWinner());
  }

  // @Test
  // public void canCheckComplexWinner(){
  //   testDeck.addCard(testCard1);
  //   testDeck.addCard(testCard2);
  //   testDeck.addCard(testCard3);
  //   testDeck.addCard(testCard4);
  //   testDealer.dealToPlayer(testPlayer1);
  //   testDealer.dealToPlayer(testPlayer2);
  //   testDealer.dealToPlayer(testPlayer1);
  //   testDealer.dealToPlayer(testPlayer2);
  //   assertEquals("Player 2 wins!",testGame.checkComplexWinner());
  // }


}