import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAsgA0154 {
  @Test
  public void test_01() {
    AsgA0154 obj = new AsgA0154();
    String temp = obj.rotate_string("abhi");
    assertEquals(temp, "iabh");
  }

  @Test
  public void test_02() {
    AsgA0154 obj = new AsgA0154();
    String temp = obj.rotate_string("hello");
    assertEquals(temp, "ohell");
  }
}
