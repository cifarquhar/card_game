package card_game;

import java.util.*;

public class Dealer{

  public CardCollection deck;

  public Dealer(CardCollection deck){
    this.deck = deck;
  }

  public void dealToPlayer(Player player){
    Card cardToDeal = deck.removeCard();
    player.cardsHeld.addCard(cardToDeal);
  }



}