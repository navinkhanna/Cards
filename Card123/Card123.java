import java.*;
import java.util.*;

public class Card123 {
  public static void main(String args[]) {
    Card cards[] = new Card[3];
    cards[0] = new Card(1, "One");
    cards[1] = new Card(2, "Two");
    cards[2] = new Card(3, "Three");
    int currentPosition = 0;
    int x = 0;
    for(Card currentCard : cards) {
      x = getCurrentSwapPosition(x, currentCard, cards);
      x++;
      System.out.println("Swap position" + x);
    }
    // printCards(cards);
    // swap(cards, 1, 2);
  }

  public static void swap(Card cards[], int i, int j) {
    Card tmp = cards[i];
    cards[i] = cards[j];
    cards[j] = tmp;
  }

  public static void printCards(Card cards[]) {
    for(Card card : cards) {
      System.out.println(card);
    }
  }

  public static int getCurrentSwapPosition(int currentPosition, Card currentCard, Card[] cardsArray) {
    System.out.println(currentCard);
    String currentCardSpelling = currentCard.getSpelling();
    int position = currentPosition;
    int spellingLength = currentCard.getSpelling().length();
    while(spellingLength>0) {
      System.out.println(currentCardSpelling.charAt(currentCardSpelling.length() - spellingLength) + " " + position);
      if (currentCard.getValue() >= cardsArray[position%cardsArray.length].getValue()) {
      }
      spellingLength--;
      position++;
    }
    return position%cardsArray.length;
  }

}
