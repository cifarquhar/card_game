import java.util.*;

public class Discard implements CardCollection{
  
  ArrayList<Card> cards;

  public Discard(){
    this.cards = new ArrayList<Card>();
  }

  public int countCards(){
    return this.cards.size();
  }

}