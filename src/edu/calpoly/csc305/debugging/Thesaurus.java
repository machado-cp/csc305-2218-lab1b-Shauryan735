package edu.calpoly.csc305.debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Thesaurus {
  private Map<String, List<String>> synonyms;

  public Thesaurus() {
    synonyms = new HashMap<>();
  }

  /**
   *  Adds alternative words to the key word.
   */
  public void addAlternatives(String word, String ... alternatives) {
    List<String> tempList;
    if (synonyms.isEmpty() || synonyms.get(word) == null) {
      tempList = new LinkedList<>(Arrays.asList(alternatives));
      synonyms.put(word, tempList);
    } else {
      tempList = synonyms.get(word);
      for (String alt : Arrays.asList(alternatives)) {
        tempList.add(alt);
      }
      synonyms.put(word, tempList);
    }
  }

  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
