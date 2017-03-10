package card_game;

import java.util.*;

public interface CardCollection{
  
  public int countCards();

  public void addCard(Card card);

  public Card removeCard();

  public ArrayList<Card> shuffle();

}