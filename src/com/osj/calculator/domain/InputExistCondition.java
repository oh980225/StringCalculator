package com.osj.calculator.domain;

final class InputExistCondition {
  boolean check(String input) {
    if (input == null) {
      return false;
    }

    return !input.isBlank();
  }
}
