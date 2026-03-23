package inner;

public class Analysis {

	public static void analyseText(String text) {
		class TextStatistic{
			public int getNumOfWords() {
				int words = 1;
				for(Character c : text.toCharArray()) {
					if(c.equals(' ')) {
						words++;
					}
				}
				return words;
			}
			
			public int getNumOfCharacters() {
				int chars = 0;
				for (Character c : text.toCharArray()) {
					if(!c.equals(' ')) {
						chars++;
					}
				}
				return chars;
			}
		}
		TextStatistic ts = new TextStatistic();
		System.out.println("Wörter: " + ts.getNumOfWords());
		System.out.println("Zeichen: " + ts.getNumOfCharacters());
	}
	public static void main(String[] args) {
		analyseText("HTL-Schüler lernen Java");
	}

}
