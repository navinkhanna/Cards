public class Card {
  int value;
  String spelling;

  public Card(int value, String spelling) {
    this.value = value;
    this.spelling = spelling;
  }

  public String getSpelling() {
    return spelling;
  }

  public int getValue() {
    return value;
  }

  public String toString() {
    return value + " " + spelling;
  }

}
