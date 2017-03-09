import java.util.*;

public class Player{

  String name;
  Hand cardsHeld;

  public Player(String name, Hand hand){
    this.name = name;
    this.cardsHeld = hand;
  }

  public String getName(){
    return this.name;
  }

}