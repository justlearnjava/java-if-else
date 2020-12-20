package com.example.comparison;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OperatorsTest {

  private Operators operators;

  @BeforeEach
  public void setUp() {
    operators = new Operators();
  }

  @Test
  void compareEquals() {
    assertTrue(operators.compareAEqualsB(10, 10));
    assertFalse(operators.compareAEqualsB(10, 9));
    assertFalse(operators.compareAEqualsB(9, 10));
  }

  @Test
  void compareNotEquals() {
    assertFalse(operators.compareANotEqualsB(10, 10));
    assertTrue(operators.compareANotEqualsB(10, 9));
    assertTrue(operators.compareANotEqualsB(9, 10));
  }

  @Test
  void compareGreaterThan() {
    assertFalse(operators.compareAGreaterThanB(10, 10));
    assertTrue(operators.compareAGreaterThanB(10, 9));
    assertFalse(operators.compareAGreaterThanB(9, 10));
  }

  @Test
  void compareGreaterThanOrEqualTo() {
    assertTrue(operators.compareAGreaterThanOrEqualToB(10, 10));
    assertTrue(operators.compareAGreaterThanOrEqualToB(10, 9));
    assertFalse(operators.compareAGreaterThanOrEqualToB(9, 10));
  }

  @Test
  void compareLessThan() {
    assertFalse(operators.compareALessThanB(10, 10));
    assertFalse(operators.compareALessThanB(10, 9));
    assertTrue(operators.compareALessThanB(9, 10));
  }

  @Test
  void compareLessThanOrEqualTo() {
    assertTrue(operators.compareALessThanOrEqualToB(10, 10));
    assertFalse(operators.compareALessThanOrEqualToB(10, 9));
    assertTrue(operators.compareALessThanOrEqualToB(9, 10));
  }
}