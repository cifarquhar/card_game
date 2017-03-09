import java.util.*;

public class Discard implements CardCollection{
  
  ArrayList<Card> cards;

  public Discard(){
    this.cards = new ArrayList<Card>();
  }

  public int countCards(){
    return this.cards.size();
  }

  public void addCard(Card card){
    this.cards.add(card);
  }

}