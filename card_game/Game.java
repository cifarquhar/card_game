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

public String checkWinner(){
  int player1Score = players.get(0).cardsHeld.get(0).value();
  int player2Score = players.get(1).cardsHeld.get(0).value;
}




//   if (cardsInPlay.cards(0).value > cardsInPlay.cards(1).value){
//   return "Player 1 wins!";
// }
//   else if (cardsInPlay.cards(0).value < cardsInPlay.cards(1).value){
//   return "Player 2 wins!";
// }
//   else if (cardsInPlay.cards(0).value == cardsInPlay.cards(1).value){
//   return "Draw!";
// }
//   else {
//     return "Something's gone wrong...";
//   }
// }




}