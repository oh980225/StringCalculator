package com.osj.calculator.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

class StringCalculatorTest {
  @Test
  void addNumbers_null() {
    StringCalculator calculator = new StringCalculator();

    var actual = calculator.addNumbers(null);
    assertThat(actual, is(0));
  }

  @Test
  void addNumbers_empty() {
    StringCalculator calculator = new StringCalculator();

    var actual = calculator.addNumbers("");
    assertThat(actual, is(0));
  }

  @Test
  void addNumbers_one_number() {
    StringCalculator calculator = new StringCalculator();

    var actual = calculator.addNumbers("5");
    assertThat(actual, is(5));
  }

  @Test
  void addNumbers_have_comma() {
    StringCalculator calculator = new StringCalculator();

    var actual = calculator.addNumbers("1,4");
    assertThat(actual, is(5));
  }

  @Test
  void addNumbers_have_colon() {
    StringCalculator calculator = new StringCalculator();

    var actual = calculator.addNumbers("1:4");
    assertThat(actual, is(5));
  }

  @Test
  void addNumbers_have_comma_and_colon() {
    StringCalculator calculator = new StringCalculator();

    var actual = calculator.addNumbers("1:2,2");
    assertThat(actual, is(5));
  }
}