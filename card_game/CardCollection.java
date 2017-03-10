package card_game;

public interface CardCollection{
  
  public int countCards();

  public void addCard(Card card);

  public Card removeCard();

}