package card_game;

public class Card{

  CardSuit suit;
  int value;


  public Card(CardSuit suit, int value){
    this.suit = suit;
    this.value = value;
  }

  public CardSuit getSuit(){
    return this.suit;
  }

  public int getValue(){
    return this.value;
  }

}