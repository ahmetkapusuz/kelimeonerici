package com.ahmetkapusuz.kelimeonerici;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KelimeOnerici {

	private ArrayList<String> suggestedWordList;
	private String trFilePath = "res\\word_list_tr.txt";
	private String enFilePath = "res\\word_list_en.txt";

	public KelimeOnerici() {

	}

	public ArrayList<String> suggestWord(String word) {
		String suggestedWord;

		File trFile = new File(trFilePath);
		File enFile = new File(enFilePath);

		Scanner scannerTr;
		Scanner scannerEn;
		try {
			scannerTr = new Scanner(trFile, "UTF-8");
			scannerEn = new Scanner(enFile);

			while (scannerTr.hasNextLine()) {
				String trLineFromFile = scannerTr.nextLine();
				String enLineFromFile = scannerEn.nextLine();
//				if (enLineFromFile.contains(word)) {
//					// a match!
//					System.out.println("En file:  " + word + " -  Tr File: " + trLineFromFile);
//					break;
//				}
				if (enLineFromFile.equals(word)) {
					// a match!
					System.out.println("En file:  " + word + " -  Tr File: " + trLineFromFile);
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return suggestedWordList;

	}

}
