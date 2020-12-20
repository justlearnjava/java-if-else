package com.example.ifelse;

import java.util.Random;

public class If {
  private static final System.Logger logger = System.getLogger(If.class.getName());

  public static void main(final String[] args) {
    // Generate a random int between zero and 9 (upper bound exclusive)
    int randomInt = new Random().nextInt(10);

    // Ex #1: Set favorite number between zero and nine
    int favoriteNumber = 5;

    // Ex #1: If the random int is favorite number
    if (randomInt == favoriteNumber) {
      // Ex #1: Then log INFO message "YAY: " + randomInt
      logger.log(System.Logger.Level.INFO, "HORRAY: " + randomInt);
    }
  }
}
