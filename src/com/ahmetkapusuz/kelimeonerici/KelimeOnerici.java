package com.ahmetkapusuz.kelimeonerici;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KelimeOnerici {

	private ArrayList<String> suggestedWordList;
	private String trFilePath = "word_list_tr.txt";
	private String enFilePath = "word_list_en.txt";
	private Scanner scannerTr;
	private Scanner scannerEn;

	public KelimeOnerici() {
		
	}

	public List<String> suggestWords(String word) {
		suggestedWordList = new ArrayList<>();
		scannerTr = new Scanner(getClass().getResourceAsStream("/" + trFilePath), "UTF-8");
		scannerEn = new Scanner(getClass().getResourceAsStream("/" + enFilePath));

		while (scannerTr.hasNextLine()) {
			String trLineFromFile = scannerTr.nextLine();
			String enLineFromFile = scannerEn.nextLine();
			if (enLineFromFile.equals(word)) {
				//System.out.println("En file:  " + word + " -  Tr File: " + trLineFromFile);
				suggestedWordList.add(trLineFromFile);
			}
		}
		
		scannerTr.close();
		scannerEn.close();

		return suggestedWordList;

	}
	
	public List<String> suggestWordsStartsWith(String word) {
		suggestedWordList = new ArrayList<>();
		scannerTr = new Scanner(getClass().getResourceAsStream("/" + trFilePath), "UTF-8");
		scannerEn = new Scanner(getClass().getResourceAsStream("/" + enFilePath));

		while (scannerTr.hasNextLine()) {
			String trLineFromFile = scannerTr.nextLine();
			String enLineFromFile = scannerEn.nextLine();
			if (enLineFromFile.startsWith(word)) {
				//System.out.println("En file:  " + word + " -  Tr File: " + trLineFromFile);
				suggestedWordList.add(trLineFromFile);
			}
		}
		
		scannerTr.close();
		scannerEn.close();

		return suggestedWordList;

	}
	
	public List<String> suggestWordsContains(String word) {
		suggestedWordList = new ArrayList<>();
		scannerTr = new Scanner(getClass().getResourceAsStream("/" + trFilePath), "UTF-8");
		scannerEn = new Scanner(getClass().getResourceAsStream("/" + enFilePath));

		while (scannerTr.hasNextLine()) {
			String trLineFromFile = scannerTr.nextLine();
			String enLineFromFile = scannerEn.nextLine();
			if (enLineFromFile.contains(word)) {
				//System.out.println("En file:  " + word + " -  Tr File: " + trLineFromFile);
				suggestedWordList.add(trLineFromFile);
			}
		}
		
		scannerTr.close();
		scannerEn.close();

		return suggestedWordList;

	}

}
