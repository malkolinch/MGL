package fr.insalyon.telecom.mgl;

import org.junit.*;
import org.junit.runner.*;
import org.junit.experimental.theories.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

//@RunWith(Theories.class)
public class RomanNumberConverterTest {

  RomanNumberConverter romanNumberConverter;

 /* @DataPoints
  public final static int[] integers={1, 5, 10, 50, 100, 500, 1000};
  
  @DataPoints
  public final static String[] stringers={"I", "V", "X", "L", "C", "D", "M"};
  */
  @Before
  public void setup() {
    romanNumberConverter = new RomanNumberConverter();
  }

  @Test
  public void check() {
    assertThat(romanNumberConverter.convert(10))
      .isNotEmpty()
      .isEqualTo("X")
  }
  
  @Test
  public void checkNegative() {
    try {
		romanNumberConverter.convert(-10);
	} catch (Throwable t) {
	}
  }
  


}

