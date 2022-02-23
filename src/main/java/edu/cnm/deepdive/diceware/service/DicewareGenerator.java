package edu.cnm.deepdive.diceware.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DicewareGenerator implements PassphraseGenerator {


  private final Random rng;
  private final List<String> words;


  public DicewareGenerator(Random rng, WordProvider provider){
    this.rng = rng;
    words =  new ArrayList<>((provider.getWords()));
  }

  @Override
  public String[] generate(int length) {
    String[] selection = new String[length];
    for (int i = 0 ; i < selection.length; i++) {
      selection[i] = words.get(rng.nextInt(words.size()));
    }
    return selection;
  }
}
