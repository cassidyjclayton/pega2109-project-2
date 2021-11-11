package primary;

public class Q18Subclass extends Q18Superclass {

  public boolean hasUppercaseLetter(StringBuffers) {

    char[] characters = s.toCharArray();

    for(char c : characters) {
      int numerical = (int) c;
      if (numerical >= 65 &&  numerical <= 90)
        return true;
    }
    return false

  }

  publicString toUpperCase(String s){
    char[] characters = s.toCharArray();
    int total = 0;

    for (char c : characters){
      total += (int)c;
    }
    return total + 10;
  }
}
