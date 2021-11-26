package com.osj.calculator.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class InputExistConditionTest {
  @Test
  void check_null() {
    InputExistCondition condition = new InputExistCondition();
    assertThat(condition.check(null), is(false));
  }

  @Test
  void check_empty() {
    InputExistCondition condition = new InputExistCondition();
    assertThat(condition.check(""), is(false));
  }

  @Test
  void check_blank() {
    InputExistCondition condition = new InputExistCondition();
    assertThat(condition.check("   "), is(false));
  }
}