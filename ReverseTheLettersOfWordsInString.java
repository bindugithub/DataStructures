public class ReverseTheLettersOfWordsInString {
    public static void main(String[] args){
        ReverseTheLettersOfWordsInString rw = new ReverseTheLettersOfWordsInString();
        System.out.println(rw.reverseLettersOfWords("Whisky is a cutie"));

    }

    public String reverseLettersOfWords(String sen){
        StringBuilder result = new StringBuilder();
        String[] words = sen.split(" ");
        for(String s: words){
            for(int i=s.length()-1; i>=0; i--){
                result.append(s.charAt(i));
            }
            result.append(" ");
        }
        return result.toString();
    }

}
