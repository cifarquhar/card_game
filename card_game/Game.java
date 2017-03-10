package card_game;

import java.util.*;

public class Game {

  Dealer dealer;
  ArrayList<Player> players;


public Game(Dealer dealer) {
  this.dealer = dealer;
  this.players = new ArrayList<Player>();
}

public int countPlayers(){
  return players.size();
}

public void addPlayer(Player player){
  players.add(player);
}




}