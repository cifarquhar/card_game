package card_game;

import java.util.*;

public class Player{

  String name;
  public CardCollection cardsHeld;
  public int score;

  public Player(String name, CardCollection hand){
    this.name = name;
    this.cardsHeld = hand;
    this.score = 0;
  }

  public String getName(){
    return this.name;
  }

  public int totalScore(){
    for (int i = 0; i < cardsHeld.countCards(); i++){
      score = score + cardsHeld.cards.get(i).value;
    }
    return score;
  }

}