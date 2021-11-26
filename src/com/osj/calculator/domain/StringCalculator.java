package com.osj.calculator.domain;

public final class StringCalculator {
  private final InputExistCondition inputExistCondition = new InputExistCondition();

  public int addNumbers(String input) {
    if (!inputExistCondition.check(input)) {
      return 0;
    }

    return sum(toInts(input.split("[,:]")));
  }

  private int sum(int[] numbers) {
    int result = 0;

    for (var number : numbers) {
      result += number;
    }

    return result;
  }

  private int[] toInts(String[] stringNumbers) {
    int[] numbers = new int[stringNumbers.length];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(stringNumbers[i]);
    }

    return numbers;
  }
}
