import java.*;
import java.util.*;

public class Card {
  public static void main(String args[]) {
    Map<Integer, String> cards = new HashMap<Integer, String>() {{
      put(1, "One");
      put(2, "Two");
      put(3, "Three");
    }};
    int cardsArray[] = new int[3];
    cardsArray[0] = 1;
    cardsArray[1] = 2;
    cardsArray[2] = 3;
    printArray(cardsArray);
    swap(cardsArray, 1, 2);
    printArray(cardsArray);
  }

  public static void swap(int cardsArray[], int i, int j) {
    int tmp = cardsArray[i];
    cardsArray[i] = cardsArray[j];
    cardsArray[j] = tmp;
  }

  public static void printArray(int cardsArray[]) {
    for(int i : cardsArray) {
      System.out.println(i);
    }
  }

}
