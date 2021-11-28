package com.osj.calculator.domain;

final class Positive {
  private int number;

  Positive(String stringNumber) {
    this(Integer.parseInt(stringNumber));
  }

  Positive(int number) {
    if (number < 0) {
      throw new RuntimeException("음수는 허용되지 않습니다.");
    }

    this.number = number;
  }

  int getNumber() {
    return number;
  }
}
