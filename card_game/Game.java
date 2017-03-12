package card_game;

import java.util.*;

public class Game {

  Dealer dealer;
  ArrayList<Player> players;
  CardCollection cardsInPlay;


public Game(Dealer dealer, CardCollection cardsInPlay) {
  this.dealer = dealer;
  this.players = new ArrayList<Player>();
  this.cardsInPlay = cardsInPlay;
}

public int countPlayers(){
  return players.size();
}

public void addPlayer(Player player){
  players.add(player);
}

public void playTurn(Player player){
  Card cardPlayed = player.cardsHeld.removeCard();
  cardsInPlay.addCard(cardPlayed);
}




}