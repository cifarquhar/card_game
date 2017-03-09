import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest{

  Player player1;

  @Before
  public void before(){
    player1 = new Player("Colin");
  }

  @Test
  public void playerHasName(){
    assertEquals("Colin",player1.getName());
  }



}