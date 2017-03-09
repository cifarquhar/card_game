import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest{

  Player player1;
  Hand player1Hand;

  @Before
  public void before(){
    player1Hand = new Hand();
    player1 = new Player("Colin",player1Hand);
  }

  @Test
  public void playerHasName(){
    assertEquals("Colin",player1.getName());
  }



}