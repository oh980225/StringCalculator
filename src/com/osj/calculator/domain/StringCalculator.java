package com.osj.calculator.domain;

import java.util.Arrays;

public final class StringCalculator {
  private final InputExistCondition inputExistCondition = new InputExistCondition();

  public int addNumbers(String input) {
    if (!inputExistCondition.check(input)) {
      return 0;
    }

    return sum(toInts(input.split("[,:]")));
  }

  private int sum(Positive[] numbers) {
    int result = 0;

    for (var number : numbers) {
      result += number.getNumber();
    }

    return result;
  }

  private Positive[] toInts(String[] stringNumbers) {
    Positive[] numbers = new Positive[stringNumbers.length];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = new Positive(stringNumbers[i]);
    }

    return numbers;
  }
}
