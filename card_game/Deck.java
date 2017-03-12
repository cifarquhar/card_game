package card_game;

import java.util.*;

public class Deck implements CardCollection{
  
  ArrayList<Card> cards;

  public Deck(){
    this.cards = new ArrayList<Card>();
  }

  public int countCards(){
    return this.cards.size();
  }

  public void addCard(Card card){
    this.cards.add(card);
  }

  public Card removeCard(){
    if (countCards() > 0){
      return cards.remove(0);
    }
    return null;
  }

  // public void shuffle(){
  //   Collections.shuffle(this.cards);
  // }


}