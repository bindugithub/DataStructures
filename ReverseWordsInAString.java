public class ReverseWordsInAString {
    public static void main(String[] args){
        ReverseWordsInAString rw = new ReverseWordsInAString();
        System.out.println(rw.reverseWordsInString("I'm a QA Engineer"));

    }
    public String reverseWordsInString(String s){
        StringBuilder result = new StringBuilder();
        String[] word = s.split(" ");
           for(int i = word.length-1; i>0; i--){
               result.append(word[i]);
               result.append(" ");
        }
           //System.out.println(word[0]);
           result.append(word[0]);
        return result.toString();
    }
}
