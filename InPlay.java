import java.util.*;

public class InPlay implements CardCollection{
  

  ArrayList<Card> cards;

  public InPlay(){
    this.cards = new ArrayList<Card>();
  }

  public int countCards(){
    return this.cards.size();
  }

}