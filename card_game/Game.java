package card_game;

import java.util.*;

public class Game {

  Dealer dealer;
  ArrayList<Player> players;
  // public CardCollection cardsInPlay;


public Game(Dealer dealer) {
  this.dealer = dealer;
  this.players = new ArrayList<Player>();
  // this.cardsInPlay = cardsInPlay;
}

public int countPlayers(){
  return players.size();
}

public void addPlayer(Player player){
  players.add(player);
}

// public void playTurn(Player player){
//   Card cardPlayed = player.cardsHeld.removeCard();
//   cardsInPlay.addCard(cardPlayed);
// }

public String checkSimpleWinner(){
  int player1Score = players.get(0).totalScore();
  int player2Score = players.get(1).totalScore();
  if (player1Score > player2Score){
  return "Player 1 wins!";
}
  else if (player1Score < player2Score){
  return "Player 2 wins!";
}
  else if (player1Score == player2Score){
  return "Draw!";
}
  else {
    return "Something's gone wrong...";
  }
}




}