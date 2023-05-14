public class ExtractSpecialChars {
    public static void main(String[] args){
        ExtractSpecialChars e = new ExtractSpecialChars();
        System.out.println(e.RemoveSpecialChars("*#%B_+i$ndu!~~  Na (ma)na"));

    }
    public String RemoveSpecialChars(String s){
        StringBuilder newString = new StringBuilder();
        for(int i = 0; i <s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)) == true){
                newString.append(s.charAt(i));
            }
        }
        return newString.toString();
    }
}
