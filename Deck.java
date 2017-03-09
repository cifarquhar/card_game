import java.util.*;

public class Deck implements CardCollection{
  
  ArrayList<Card> cards;

  public Deck(){
    this.cards = new ArrayList<Card>();
  }

  public int countCards(){
    return this.cards.size();
  }


}