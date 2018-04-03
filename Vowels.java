public class Vowels {
  public static int numOfVowels(String aString) {

    if (aString == null || aString.length() == 0) {
      return 0;
    }
    if (aString.length() == 1) {
      String lowerCaseStr = aString.toLowerCase();
      if(lowerCaseStr.equals("a") ||lowerCaseStr.equals("e") ||lowerCaseStr.equals("i") ||
          lowerCaseStr.equals("o") ||lowerCaseStr.equals("u")) {
        return 1;
      }
      else {
        return 0;
      }
    }
    return numOfVowels(aString.substring(aString.length() - 1)) +
            numOfVowels(aString.substring(0, aString.length() - 1));
  }
}
