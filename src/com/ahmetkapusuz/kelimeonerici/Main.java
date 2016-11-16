package com.ahmetkapusuz.kelimeonerici;

public class Main {
	
	public static void main(String[] args) {
		
		KelimeOnerici ko = new KelimeOnerici();
		String word = (String)args[0];
		ko.suggestWord(word);
		
	}

}
