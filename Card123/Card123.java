import java.*;
import java.util.*;

public class Card123 {
  public static void main(String args[]) {
    Card cardsArray[] = new Card[3];
    cardsArray[0] = new Card(1, "One");
    cardsArray[1] = new Card(2, "Two");
    cardsArray[2] = new Card(3, "Three");
    int totalSpellingLength = 0;
    for(Card card : cardsArray) {
      totalSpellingLength = totalSpellingLength + card.getSpelling().length();
    }
    System.out.println(totalSpellingLength);
    printArray(cardsArray);
    swap(cardsArray, 1, 2);
    printArray(cardsArray);
  }

  public static void swap(Card cardsArray[], int i, int j) {
    Card tmp = cardsArray[i];
    cardsArray[i] = cardsArray[j];
    cardsArray[j] = tmp;
  }

  public static void printArray(Card cardsArray[]) {
    for(Card i : cardsArray) {
      System.out.println(i);
    }
  }

}
