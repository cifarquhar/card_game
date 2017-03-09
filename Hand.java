import java.util.*;

public class Hand implements CardCollection{
  
  ArrayList<Card> cards;

  public Hand(){
    this.cards = new ArrayList<Card>();
  }

  public int countCards(){
    return this.cards.size();
  }



}