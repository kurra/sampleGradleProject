package com.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class SampleTest {

  @Test
  public void test() {

    final Sample underTest = new Sample("Sample");

    assertNotNull(underTest);
    assertEquals("Sample", underTest.getValue());
    underTest.setValue("SampleOther");
    assertEquals("SampleOther", underTest.getValue());
  }

}