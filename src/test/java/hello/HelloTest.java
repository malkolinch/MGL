package hello;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class HelloTest {

  Hello hello;

  @Before
  public void setup() {
    hello = new Hello();
  }

  @Test
  public void check() {
    assertThat(hello.hello("Julien"))
      .isNotEmpty()
      .contains("Hello")
      .endsWith("!")
      .isEqualTo("Hello Julien!");
  }

  //@Test
 /* public void check_null() {
	try {
		hello.hello(null);
		fail(“booo”);
	} catch (Throwable t) {
	}
}*/

}
