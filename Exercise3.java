public class Exercise3 {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");
        StringBuilder resultSentence = new StringBuilder();

        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            resultSentence.append(reversedWord).append(" ");
        }
        System.out.println(resultSentence.toString().trim());
    }
}
