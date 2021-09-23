package edu.calpoly.csc305.debugging;

public class DebuggerMain {
  /**
   * Main method for debugging Thesaurus Class.
   */
  public static void main(String[] args) {
    Thesaurus thesaurus = new Thesaurus();
    String testword = "interesting";

    thesaurus.addAlternatives(testword,
         "absorbing", "consuming", "engaging", "fascinating");

    thesaurus.addAlternatives(testword, "testing", "testing2");

    System.out.println(thesaurus.alternatives(testword));
  }
}
