package com.ust.CountWord;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CountTest {
	 private CountWord wc;
	  private String text;

	  @Before
	  public void setUp() {
	    wc = new CountWord();
	    text = "In the seven seven eight the the In!";
	  }

	  @Test
	  public void countWordsShouldCountAllWords() {
	    Map<String, Integer> expected = new HashMap<>();
	    expected.put("in", 2);
	    expected.put("the", 3);
	    expected.put("seven", 2);
	    expected.put("eight", 1);
	    assertEquals(expected, wc.countWords(text));
	  }

	  @Test
	  public void countWordsShouldCountThreeMostCommonWords() {
	    Map<String, Integer> expected = new HashMap<>();
	    expected.put("in", 2);
	    expected.put("the", 3);
	    expected.put("seven", 2);
	    assertEquals(expected, wc.countWords(text, 3));
	  }

	  @Test
	  public void countWordFromFileShouldReturnAllWords1() {
	    Map<String, Integer> expected = new HashMap<>();
	    expected.put("in", 2);
	    expected.put("the", 3);
	    expected.put("seven", 2);
	    expected.put("eight", 1);
	    assertEquals(expected, wc.countWordsFromFile("Example"));
	  } 
	  
	  @Test
	  public void countWordFromFileShouldReturnAllWords2() {
	    Map<String, Integer> expected = new HashMap<>();
	    expected.put("in", 2);
	    expected.put("the", 3);
	    expected.put("seven", 2);
	    assertNotEquals(expected, wc.countWordsFromFile("Example"));
	  }
	  @Test
	  public void runCountWordFromFile() {
	    wc.countWordsFromFile("Example");
	  }
	}

