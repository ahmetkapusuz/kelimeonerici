# kelimeonerici

This library takes Turkish words without any Turkish special character and returns the word with Turkish characters.

Sample call 

    		KelimeOnerici ko = new KelimeOnerici();
		String word = "cocuk";
		String suggestedWord = ko.suggestWord(word);
    		System.out.println(suggestedWord);

Prints : çocuk
