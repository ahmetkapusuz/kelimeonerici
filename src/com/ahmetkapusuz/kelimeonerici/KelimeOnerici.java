package com.ahmetkapusuz.kelimeonerici;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Kelime Onerici is created to suggest words which have Turkish Characters 
 * when get a Turkish word without Turkish characters as an input.
 * 
 * @author Ahmet Kapusuz
 *
 */
public class KelimeOnerici {

	// Word list to return
	private ArrayList<String> suggestedWordList;
	
	// Turkish dictionary with Turkish characters
	private String trFilePath = "word_list_tr.txt";
	
	// Turkish dictionary without Turkish characters
	private String enFilePath = "word_list_en.txt";
	private Scanner scannerTr;
	private Scanner scannerEn;

	public KelimeOnerici() {
		
	}

	/**
	 * Suggest words that has a full match
	 * 
	 * @param word Word without Turkish characters
	 * @return List of the words
	 */
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
	
	/**
	 * Suggest words that starts with the given input word
	 * 
	 * @param word Word without Turkish characters
	 * @return List of the words
	 */
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
	
	/**
	 * Suggest words that contains the given word
	 * 
	 * @param word Word without Turkish characters
	 * @return List of the words
	 */
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
