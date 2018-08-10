package com.sample.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SampleTest {

  @Test
  public void test() {

    final Sample underTest = new Sample("Sample");

    assertNotNull(underTest);
    assertEquals("Sample", underTest.getSample());
    underTest.setSample("SampleOther");
    assertEquals("SampleOther", underTest.getSample());
  }

}