public class WordCount {
    public static int countWords(String sentence) {
		int spaceCount = 0;
        int len = sentence.length();
        for (int i = 0; i < len; i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }
    public static void main(String[] args) {
        System.out.println(countWords("all is well"));
    }
}
