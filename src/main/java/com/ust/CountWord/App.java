package com.ust.CountWord;

import java.util.HashMap;

public class App

{
	private static CountWord wc;

	public static void main(String[] args) {

		String filename = "Example";
		wc = new CountWord();
		new HashMap<>();
		wc.countWordsFromFile(filename);

	}

}
