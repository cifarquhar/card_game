package card_game;

import java.util.*;

public class Player{

  String name;
  CardCollection cardsHeld;

  public Player(String name, CardCollection hand){
    this.name = name;
    this.cardsHeld = hand;
  }

  public String getName(){
    return this.name;
  }

}