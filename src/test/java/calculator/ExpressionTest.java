package calculator;

import calculator.model.Expression;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ExpressionTest {
  
  public ExpressionTest() {
  }
 
  @Test
  public void tesAdd1() {
    Expression ex = new Expression("23 + 27");
    assertThat(ex.evaluate(), is(50.0));
  }
  
  @Test
  @Ignore
  public void testSin90() {
    fail("Not Yet Implemented");
  }

   
}
