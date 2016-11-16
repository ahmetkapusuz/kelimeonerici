package com.ahmetkapusuz.kelimeonerici;


import java.util.ArrayList;
import java.util.Scanner;

public class KelimeOnerici {

	private ArrayList<String> suggestedWordList;
	private String trFilePath = "word_list_tr.txt";
	private String enFilePath = "word_list_en.txt";
	private Scanner scannerTr;
	private Scanner scannerEn;

	public KelimeOnerici() {

	}

	public ArrayList<String> suggestWord(String word) {

		scannerTr = new Scanner(getClass().getResourceAsStream("/" + trFilePath), "UTF-8");
		scannerEn = new Scanner(getClass().getResourceAsStream("/" + enFilePath));

		while (scannerTr.hasNextLine()) {
			String trLineFromFile = scannerTr.nextLine();
			String enLineFromFile = scannerEn.nextLine();
//				if (enLineFromFile.contains(word)) {
//					// a match!
//					System.out.println("En file:  " + word + " -  Tr File: " + trLineFromFile);
//					break;
//				}
			if (enLineFromFile.equals(word)) {
				System.out.println("En file:  " + word + " -  Tr File: " + trLineFromFile);
				break;
			}
		}

		return suggestedWordList;

	}

}
