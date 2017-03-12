package card_game;

import java.util.*;

public class CardCollection{

  ArrayList<Card> cards;

  public CardCollection(){
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

  

}