package edu.cnm.deepdive.diceware.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import javax.print.DocFlavor.SERVICE_FORMATTED;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DicewareGenerator implements PassphraseGenerator {


  private final Random rng;
  private final List<String> words;

@Autowired
  public DicewareGenerator(Random rng, WordProvider provider){
    this.rng = rng;
    words =  new ArrayList<>((provider.getWords()));
  }

  @Override
  public String[] generate(int length) {
 return IntStream
     .generate(()-> rng.nextInt(words.size()))
     .limit(length)
     .mapToObj((position)-> words.get(position))
     .toArray((size) -> new String[size]);

  }
}
