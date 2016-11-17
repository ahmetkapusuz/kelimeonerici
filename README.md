# kelimeonerici

This library is created to suggest Turkish words to the words which are written without Turkish characters.

For example if the input is "cocuk", then output will be "çocuk".

Sample call:

```java
KelimeOnerici ko = new KelimeOnerici();
String word = (String)args[0];
		
List<String> suggestedWords = ko.suggestWords(word);
System.out.println("Whole word: " + Arrays.toString(suggestedWords.toArray()));
		
suggestedWords = ko.suggestWordsStartsWith(word);
System.out.println("Starts with: " + Arrays.toString(suggestedWords.toArray()));
		
suggestedWords = ko.suggestWordsContains(word);
System.out.println("Contains: " + Arrays.toString(suggestedWords.toArray()));
```
