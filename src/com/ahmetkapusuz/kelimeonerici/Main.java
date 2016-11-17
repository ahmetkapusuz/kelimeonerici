package com.ahmetkapusuz.kelimeonerici;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		KelimeOnerici ko = new KelimeOnerici();
		String word = (String)args[0];
		
		List<String> suggestedWords = ko.suggestWords(word);
		System.out.println("Whole word: " + Arrays.toString(suggestedWords.toArray()));
		
		suggestedWords = ko.suggestWordsStartsWith(word);
		System.out.println("Starts with: " + Arrays.toString(suggestedWords.toArray()));
		
		suggestedWords = ko.suggestWordsContains(word);
		System.out.println("Contains: " + Arrays.toString(suggestedWords.toArray()));
		
	}

}
